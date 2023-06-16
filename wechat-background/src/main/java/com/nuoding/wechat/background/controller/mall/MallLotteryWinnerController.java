package com.nuoding.wechat.background.controller.mall;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nuoding.wechat.common.constant.SessionKey;
import com.nuoding.wechat.common.entity.mall.MallLotteryWinnerEntity;
import com.nuoding.wechat.common.enums.RespStatusEnum;
import com.nuoding.wechat.common.interceptor.SessionValue;
import com.nuoding.wechat.common.model.MapResponse;
import com.nuoding.wechat.common.model.PageQueryBaseDTO;
import com.nuoding.wechat.common.service.mall.MallLotteryWinnerService;
import com.nuoding.wechat.common.utils.JsonUtil;
import com.nuoding.wechat.common.utils.PageInfoUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 后管(mallLotteryWinner)服务接口
 * 抽奖中奖记录表
 *
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@SessionValue(values = {SessionKey.LOGIN_KEY})
@RestController
@RequestMapping("/background/mallLotteryWinner")
public class MallLotteryWinnerController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 服务对象
     */
    @Resource
    private MallLotteryWinnerService mallLotteryWinnerService;

    /**
     * 分页查询
     *
     * @param mallLotteryWinnerEntity 筛选条件
     * @param dto                     size     分页对象
     * @return 查询结果
     */
    @PostMapping("/queryByPage")
    public MapResponse queryByPage(@RequestBody MallLotteryWinnerEntity mallLotteryWinnerEntity, @RequestBody PageQueryBaseDTO dto) {
        MapResponse mapResponse = new MapResponse();
        logger.info("queryByPage begin.mallLotteryWinnerEntity:{},dto:{}", JsonUtil.obj2Json(mallLotteryWinnerEntity), JsonUtil.obj2Json(dto));
        PageHelper.startPage(dto.getPage(), dto.getSize());
        List<MallLotteryWinnerEntity> list = this.mallLotteryWinnerService.queryAllByLimit(mallLotteryWinnerEntity);
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
        mapResponse.put("data", this.mallLotteryWinnerService.queryById(id));
        logger.info("queryById end.mapResponse:{}", JsonUtil.obj2Json(mapResponse));
        return mapResponse;
    }

    /**
     * 新增数据
     *
     * @param mallLotteryWinnerEntity 实体
     * @return 新增结果
     */
    @PostMapping("/add")
    public MapResponse add(MallLotteryWinnerEntity mallLotteryWinnerEntity) {
        logger.info("add begin.mallLotteryWinnerEntity:{}", JsonUtil.obj2Json(mallLotteryWinnerEntity));
        MapResponse mapResponse = new MapResponse();
        mapResponse.put("data", this.mallLotteryWinnerService.insert(mallLotteryWinnerEntity));
        logger.info("add end.mapResponse:{}", JsonUtil.obj2Json(mapResponse));
        return mapResponse;
    }

    /**
     * 编辑数据
     *
     * @param mallLotteryWinnerEntity 实体
     * @return 编辑结果
     */
    @PostMapping("/edit")
    public MapResponse edit(MallLotteryWinnerEntity mallLotteryWinnerEntity) {
        MapResponse mapResponse = new MapResponse();
        logger.info("edit begin.mallLotteryWinnerEntity:{}", JsonUtil.obj2Json(mallLotteryWinnerEntity));
        mapResponse.put("data", this.mallLotteryWinnerService.update(mallLotteryWinnerEntity));
        logger.info("edit end.mapResponse:{}", JsonUtil.obj2Json(mapResponse));
        return mapResponse;
    }

    /**
     * 删除数据
     *
     * @param mallLotteryWinnerEntity 实体
     * @return 删除是否成功
     */
    @PostMapping("/delete")
    public MapResponse deleteById(MallLotteryWinnerEntity mallLotteryWinnerEntity) {

        MapResponse mapResponse = new MapResponse();
        logger.info("deleteById begin.mallLotteryWinnerEntity:{}", JsonUtil.obj2Json(mallLotteryWinnerEntity));
        Integer id = mallLotteryWinnerEntity.getId();
        if (id == null || id == 0) {
            mapResponse.setResponse(RespStatusEnum.ARGS_ERROR);
            return mapResponse;
        }
        boolean b = this.mallLotteryWinnerService.deleteById(id);
        if (b) {
            mapResponse.setResponse(RespStatusEnum.DATA_DELETE_FAIL);
        }
        logger.info("deleteById end.mapResponse:{}", JsonUtil.obj2Json(mapResponse));
        return mapResponse;
    }

}

