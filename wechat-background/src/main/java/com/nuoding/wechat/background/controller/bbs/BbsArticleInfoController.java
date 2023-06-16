package com.nuoding.wechat.background.controller.bbs;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nuoding.wechat.common.constant.SessionKey;
import com.nuoding.wechat.common.entity.bbs.BbsArticleInfoEntity;
import com.nuoding.wechat.common.enums.RespStatusEnum;
import com.nuoding.wechat.common.interceptor.SessionValue;
import com.nuoding.wechat.common.model.MapResponse;
import com.nuoding.wechat.common.model.PageQueryBaseDTO;
import com.nuoding.wechat.common.service.bbs.BbsArticleInfoService;
import com.nuoding.wechat.common.utils.JsonUtil;
import com.nuoding.wechat.common.utils.PageInfoUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 后管(bbsArticleInfo)服务接口
 * 文章记录表
 *
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@SessionValue(values = {SessionKey.LOGIN_KEY})
@RestController
@RequestMapping("/background/bbsArticleInfo")
public class BbsArticleInfoController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 服务对象
     */
    @Resource
    private BbsArticleInfoService bbsArticleInfoService;

    /**
     * 分页查询
     *
     * @param bbsArticleInfoEntity 筛选条件
     * @param dto                  size     分页对象
     * @return 查询结果
     */
    @PostMapping("/queryByPage")
    public MapResponse queryByPage(@RequestBody BbsArticleInfoEntity bbsArticleInfoEntity, @RequestBody PageQueryBaseDTO dto) {
        MapResponse mapResponse = new MapResponse();
        logger.info("queryByPage begin.bbsArticleInfoEntity:{},dto:{}", JsonUtil.obj2Json(bbsArticleInfoEntity), JsonUtil.obj2Json(dto));
        PageHelper.startPage(dto.getPage(), dto.getSize());
        List<BbsArticleInfoEntity> list = this.bbsArticleInfoService.queryAllByLimit(bbsArticleInfoEntity);
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
        mapResponse.put("data", this.bbsArticleInfoService.queryById(id));
        logger.info("queryById end.mapResponse:{}", JsonUtil.obj2Json(mapResponse));
        return mapResponse;
    }

    /**
     * 新增数据
     *
     * @param bbsArticleInfoEntity 实体
     * @return 新增结果
     */
    @PostMapping("/add")
    public MapResponse add(BbsArticleInfoEntity bbsArticleInfoEntity) {
        logger.info("add begin.bbsArticleInfoEntity:{}", JsonUtil.obj2Json(bbsArticleInfoEntity));
        MapResponse mapResponse = new MapResponse();
        mapResponse.put("data", this.bbsArticleInfoService.insert(bbsArticleInfoEntity));
        logger.info("add end.mapResponse:{}", JsonUtil.obj2Json(mapResponse));
        return mapResponse;
    }

    /**
     * 编辑数据
     *
     * @param bbsArticleInfoEntity 实体
     * @return 编辑结果
     */
    @PostMapping("/edit")
    public MapResponse edit(BbsArticleInfoEntity bbsArticleInfoEntity) {
        MapResponse mapResponse = new MapResponse();
        logger.info("edit begin.bbsArticleInfoEntity:{}", JsonUtil.obj2Json(bbsArticleInfoEntity));
        mapResponse.put("data", this.bbsArticleInfoService.update(bbsArticleInfoEntity));
        logger.info("edit end.mapResponse:{}", JsonUtil.obj2Json(mapResponse));
        return mapResponse;
    }

    /**
     * 删除数据
     *
     * @param bbsArticleInfoEntity 实体
     * @return 删除是否成功
     */
    @PostMapping("/delete")
    public MapResponse deleteById(BbsArticleInfoEntity bbsArticleInfoEntity) {

        MapResponse mapResponse = new MapResponse();
        logger.info("deleteById begin.bbsArticleInfoEntity:{}", JsonUtil.obj2Json(bbsArticleInfoEntity));
        Integer id = bbsArticleInfoEntity.getId();
        if (id == null || id == 0) {
            mapResponse.setResponse(RespStatusEnum.ARGS_ERROR);
            return mapResponse;
        }
        boolean b = this.bbsArticleInfoService.deleteById(id);
        if (b) {
            mapResponse.setResponse(RespStatusEnum.DATA_DELETE_FAIL);
        }
        logger.info("deleteById end.mapResponse:{}", JsonUtil.obj2Json(mapResponse));
        return mapResponse;
    }

}

