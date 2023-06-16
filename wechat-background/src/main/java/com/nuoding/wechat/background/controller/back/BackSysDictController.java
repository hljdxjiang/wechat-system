package com.nuoding.wechat.background.controller.back;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nuoding.wechat.common.constant.SessionKey;
import com.nuoding.wechat.common.entity.back.BackSysDictEntity;
import com.nuoding.wechat.common.enums.RespStatusEnum;
import com.nuoding.wechat.common.interceptor.SessionValue;
import com.nuoding.wechat.common.model.MapResponse;
import com.nuoding.wechat.common.model.PageQueryBaseDTO;
import com.nuoding.wechat.common.service.back.BackSysDictService;
import com.nuoding.wechat.common.utils.PageInfoUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 后管(backSysDict)服务接口
 * 字典表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@SessionValue(values = {SessionKey.LOGIN_KEY})
@RestController
@RequestMapping("/background/backSysDict")
public class BackSysDictController {
    /**
     * 服务对象
     */
    @Resource
    private BackSysDictService backSysDictService;

    /**
     * 分页查询
     *
     * @param backSysDictEntity 筛选条件
     * @param dto             size     分页对象
     * @return 查询结果
     */
    @PostMapping("/queryByPage")
    public MapResponse queryByPage(@RequestBody BackSysDictEntity backSysDictEntity, @RequestBody PageQueryBaseDTO dto) {
        MapResponse mapResponse = new MapResponse();
        PageHelper.startPage(dto.getPage(), dto.getSize());
        List<BackSysDictEntity> list = this.backSysDictService.queryAllByLimit(backSysDictEntity);
        PageInfo pageInfo = new PageInfo(list);
        Map map = PageInfoUtil.parseReturnMap(pageInfo);
        mapResponse.setData(map);
        return mapResponse;
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public MapResponse queryById(@PathVariable("id") Integer id) {
        MapResponse mapResponse = new MapResponse();
        mapResponse.put("data", this.backSysDictService.queryById(id));
        return mapResponse;
    }

    /**
     * 新增数据
     *
     * @param backSysDictEntity 实体
     * @return 新增结果
     */
    @PostMapping("/add")
    public MapResponse add(BackSysDictEntity backSysDictEntity) {
        MapResponse mapResponse = new MapResponse();
        mapResponse.put("data", this.backSysDictService.insert(backSysDictEntity));
        return mapResponse;
    }

    /**
     * 编辑数据
     *
     * @param backSysDictEntity 实体
     * @return 编辑结果
     */
    @PostMapping("/edit")
    public MapResponse edit(BackSysDictEntity backSysDictEntity) {
        MapResponse mapResponse = new MapResponse();
        mapResponse.put("data", this.backSysDictService.update(backSysDictEntity));
        return mapResponse;
    }

    /**
     * 删除数据
     *
     * @param backSysDictEntity 实体
     * @return 删除是否成功
     */
    @PostMapping("/delete")
    public MapResponse deleteById(BackSysDictEntity backSysDictEntity) {

        MapResponse mapResponse = new MapResponse();
        Integer id = backSysDictEntity.getId();
        if (id == null || id == 0) {
            mapResponse.setResponse(RespStatusEnum.ARGS_ERROR);
            return mapResponse;
        }
        boolean b = this.backSysDictService.deleteById(id);
        if (b) {
            mapResponse.setResponse(RespStatusEnum.DATA_DELETE_FAIL);
        }
        return mapResponse;
    }

}

