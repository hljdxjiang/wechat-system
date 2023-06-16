package com.nuoding.wechat.background.controller.user;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nuoding.wechat.common.constant.SessionKey;
import com.nuoding.wechat.common.entity.user.UserWinningRecordEntity;
import com.nuoding.wechat.common.enums.RespStatusEnum;
import com.nuoding.wechat.common.interceptor.SessionValue;
import com.nuoding.wechat.common.model.MapResponse;
import com.nuoding.wechat.common.model.PageQueryBaseDTO;
import com.nuoding.wechat.common.service.user.UserWinningRecordService;
import com.nuoding.wechat.common.utils.JsonUtil;
import com.nuoding.wechat.common.utils.PageInfoUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 后管(userWinningRecord)服务接口
 * 抽奖获奖记录表
 *
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@SessionValue(values = {SessionKey.LOGIN_KEY})
@RestController
@RequestMapping("/background/userWinningRecord")
public class UserWinningRecordController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 服务对象
     */
    @Resource
    private UserWinningRecordService userWinningRecordService;

    /**
     * 分页查询
     *
     * @param userWinningRecordEntity 筛选条件
     * @param dto                     size     分页对象
     * @return 查询结果
     */
    @PostMapping("/queryByPage")
    public MapResponse queryByPage(@RequestBody UserWinningRecordEntity userWinningRecordEntity, @RequestBody PageQueryBaseDTO dto) {
        MapResponse mapResponse = new MapResponse();
        logger.info("queryByPage begin.userWinningRecordEntity:{},dto:{}", JsonUtil.obj2Json(userWinningRecordEntity), JsonUtil.obj2Json(dto));
        PageHelper.startPage(dto.getPage(), dto.getSize());
        List<UserWinningRecordEntity> list = this.userWinningRecordService.queryAllByLimit(userWinningRecordEntity);
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
        mapResponse.put("data", this.userWinningRecordService.queryById(id));
        logger.info("queryById end.mapResponse:{}", JsonUtil.obj2Json(mapResponse));
        return mapResponse;
    }

    /**
     * 新增数据
     *
     * @param userWinningRecordEntity 实体
     * @return 新增结果
     */
    @PostMapping("/add")
    public MapResponse add(UserWinningRecordEntity userWinningRecordEntity) {
        logger.info("add begin.userWinningRecordEntity:{}", JsonUtil.obj2Json(userWinningRecordEntity));
        MapResponse mapResponse = new MapResponse();
        mapResponse.put("data", this.userWinningRecordService.insert(userWinningRecordEntity));
        logger.info("add end.mapResponse:{}", JsonUtil.obj2Json(mapResponse));
        return mapResponse;
    }

    /**
     * 编辑数据
     *
     * @param userWinningRecordEntity 实体
     * @return 编辑结果
     */
    @PostMapping("/edit")
    public MapResponse edit(UserWinningRecordEntity userWinningRecordEntity) {
        MapResponse mapResponse = new MapResponse();
        logger.info("edit begin.userWinningRecordEntity:{}", JsonUtil.obj2Json(userWinningRecordEntity));
        mapResponse.put("data", this.userWinningRecordService.update(userWinningRecordEntity));
        logger.info("edit end.mapResponse:{}", JsonUtil.obj2Json(mapResponse));
        return mapResponse;
    }

    /**
     * 删除数据
     *
     * @param userWinningRecordEntity 实体
     * @return 删除是否成功
     */
    @PostMapping("/delete")
    public MapResponse deleteById(UserWinningRecordEntity userWinningRecordEntity) {

        MapResponse mapResponse = new MapResponse();
        logger.info("deleteById begin.userWinningRecordEntity:{}", JsonUtil.obj2Json(userWinningRecordEntity));
        Integer id = userWinningRecordEntity.getId();
        if (id == null || id == 0) {
            mapResponse.setResponse(RespStatusEnum.ARGS_ERROR);
            return mapResponse;
        }
        boolean b = this.userWinningRecordService.deleteById(id);
        if (b) {
            mapResponse.setResponse(RespStatusEnum.DATA_DELETE_FAIL);
        }
        logger.info("deleteById end.mapResponse:{}", JsonUtil.obj2Json(mapResponse));
        return mapResponse;
    }

}

