package com.nuoding.wechat.background.controller.user;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nuoding.wechat.common.constant.SessionKey;
import com.nuoding.wechat.common.entity.user.UserLocationRecordEntity;
import com.nuoding.wechat.common.enums.RespStatusEnum;
import com.nuoding.wechat.common.interceptor.SessionValue;
import com.nuoding.wechat.common.model.base.MapResponse;
import com.nuoding.wechat.common.model.base.PageQueryBaseDTO;
import com.nuoding.wechat.common.service.user.UserLocationRecordService;
import com.nuoding.wechat.common.utils.JsonUtil;
import com.nuoding.wechat.common.utils.PageInfoUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 后管(userLocationRecord)服务接口
 * 用户地理位置记录表
 *
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@SessionValue(values = {SessionKey.LOGIN_KEY})
@RestController
@RequestMapping("/background/userLocationRecord")
public class UserLocationRecordController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 服务对象
     */
    @Resource
    private UserLocationRecordService userLocationRecordService;

    /**
     * 分页查询
     *
     * @param userLocationRecordEntity 筛选条件
     * @param dto                      size     分页对象
     * @return 查询结果
     */
    @PostMapping("/queryByPage")
    public MapResponse queryByPage(@RequestBody UserLocationRecordEntity userLocationRecordEntity, @RequestBody PageQueryBaseDTO dto) {
        MapResponse mapResponse = new MapResponse();
        logger.info("queryByPage begin.userLocationRecordEntity:{},dto:{}", JsonUtil.obj2Json(userLocationRecordEntity), JsonUtil.obj2Json(dto));
        PageHelper.startPage(dto.getPageNum(), dto.getPageSize());
        // userLocationRecordEntity.setTenantId(SessionKey.getTenantId);
        List<UserLocationRecordEntity> list = this.userLocationRecordService.queryAllByLimit(userLocationRecordEntity);
        PageInfo pageInfo = new PageInfo(list);
        Map map = PageInfoUtil.parseReturnMap(pageInfo);
        mapResponse.setData(map);
        logger.info("queryByPage end.mapResponse:{}", JsonUtil.obj2Json(mapResponse));
        return mapResponse;
    }

    /**
     * 分页查询
     *
     * @param userLocationRecordEntity 筛选条件
     * @param dto                      size     分页对象
     * @return 查询结果
     */
    @PostMapping("/fuzzyQuery")
    public MapResponse fuzzyQuery(@RequestBody UserLocationRecordEntity userLocationRecordEntity, @RequestBody PageQueryBaseDTO dto) {
        MapResponse mapResponse = new MapResponse();
        logger.info("fuzzyQuery begin.userLocationRecordEntity:{},dto:{}", JsonUtil.obj2Json(userLocationRecordEntity), JsonUtil.obj2Json(dto));
        PageHelper.startPage(dto.getPageNum(), dto.getPageSize());
        // userLocationRecordEntity.setTenantId(SessionKey.getTenantId);
        List<UserLocationRecordEntity> list = this.userLocationRecordService.fuzzyQuery(userLocationRecordEntity);
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
        mapResponse.put("data", this.userLocationRecordService.queryById(id));
        logger.info("queryById end.mapResponse:{}", JsonUtil.obj2Json(mapResponse));
        return mapResponse;
    }

    /**
     * 新增数据
     *
     * @param userLocationRecordEntity 实体
     * @return 新增结果
     */
    @PostMapping("/add")
    public MapResponse add(@RequestBody UserLocationRecordEntity userLocationRecordEntity) {
        logger.info("add begin.userLocationRecordEntity:{}", JsonUtil.obj2Json(userLocationRecordEntity));
        MapResponse mapResponse = new MapResponse();
        // userLocationRecordEntity.setTenantId(SessionKey.getTenantId);
        mapResponse.put("data", this.userLocationRecordService.insert(userLocationRecordEntity));
        logger.info("add end.mapResponse:{}", JsonUtil.obj2Json(mapResponse));
        return mapResponse;
    }

    /**
     * 编辑数据
     *
     * @param userLocationRecordEntity 实体
     * @return 编辑结果
     */
    @PostMapping("/edit")
    public MapResponse edit(@RequestBody UserLocationRecordEntity userLocationRecordEntity) {
        MapResponse mapResponse = new MapResponse();
        logger.info("edit begin.userLocationRecordEntity:{}", JsonUtil.obj2Json(userLocationRecordEntity));
        mapResponse.put("data", this.userLocationRecordService.update(userLocationRecordEntity));
        logger.info("edit end.mapResponse:{}", JsonUtil.obj2Json(mapResponse));
        return mapResponse;
    }

    /**
     * 删除数据
     *
     * @param userLocationRecordEntity 实体
     * @return 删除是否成功
     */
    @PostMapping("/delete")
    public MapResponse deleteById(@RequestBody UserLocationRecordEntity userLocationRecordEntity) {

        MapResponse mapResponse = new MapResponse();
        logger.info("deleteById begin.userLocationRecordEntity:{}", JsonUtil.obj2Json(userLocationRecordEntity));
        Integer id = userLocationRecordEntity.getId();
        if (id == null || id == 0) {
            mapResponse.setResponse(RespStatusEnum.ARGS_ERROR);
            return mapResponse;
        }
        this.userLocationRecordService.deleteById(id);

        logger.info("deleteById end.mapResponse:{}", JsonUtil.obj2Json(mapResponse));
        return mapResponse;
    }

}

