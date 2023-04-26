package com.nuoding.wechat.background.controller.crm;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nuoding.wechat.common.constant.SessionKey;
import com.nuoding.wechat.common.entity.CrmSaleDetail;
import com.nuoding.wechat.common.enums.RespStatusEnum;
import com.nuoding.wechat.common.interceptor.SessionValue;
import com.nuoding.wechat.common.model.MapResponse;
import com.nuoding.wechat.common.model.PageQueryBaseDTO;
import com.nuoding.wechat.common.service.CrmSaleDetailService;
import com.nuoding.wechat.common.utils.PageInfoUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 进货记录表(CrmSaleDetail)表服务接口
 *
 * @author jhc
 * @since 2023-03-07 14:38:19
 */
@SessionValue(values = {SessionKey.LOGIN_KEY})
@RestController
@RequestMapping("/background/crmSaleDetail")
public class CrmSaleDetailController {
    /**
     * 服务对象
     */
    @Resource
    private CrmSaleDetailService crmSaleDetailService;

    /**
     * 分页查询
     *
     * @param crmSaleDetail 筛选条件
     * @param   dto     分页对象
     * @return 查询结果
     */
    @PostMapping("/queryByPage")
    public MapResponse queryByPage(@RequestBody CrmSaleDetail crmSaleDetail, @RequestBody PageQueryBaseDTO dto) {
        MapResponse mapResponse = new MapResponse();
        PageHelper.startPage(dto.getPage(), dto.getSize());
        List<CrmSaleDetail> list = this.crmSaleDetailService.queryByPage(crmSaleDetail);
        PageInfo pageInfo = new PageInfo(list);
        Map map = PageInfoUtil.parseReturnMap(pageInfo);
        mapResponse.setData(map);
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
        MapResponse mapResponse = new MapResponse();
        mapResponse.put("data", this.crmSaleDetailService.queryById(id));
        return mapResponse;
    }

    /**
     * 新增数据
     *
     * @param crmSaleDetail 实体
     * @return 新增结果
     */
    @PostMapping("/add")
    public MapResponse add(CrmSaleDetail crmSaleDetail) {
        MapResponse mapResponse = new MapResponse();
        mapResponse.put("data", this.crmSaleDetailService.insert(crmSaleDetail));
        return mapResponse;
    }

    /**
     * 编辑数据
     *
     * @param crmSaleDetail 实体
     * @return 编辑结果
     */
    @PostMapping("/edit")
    public MapResponse edit(CrmSaleDetail crmSaleDetail) {
        MapResponse mapResponse = new MapResponse();
        mapResponse.put("data", this.crmSaleDetailService.update(crmSaleDetail));
        return mapResponse;
    }

    /**
     * 删除数据
     *
     * @param crmSaleDetail 实体
     * @return 删除是否成功
     */
    @PostMapping("/delete")
    public MapResponse deleteById(CrmSaleDetail crmSaleDetail) {

        MapResponse mapResponse = new MapResponse();
        Integer id = crmSaleDetail.getId();
        if (id == null || id == 0) {
            mapResponse.setResponse(RespStatusEnum.ARGS_ERROR);
            return mapResponse;
        }
        boolean b = this.crmSaleDetailService.deleteById(id);
        if (b) {
            mapResponse.setResponse(RespStatusEnum.DATA_DELETE_FAIL);
        }
        return mapResponse;
    }

}

