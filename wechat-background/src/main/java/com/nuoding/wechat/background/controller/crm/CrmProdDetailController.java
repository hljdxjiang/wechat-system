package com.nuoding.wechat.background.controller.crm;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nuoding.wechat.common.constant.SessionKey;
import com.nuoding.wechat.common.entity.crm.CrmProdDetailEntity;
import com.nuoding.wechat.common.enums.RespStatusEnum;
import com.nuoding.wechat.common.interceptor.SessionValue;
import com.nuoding.wechat.common.model.base.MapResponse;
import com.nuoding.wechat.common.model.base.PageQueryBaseDTO;
import com.nuoding.wechat.common.service.crm.CrmProdDetailService;
import com.nuoding.wechat.common.utils.JsonUtil;
import com.nuoding.wechat.common.utils.PageInfoUtil;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 后管(crmProdDetail)服务接口
 * 产品详情表
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@SessionValue(values = {SessionKey.LOGIN_KEY})
@RestController
@RequestMapping("/background/crmProdDetail")
public class CrmProdDetailController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 服务对象
     */
    @Resource
    private CrmProdDetailService crmProdDetailService;

    /**
     * 分页查询
     *
     * @param crmProdDetailEntity 筛选条件
     * @param dto             size     分页对象
     * @return 查询结果
     */
    @PostMapping("/queryByPage")
    public MapResponse queryByPage(@RequestBody CrmProdDetailEntity crmProdDetailEntity, @RequestBody PageQueryBaseDTO dto) {
        MapResponse mapResponse = new MapResponse();
        logger.info("queryByPage begin.crmProdDetailEntity:{},dto:{}", JsonUtil.obj2Json(crmProdDetailEntity),JsonUtil.obj2Json(dto));
        PageHelper.startPage(dto.getPageNum(), dto.getPageSize());
        // crmProdDetailEntity.setTenantId(SessionKey.getTenantId);
        List<CrmProdDetailEntity> list = this.crmProdDetailService.queryAllByLimit(crmProdDetailEntity);
        PageInfo pageInfo = new PageInfo(list);
        Map map = PageInfoUtil.parseReturnMap(pageInfo);
        mapResponse.setData(map);
        logger.info("queryByPage end.mapResponse:{}", JsonUtil.obj2Json(mapResponse));
        return mapResponse;
    }

    /**
     * 分页查询
     *
     * @param crmProdDetailEntity 筛选条件
     * @param dto             size     分页对象
     * @return 查询结果
     */
    @PostMapping("/fuzzyQuery")
    public MapResponse fuzzyQuery(@RequestBody CrmProdDetailEntity crmProdDetailEntity, @RequestBody PageQueryBaseDTO dto) {
        MapResponse mapResponse = new MapResponse();
        logger.info("fuzzyQuery begin.crmProdDetailEntity:{},dto:{}", JsonUtil.obj2Json(crmProdDetailEntity),JsonUtil.obj2Json(dto));
        PageHelper.startPage(dto.getPageNum(), dto.getPageSize());
        // crmProdDetailEntity.setTenantId(SessionKey.getTenantId);
        List<CrmProdDetailEntity> list = this.crmProdDetailService.fuzzyQuery(crmProdDetailEntity);
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
        mapResponse.put("data", this.crmProdDetailService.queryById(id));
        logger.info("queryById end.mapResponse:{}", JsonUtil.obj2Json(mapResponse));
        return mapResponse;
    }

    /**
     * 新增数据
     *
     * @param crmProdDetailEntity 实体
     * @return 新增结果
     */
    @PostMapping("/add")
    public MapResponse add(@RequestBody CrmProdDetailEntity crmProdDetailEntity) {
        logger.info("add begin.crmProdDetailEntity:{}",JsonUtil.obj2Json(crmProdDetailEntity));
        MapResponse mapResponse = new MapResponse();
        // crmProdDetailEntity.setTenantId(SessionKey.getTenantId);
        mapResponse.put("data", this.crmProdDetailService.insert(crmProdDetailEntity));
        logger.info("add end.mapResponse:{}", JsonUtil.obj2Json(mapResponse));
        return mapResponse;
    }

    /**
     * 编辑数据
     *
     * @param crmProdDetailEntity 实体
     * @return 编辑结果
     */
    @PostMapping("/edit")
    public MapResponse edit(@RequestBody CrmProdDetailEntity crmProdDetailEntity) {
        MapResponse mapResponse = new MapResponse();
        logger.info("edit begin.crmProdDetailEntity:{}",JsonUtil.obj2Json(crmProdDetailEntity));
        mapResponse.put("data", this.crmProdDetailService.update(crmProdDetailEntity));
        logger.info("edit end.mapResponse:{}", JsonUtil.obj2Json(mapResponse));
        return mapResponse;
    }

    /**
     * 删除数据
     *
     * @param crmProdDetailEntity 实体
     * @return 删除是否成功
     */
    @PostMapping("/delete")
    public MapResponse deleteById(@RequestBody CrmProdDetailEntity crmProdDetailEntity) {

        MapResponse mapResponse = new MapResponse();
        logger.info("deleteById begin.crmProdDetailEntity:{}",JsonUtil.obj2Json(crmProdDetailEntity));
        Integer id = crmProdDetailEntity.getId();
        if (id == null || id == 0) {
            mapResponse.setResponse(RespStatusEnum.ARGS_ERROR);
            return mapResponse;
        }
        this.crmProdDetailService.deleteById(id);

        logger.info("deleteById end.mapResponse:{}", JsonUtil.obj2Json(mapResponse));
        return mapResponse;
    }

}

