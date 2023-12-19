package com.nuoding.wechat.background.controller.back;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nuoding.wechat.common.constant.SessionKey;
import com.nuoding.wechat.common.entity.back.BackSysMenusEntity;
import com.nuoding.wechat.common.enums.RespStatusEnum;
import com.nuoding.wechat.common.interceptor.SessionValue;
import com.nuoding.wechat.common.model.base.MapResponse;
import com.nuoding.wechat.common.model.base.PageQueryBaseDTO;
import com.nuoding.wechat.common.service.back.BackSysMenusService;
import com.nuoding.wechat.common.utils.JsonUtil;
import com.nuoding.wechat.common.utils.PageInfoUtil;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 后管(backSysMenus)服务接口
 * 系统菜单表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@SessionValue(values = {SessionKey.LOGIN_KEY})
@RestController
@RequestMapping("/background/backSysMenus")
public class BackSysMenusController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 服务对象
     */
    @Resource
    private BackSysMenusService backSysMenusService;

    /**
     * 分页查询
     *
     * @param backSysMenusEntity 筛选条件
     * @param dto             size     分页对象
     * @return 查询结果
     */
    @PostMapping("/queryByPage")
    public MapResponse queryByPage(@RequestBody BackSysMenusEntity backSysMenusEntity, @RequestBody PageQueryBaseDTO dto) {
        MapResponse mapResponse = new MapResponse();
        logger.info("queryByPage begin.backSysMenusEntity:{},dto:{}", JsonUtil.obj2Json(backSysMenusEntity),JsonUtil.obj2Json(dto));
        PageHelper.startPage(dto.getPageNum(), dto.getPageSize());
        // backSysMenusEntity.setTenantId(SessionKey.getTenantId);
        List<BackSysMenusEntity> list = this.backSysMenusService.queryAllByLimit(backSysMenusEntity);
        PageInfo pageInfo = new PageInfo(list);
        Map map = PageInfoUtil.parseReturnMap(pageInfo);
        mapResponse.setData(map);
        logger.info("queryByPage end.mapResponse:{}", JsonUtil.obj2Json(mapResponse));
        return mapResponse;
    }

    /**
     * 分页查询
     *
     * @param backSysMenusEntity 筛选条件
     * @param dto             size     分页对象
     * @return 查询结果
     */
    @PostMapping("/fuzzyQuery")
    public MapResponse fuzzyQuery(@RequestBody BackSysMenusEntity backSysMenusEntity, @RequestBody PageQueryBaseDTO dto) {
        MapResponse mapResponse = new MapResponse();
        logger.info("fuzzyQuery begin.backSysMenusEntity:{},dto:{}", JsonUtil.obj2Json(backSysMenusEntity),JsonUtil.obj2Json(dto));
        PageHelper.startPage(dto.getPageNum(), dto.getPageSize());
        // backSysMenusEntity.setTenantId(SessionKey.getTenantId);
        List<BackSysMenusEntity> list = this.backSysMenusService.fuzzyQuery(backSysMenusEntity);
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
        logger.info("queryById begin.id:{}",id);
        MapResponse mapResponse = new MapResponse();
        mapResponse.put("data", this.backSysMenusService.queryById(id));
        logger.info("queryById end.mapResponse:{}", JsonUtil.obj2Json(mapResponse));
        return mapResponse;
    }

    /**
     * 新增数据
     *
     * @param backSysMenusEntity 实体
     * @return 新增结果
     */
    @PostMapping("/add")
    public MapResponse add(@RequestBody BackSysMenusEntity backSysMenusEntity) {
        logger.info("add begin.backSysMenusEntity:{}",JsonUtil.obj2Json(backSysMenusEntity));
        MapResponse mapResponse = new MapResponse();
        // backSysMenusEntity.setTenantId(SessionKey.getTenantId);
        mapResponse.put("data", this.backSysMenusService.insert(backSysMenusEntity));
        logger.info("add end.mapResponse:{}", JsonUtil.obj2Json(mapResponse));
        return mapResponse;
    }

    /**
     * 编辑数据
     *
     * @param backSysMenusEntity 实体
     * @return 编辑结果
     */
    @PostMapping("/edit")
    public MapResponse edit(@RequestBody BackSysMenusEntity backSysMenusEntity) {
        MapResponse mapResponse = new MapResponse();
        logger.info("edit begin.backSysMenusEntity:{}",JsonUtil.obj2Json(backSysMenusEntity));
        mapResponse.put("data", this.backSysMenusService.update(backSysMenusEntity));
        logger.info("edit end.mapResponse:{}", JsonUtil.obj2Json(mapResponse));
        return mapResponse;
    }

    /**
     * 删除数据
     *
     * @param backSysMenusEntity 实体
     * @return 删除是否成功
     */
    @PostMapping("/delete")
    public MapResponse deleteById(@RequestBody BackSysMenusEntity backSysMenusEntity) {

        MapResponse mapResponse = new MapResponse();
        logger.info("deleteById begin.backSysMenusEntity:{}",JsonUtil.obj2Json(backSysMenusEntity));
        Integer id = backSysMenusEntity.getId();
        if (id == null || id == 0) {
            mapResponse.setResponse(RespStatusEnum.ARGS_ERROR);
            return mapResponse;
        }
        this.backSysMenusService.deleteById(id);

        logger.info("deleteById end.mapResponse:{}", JsonUtil.obj2Json(mapResponse));
        return mapResponse;
    }

}

