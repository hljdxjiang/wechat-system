package com.nuoding.wechat.background.controller.back;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nuoding.wechat.common.constant.SessionKey;
import com.nuoding.wechat.common.entity.back.BackOperaRecordEntity;
import com.nuoding.wechat.common.enums.RespStatusEnum;
import com.nuoding.wechat.common.interceptor.SessionValue;
import com.nuoding.wechat.common.model.MapResponse;
import com.nuoding.wechat.common.model.PageQueryBaseDTO;
import com.nuoding.wechat.common.service.back.BackOperaRecordService;
import com.nuoding.wechat.common.utils.PageInfoUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 后管(backOperaRecord)服务接口
 * 后管操作记录表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@SessionValue(values = {SessionKey.LOGIN_KEY})
@RestController
@RequestMapping("/background/backOperaRecord")
public class BackOperaRecordController {
    /**
     * 服务对象
     */
    @Resource
    private BackOperaRecordService backOperaRecordService;

    /**
     * 分页查询
     *
     * @param backOperaRecordEntity 筛选条件
     * @param dto             size     分页对象
     * @return 查询结果
     */
    @PostMapping("/queryByPage")
    public MapResponse queryByPage(@RequestBody BackOperaRecordEntity backOperaRecordEntity, @RequestBody PageQueryBaseDTO dto) {
        MapResponse mapResponse = new MapResponse();
        PageHelper.startPage(dto.getPage(), dto.getSize());
        List<BackOperaRecordEntity> list = this.backOperaRecordService.queryAllByLimit(backOperaRecordEntity);
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
        mapResponse.put("data", this.backOperaRecordService.queryById(id));
        return mapResponse;
    }

    /**
     * 新增数据
     *
     * @param backOperaRecordEntity 实体
     * @return 新增结果
     */
    @PostMapping("/add")
    public MapResponse add(BackOperaRecordEntity backOperaRecordEntity) {
        MapResponse mapResponse = new MapResponse();
        mapResponse.put("data", this.backOperaRecordService.insert(backOperaRecordEntity));
        return mapResponse;
    }

    /**
     * 编辑数据
     *
     * @param backOperaRecordEntity 实体
     * @return 编辑结果
     */
    @PostMapping("/edit")
    public MapResponse edit(BackOperaRecordEntity backOperaRecordEntity) {
        MapResponse mapResponse = new MapResponse();
        mapResponse.put("data", this.backOperaRecordService.update(backOperaRecordEntity));
        return mapResponse;
    }

    /**
     * 删除数据
     *
     * @param backOperaRecordEntity 实体
     * @return 删除是否成功
     */
    @PostMapping("/delete")
    public MapResponse deleteById(BackOperaRecordEntity backOperaRecordEntity) {

        MapResponse mapResponse = new MapResponse();
        Integer id = backOperaRecordEntity.getId();
        if (id == null || id == 0) {
            mapResponse.setResponse(RespStatusEnum.ARGS_ERROR);
            return mapResponse;
        }
        boolean b = this.backOperaRecordService.deleteById(id);
        if (b) {
            mapResponse.setResponse(RespStatusEnum.DATA_DELETE_FAIL);
        }
        return mapResponse;
    }

}

