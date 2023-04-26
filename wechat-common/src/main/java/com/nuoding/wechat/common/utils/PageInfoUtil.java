package com.nuoding.wechat.common.utils;

import com.github.pagehelper.PageInfo;

import java.util.HashMap;
import java.util.Map;

public class PageInfoUtil {
    public static Map parseReturnMap(PageInfo pageInfo) {
        Map map = new HashMap();
        map.put("pageSize", pageInfo.getPageSize());
        map.put("pageNum", pageInfo.getPageNum());
        map.put("total", pageInfo.getTotal());
        map.put("pages", pageInfo.getPages());
        map.put("list", pageInfo.getList());
        return map;
    }
}
