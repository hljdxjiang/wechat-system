package com.nuoding.wechat.background.controller.mall;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nuoding.wechat.common.constant.SessionKey;
import com.nuoding.wechat.common.entity.mall.MallCouponInfoEntity;
import com.nuoding.wechat.common.enums.RespStatusEnum;
import com.nuoding.wechat.common.interceptor.SessionValue;
import com.nuoding.wechat.common.model.base.MapResponse;
import com.nuoding.wechat.common.model.base.PageQueryBaseDTO;
import com.nuoding.wechat.common.service.mall.MallCouponInfoService;
import com.nuoding.wechat.common.utils.JsonUtil;
import com.nuoding.wechat.common.utils.PageInfoUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 后管(mallCouponInfo)服务接口
 * 优惠券信息表
 *
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@SessionValue(values = {SessionKey.LOGIN_KEY})
@RestController
@RequestMapping("/background/mallCouponInfo")
public class MallCouponInfoController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 服务对象
     */
    @Resource
    private MallCouponInfoService mallCouponInfoService;

    /**
     * 分页查询
     *
     * @param mallCouponInfoEntity 筛选条件
     * @param dto                  size     分页对象
     * @return 查询结果
     */
    @PostMapping("/queryByPage")
    public MapResponse queryByPage(@RequestBody MallCouponInfoEntity mallCouponInfoEntity, @RequestBody PageQueryBaseDTO dto) {
        MapResponse mapResponse = new MapResponse();
        logger.info("queryByPage begin.mallCouponInfoEntity:{},dto:{}", JsonUtil.obj2Json(mallCouponInfoEntity), JsonUtil.obj2Json(dto));
        PageHelper.startPage(dto.getPageNum(), dto.getPageSize());
        // mallCouponInfoEntity.setTenantId(SessionKey.getTenantId);
        List<MallCouponInfoEntity> list = this.mallCouponInfoService.queryAllByLimit(mallCouponInfoEntity);
        PageInfo pageInfo = new PageInfo(list);
        Map map = PageInfoUtil.parseReturnMap(pageInfo);
        mapResponse.setData(map);
        logger.info("queryByPage end.mapResponse:{}", JsonUtil.obj2Json(mapResponse));
        return mapResponse;
    }

    /**
     * 分页查询
     *
     * @param mallCouponInfoEntity 筛选条件
     * @param dto                  size     分页对象
     * @return 查询结果
     */
    @PostMapping("/fuzzyQuery")
    public MapResponse fuzzyQuery(@RequestBody MallCouponInfoEntity mallCouponInfoEntity, @RequestBody PageQueryBaseDTO dto) {
        MapResponse mapResponse = new MapResponse();
        logger.info("fuzzyQuery begin.mallCouponInfoEntity:{},dto:{}", JsonUtil.obj2Json(mallCouponInfoEntity), JsonUtil.obj2Json(dto));
        PageHelper.startPage(dto.getPageNum(), dto.getPageSize());
        // mallCouponInfoEntity.setTenantId(SessionKey.getTenantId);
        List<MallCouponInfoEntity> list = this.mallCouponInfoService.fuzzyQuery(mallCouponInfoEntity);
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
        mapResponse.put("data", this.mallCouponInfoService.queryById(id));
        logger.info("queryById end.mapResponse:{}", JsonUtil.obj2Json(mapResponse));
        return mapResponse;
    }

    /**
     * 新增数据
     *
     * @param mallCouponInfoEntity 实体
     * @return 新增结果
     */
    @PostMapping("/add")
    public MapResponse add(@RequestBody MallCouponInfoEntity mallCouponInfoEntity) {
        logger.info("add begin.mallCouponInfoEntity:{}", JsonUtil.obj2Json(mallCouponInfoEntity));
        MapResponse mapResponse = new MapResponse();
        // mallCouponInfoEntity.setTenantId(SessionKey.getTenantId);
        mapResponse.put("data", this.mallCouponInfoService.insert(mallCouponInfoEntity));
        logger.info("add end.mapResponse:{}", JsonUtil.obj2Json(mapResponse));
        return mapResponse;
    }

    /**
     * 编辑数据
     *
     * @param mallCouponInfoEntity 实体
     * @return 编辑结果
     */
    @PostMapping("/edit")
    public MapResponse edit(@RequestBody MallCouponInfoEntity mallCouponInfoEntity) {
        MapResponse mapResponse = new MapResponse();
        logger.info("edit begin.mallCouponInfoEntity:{}", JsonUtil.obj2Json(mallCouponInfoEntity));
        mapResponse.put("data", this.mallCouponInfoService.update(mallCouponInfoEntity));
        logger.info("edit end.mapResponse:{}", JsonUtil.obj2Json(mapResponse));
        return mapResponse;
    }

    /**
     * 删除数据
     *
     * @param mallCouponInfoEntity 实体
     * @return 删除是否成功
     */
    @PostMapping("/delete")
    public MapResponse deleteById(@RequestBody MallCouponInfoEntity mallCouponInfoEntity) {

        MapResponse mapResponse = new MapResponse();
        logger.info("deleteById begin.mallCouponInfoEntity:{}", JsonUtil.obj2Json(mallCouponInfoEntity));
        Integer id = mallCouponInfoEntity.getId();
        if (id == null || id == 0) {
            mapResponse.setResponse(RespStatusEnum.ARGS_ERROR);
            return mapResponse;
        }
        this.mallCouponInfoService.deleteById(id);

        logger.info("deleteById end.mapResponse:{}", JsonUtil.obj2Json(mapResponse));
        return mapResponse;
    }

}

