package com.nuoding.wechat.background.controller.mall;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nuoding.wechat.common.constant.SessionKey;
import com.nuoding.wechat.common.entity.mall.MallLotteryConditionEntity;
import com.nuoding.wechat.common.enums.RespStatusEnum;
import com.nuoding.wechat.common.interceptor.SessionValue;
import com.nuoding.wechat.common.model.MapResponse;
import com.nuoding.wechat.common.model.PageQueryBaseDTO;
import com.nuoding.wechat.common.service.mall.MallLotteryConditionService;
import com.nuoding.wechat.common.utils.JsonUtil;
import com.nuoding.wechat.common.utils.PageInfoUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 后管(mallLotteryCondition)服务接口
 * 抽奖条件表
 *
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@SessionValue(values = {SessionKey.LOGIN_KEY})
@RestController
@RequestMapping("/background/mallLotteryCondition")
public class MallLotteryConditionController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 服务对象
     */
    @Resource
    private MallLotteryConditionService mallLotteryConditionService;

    /**
     * 分页查询
     *
     * @param mallLotteryConditionEntity 筛选条件
     * @param dto                        size     分页对象
     * @return 查询结果
     */
    @PostMapping("/queryByPage")
    public MapResponse queryByPage(@RequestBody MallLotteryConditionEntity mallLotteryConditionEntity, @RequestBody PageQueryBaseDTO dto) {
        MapResponse mapResponse = new MapResponse();
        logger.info("queryByPage begin.mallLotteryConditionEntity:{},dto:{}", JsonUtil.obj2Json(mallLotteryConditionEntity), JsonUtil.obj2Json(dto));
        PageHelper.startPage(dto.getPage(), dto.getSize());
        List<MallLotteryConditionEntity> list = this.mallLotteryConditionService.queryAllByLimit(mallLotteryConditionEntity);
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
        mapResponse.put("data", this.mallLotteryConditionService.queryById(id));
        logger.info("queryById end.mapResponse:{}", JsonUtil.obj2Json(mapResponse));
        return mapResponse;
    }

    /**
     * 新增数据
     *
     * @param mallLotteryConditionEntity 实体
     * @return 新增结果
     */
    @PostMapping("/add")
    public MapResponse add(MallLotteryConditionEntity mallLotteryConditionEntity) {
        logger.info("add begin.mallLotteryConditionEntity:{}", JsonUtil.obj2Json(mallLotteryConditionEntity));
        MapResponse mapResponse = new MapResponse();
        mapResponse.put("data", this.mallLotteryConditionService.insert(mallLotteryConditionEntity));
        logger.info("add end.mapResponse:{}", JsonUtil.obj2Json(mapResponse));
        return mapResponse;
    }

    /**
     * 编辑数据
     *
     * @param mallLotteryConditionEntity 实体
     * @return 编辑结果
     */
    @PostMapping("/edit")
    public MapResponse edit(MallLotteryConditionEntity mallLotteryConditionEntity) {
        MapResponse mapResponse = new MapResponse();
        logger.info("edit begin.mallLotteryConditionEntity:{}", JsonUtil.obj2Json(mallLotteryConditionEntity));
        mapResponse.put("data", this.mallLotteryConditionService.update(mallLotteryConditionEntity));
        logger.info("edit end.mapResponse:{}", JsonUtil.obj2Json(mapResponse));
        return mapResponse;
    }

    /**
     * 删除数据
     *
     * @param mallLotteryConditionEntity 实体
     * @return 删除是否成功
     */
    @PostMapping("/delete")
    public MapResponse deleteById(MallLotteryConditionEntity mallLotteryConditionEntity) {

        MapResponse mapResponse = new MapResponse();
        logger.info("deleteById begin.mallLotteryConditionEntity:{}", JsonUtil.obj2Json(mallLotteryConditionEntity));
        Integer id = mallLotteryConditionEntity.getId();
        if (id == null || id == 0) {
            mapResponse.setResponse(RespStatusEnum.ARGS_ERROR);
            return mapResponse;
        }
        boolean b = this.mallLotteryConditionService.deleteById(id);
        if (b) {
            mapResponse.setResponse(RespStatusEnum.DATA_DELETE_FAIL);
        }
        logger.info("deleteById end.mapResponse:{}", JsonUtil.obj2Json(mapResponse));
        return mapResponse;
    }

}

