package com.nuoding.wechat.background.controller.back;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nuoding.wechat.common.constant.SessionKey;
import com.nuoding.wechat.common.entity.back.BackSysRevokesEntity;
import com.nuoding.wechat.common.enums.RespStatusEnum;
import com.nuoding.wechat.common.interceptor.SessionValue;
import com.nuoding.wechat.common.model.base.MapResponse;
import com.nuoding.wechat.common.model.base.PageQueryBaseDTO;
import com.nuoding.wechat.common.service.back.BackSysRevokesService;
import com.nuoding.wechat.common.utils.JsonUtil;
import com.nuoding.wechat.common.utils.PageInfoUtil;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 后管(backSysRevokes)服务接口
 * 系统权限表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@SessionValue(values = {SessionKey.LOGIN_KEY})
@RestController
@RequestMapping("/background/backSysRevokes")
public class BackSysRevokesController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 服务对象
     */
    @Resource
    private BackSysRevokesService backSysRevokesService;

    /**
     * 分页查询
     *
     * @param backSysRevokesEntity 筛选条件
     * @param dto             size     分页对象
     * @return 查询结果
     */
    @PostMapping("/queryByPage")
    public MapResponse queryByPage(@RequestBody BackSysRevokesEntity backSysRevokesEntity, @RequestBody PageQueryBaseDTO dto) {
        MapResponse mapResponse = new MapResponse();
        logger.info("queryByPage begin.backSysRevokesEntity:{},dto:{}", JsonUtil.obj2Json(backSysRevokesEntity),JsonUtil.obj2Json(dto));
        PageHelper.startPage(dto.getPageNum(), dto.getPageSize());
        // backSysRevokesEntity.setTenantId(SessionKey.getTenantId);
        List<BackSysRevokesEntity> list = this.backSysRevokesService.queryAllByLimit(backSysRevokesEntity);
        PageInfo pageInfo = new PageInfo(list);
        Map map = PageInfoUtil.parseReturnMap(pageInfo);
        mapResponse.setData(map);
        logger.info("queryByPage end.mapResponse:{}", JsonUtil.obj2Json(mapResponse));
        return mapResponse;
    }

    /**
     * 分页查询
     *
     * @param backSysRevokesEntity 筛选条件
     * @param dto             size     分页对象
     * @return 查询结果
     */
    @PostMapping("/fuzzyQuery")
    public MapResponse fuzzyQuery(@RequestBody BackSysRevokesEntity backSysRevokesEntity, @RequestBody PageQueryBaseDTO dto) {
        MapResponse mapResponse = new MapResponse();
        logger.info("fuzzyQuery begin.backSysRevokesEntity:{},dto:{}", JsonUtil.obj2Json(backSysRevokesEntity),JsonUtil.obj2Json(dto));
        PageHelper.startPage(dto.getPageNum(), dto.getPageSize());
        // backSysRevokesEntity.setTenantId(SessionKey.getTenantId);
        List<BackSysRevokesEntity> list = this.backSysRevokesService.fuzzyQuery(backSysRevokesEntity);
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
        mapResponse.put("data", this.backSysRevokesService.queryById(id));
        logger.info("queryById end.mapResponse:{}", JsonUtil.obj2Json(mapResponse));
        return mapResponse;
    }

    /**
     * 新增数据
     *
     * @param backSysRevokesEntity 实体
     * @return 新增结果
     */
    @PostMapping("/add")
    public MapResponse add(@RequestBody BackSysRevokesEntity backSysRevokesEntity) {
        logger.info("add begin.backSysRevokesEntity:{}",JsonUtil.obj2Json(backSysRevokesEntity));
        MapResponse mapResponse = new MapResponse();
        // backSysRevokesEntity.setTenantId(SessionKey.getTenantId);
        mapResponse.put("data", this.backSysRevokesService.insert(backSysRevokesEntity));
        logger.info("add end.mapResponse:{}", JsonUtil.obj2Json(mapResponse));
        return mapResponse;
    }

    /**
     * 编辑数据
     *
     * @param backSysRevokesEntity 实体
     * @return 编辑结果
     */
    @PostMapping("/edit")
    public MapResponse edit(@RequestBody BackSysRevokesEntity backSysRevokesEntity) {
        MapResponse mapResponse = new MapResponse();
        logger.info("edit begin.backSysRevokesEntity:{}",JsonUtil.obj2Json(backSysRevokesEntity));
        mapResponse.put("data", this.backSysRevokesService.update(backSysRevokesEntity));
        logger.info("edit end.mapResponse:{}", JsonUtil.obj2Json(mapResponse));
        return mapResponse;
    }

    /**
     * 删除数据
     *
     * @param backSysRevokesEntity 实体
     * @return 删除是否成功
     */
    @PostMapping("/delete")
    public MapResponse deleteById(@RequestBody BackSysRevokesEntity backSysRevokesEntity) {

        MapResponse mapResponse = new MapResponse();
        logger.info("deleteById begin.backSysRevokesEntity:{}",JsonUtil.obj2Json(backSysRevokesEntity));
        Integer id = backSysRevokesEntity.getId();
        if (id == null || id == 0) {
            mapResponse.setResponse(RespStatusEnum.ARGS_ERROR);
            return mapResponse;
        }
        this.backSysRevokesService.deleteById(id);

        logger.info("deleteById end.mapResponse:{}", JsonUtil.obj2Json(mapResponse));
        return mapResponse;
    }

}

