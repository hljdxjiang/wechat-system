package com.nuoding.wechat.background.controller.sys;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nuoding.wechat.common.constant.SessionKey;
import com.nuoding.wechat.common.entity.sys.SysResourceInfoEntity;
import com.nuoding.wechat.common.enums.RespStatusEnum;
import com.nuoding.wechat.common.interceptor.SessionValue;
import com.nuoding.wechat.common.model.base.MapResponse;
import com.nuoding.wechat.common.model.base.PageQueryBaseDTO;
import com.nuoding.wechat.common.service.sys.SysResourceInfoService;
import com.nuoding.wechat.common.utils.JsonUtil;
import com.nuoding.wechat.common.utils.PageInfoUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 后管(sysResourceInfo)服务接口
 * 资源信息表
 *
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@SessionValue(values = {SessionKey.LOGIN_KEY})
@RestController
@RequestMapping("/background/sysResourceInfo")
public class SysResourceInfoController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 服务对象
     */
    @Resource
    private SysResourceInfoService sysResourceInfoService;

    /**
     * 分页查询
     *
     * @param sysResourceInfoEntity 筛选条件
     * @param dto                   size     分页对象
     * @return 查询结果
     */
    @PostMapping("/queryByPage")
    public MapResponse queryByPage(@RequestBody SysResourceInfoEntity sysResourceInfoEntity, @RequestBody PageQueryBaseDTO dto) {
        MapResponse mapResponse = new MapResponse();
        logger.info("queryByPage begin.sysResourceInfoEntity:{},dto:{}", JsonUtil.obj2Json(sysResourceInfoEntity), JsonUtil.obj2Json(dto));
        PageHelper.startPage(dto.getPageNum(), dto.getPageSize());
        // sysResourceInfoEntity.setTenantId(SessionKey.getTenantId);
        List<SysResourceInfoEntity> list = this.sysResourceInfoService.queryAllByLimit(sysResourceInfoEntity);
        PageInfo pageInfo = new PageInfo(list);
        Map map = PageInfoUtil.parseReturnMap(pageInfo);
        mapResponse.setData(map);
        logger.info("queryByPage end.mapResponse:{}", JsonUtil.obj2Json(mapResponse));
        return mapResponse;
    }

    /**
     * 分页查询
     *
     * @param sysResourceInfoEntity 筛选条件
     * @param dto                   size     分页对象
     * @return 查询结果
     */
    @PostMapping("/fuzzyQuery")
    public MapResponse fuzzyQuery(@RequestBody SysResourceInfoEntity sysResourceInfoEntity, @RequestBody PageQueryBaseDTO dto) {
        MapResponse mapResponse = new MapResponse();
        logger.info("fuzzyQuery begin.sysResourceInfoEntity:{},dto:{}", JsonUtil.obj2Json(sysResourceInfoEntity), JsonUtil.obj2Json(dto));
        PageHelper.startPage(dto.getPageNum(), dto.getPageSize());
        // sysResourceInfoEntity.setTenantId(SessionKey.getTenantId);
        List<SysResourceInfoEntity> list = this.sysResourceInfoService.fuzzyQuery(sysResourceInfoEntity);
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
        mapResponse.put("data", this.sysResourceInfoService.queryById(id));
        logger.info("queryById end.mapResponse:{}", JsonUtil.obj2Json(mapResponse));
        return mapResponse;
    }

    /**
     * 新增数据
     *
     * @param sysResourceInfoEntity 实体
     * @return 新增结果
     */
    @PostMapping("/add")
    public MapResponse add(@RequestBody SysResourceInfoEntity sysResourceInfoEntity) {
        logger.info("add begin.sysResourceInfoEntity:{}", JsonUtil.obj2Json(sysResourceInfoEntity));
        MapResponse mapResponse = new MapResponse();
        // sysResourceInfoEntity.setTenantId(SessionKey.getTenantId);
        mapResponse.put("data", this.sysResourceInfoService.insert(sysResourceInfoEntity));
        logger.info("add end.mapResponse:{}", JsonUtil.obj2Json(mapResponse));
        return mapResponse;
    }

    /**
     * 编辑数据
     *
     * @param sysResourceInfoEntity 实体
     * @return 编辑结果
     */
    @PostMapping("/edit")
    public MapResponse edit(@RequestBody SysResourceInfoEntity sysResourceInfoEntity) {
        MapResponse mapResponse = new MapResponse();
        logger.info("edit begin.sysResourceInfoEntity:{}", JsonUtil.obj2Json(sysResourceInfoEntity));
        mapResponse.put("data", this.sysResourceInfoService.update(sysResourceInfoEntity));
        logger.info("edit end.mapResponse:{}", JsonUtil.obj2Json(mapResponse));
        return mapResponse;
    }

    /**
     * 删除数据
     *
     * @param sysResourceInfoEntity 实体
     * @return 删除是否成功
     */
    @PostMapping("/delete")
    public MapResponse deleteById(@RequestBody SysResourceInfoEntity sysResourceInfoEntity) {

        MapResponse mapResponse = new MapResponse();
        logger.info("deleteById begin.sysResourceInfoEntity:{}", JsonUtil.obj2Json(sysResourceInfoEntity));
        Integer id = sysResourceInfoEntity.getId();
        if (id == null || id == 0) {
            mapResponse.setResponse(RespStatusEnum.ARGS_ERROR);
            return mapResponse;
        }
        this.sysResourceInfoService.deleteById(id);

        logger.info("deleteById end.mapResponse:{}", JsonUtil.obj2Json(mapResponse));
        return mapResponse;
    }

}

