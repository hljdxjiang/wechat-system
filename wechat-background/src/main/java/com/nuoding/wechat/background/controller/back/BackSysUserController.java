package com.nuoding.wechat.background.controller.back;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nuoding.wechat.common.constant.SessionKey;
import com.nuoding.wechat.common.entity.back.BackSysUserEntity;
import com.nuoding.wechat.common.enums.RespStatusEnum;
import com.nuoding.wechat.common.interceptor.SessionValue;
import com.nuoding.wechat.common.model.MapResponse;
import com.nuoding.wechat.common.model.PageQueryBaseDTO;
import com.nuoding.wechat.common.service.back.BackSysUserService;
import com.nuoding.wechat.common.utils.JsonUtil;
import com.nuoding.wechat.common.utils.PageInfoUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 后管(backSysUser)服务接口
 * 后管用户表
 *
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@SessionValue(values = {SessionKey.LOGIN_KEY})
@RestController
@RequestMapping("/background/backSysUser")
public class BackSysUserController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 服务对象
     */
    @Resource
    private BackSysUserService backSysUserService;

    /**
     * 分页查询
     *
     * @param backSysUserEntity 筛选条件
     * @param dto               size     分页对象
     * @return 查询结果
     */
    @PostMapping("/queryByPage")
    public MapResponse queryByPage(@RequestBody BackSysUserEntity backSysUserEntity, @RequestBody PageQueryBaseDTO dto) {
        MapResponse mapResponse = new MapResponse();
        logger.info("queryByPage begin.backSysUserEntity:{},dto:{}", JsonUtil.obj2Json(backSysUserEntity), JsonUtil.obj2Json(dto));
        PageHelper.startPage(dto.getPage(), dto.getSize());
        List<BackSysUserEntity> list = this.backSysUserService.queryAllByLimit(backSysUserEntity);
        PageInfo pageInfo = new PageInfo(list);
        Map map = PageInfoUtil.parseReturnMap(pageInfo);
        mapResponse.setData(map);
        logger.info("queryByPage end.mapResponse:{}", JsonUtil.obj2Json(mapResponse));
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
        logger.info("queryById begin.id:{}", id);
        MapResponse mapResponse = new MapResponse();
        mapResponse.put("data", this.backSysUserService.queryById(id));
        logger.info("queryById end.mapResponse:{}", JsonUtil.obj2Json(mapResponse));
        return mapResponse;
    }

    /**
     * 新增数据
     *
     * @param backSysUserEntity 实体
     * @return 新增结果
     */
    @PostMapping("/add")
    public MapResponse add(BackSysUserEntity backSysUserEntity) {
        logger.info("add begin.backSysUserEntity:{}", JsonUtil.obj2Json(backSysUserEntity));
        MapResponse mapResponse = new MapResponse();
        mapResponse.put("data", this.backSysUserService.insert(backSysUserEntity));
        logger.info("add end.mapResponse:{}", JsonUtil.obj2Json(mapResponse));
        return mapResponse;
    }

    /**
     * 编辑数据
     *
     * @param backSysUserEntity 实体
     * @return 编辑结果
     */
    @PostMapping("/edit")
    public MapResponse edit(BackSysUserEntity backSysUserEntity) {
        MapResponse mapResponse = new MapResponse();
        logger.info("edit begin.backSysUserEntity:{}", JsonUtil.obj2Json(backSysUserEntity));
        mapResponse.put("data", this.backSysUserService.update(backSysUserEntity));
        logger.info("edit end.mapResponse:{}", JsonUtil.obj2Json(mapResponse));
        return mapResponse;
    }

    /**
     * 删除数据
     *
     * @param backSysUserEntity 实体
     * @return 删除是否成功
     */
    @PostMapping("/delete")
    public MapResponse deleteById(BackSysUserEntity backSysUserEntity) {

        MapResponse mapResponse = new MapResponse();
        logger.info("deleteById begin.backSysUserEntity:{}", JsonUtil.obj2Json(backSysUserEntity));
        Integer id = backSysUserEntity.getId();
        if (id == null || id == 0) {
            mapResponse.setResponse(RespStatusEnum.ARGS_ERROR);
            return mapResponse;
        }
        boolean b = this.backSysUserService.deleteById(id);
        if (b) {
            mapResponse.setResponse(RespStatusEnum.DATA_DELETE_FAIL);
        }
        logger.info("deleteById end.mapResponse:{}", JsonUtil.obj2Json(mapResponse));
        return mapResponse;
    }

}

