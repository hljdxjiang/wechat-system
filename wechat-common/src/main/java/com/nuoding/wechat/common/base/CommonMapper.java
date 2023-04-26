package com.nuoding.wechat.common.base;

import tk.mybatis.mapper.additional.insert.InsertListMapper;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author :tf
 * @create :2022/04/29
 * @desc : 通用Mapper，支持批量插入
 **/
public interface CommonMapper<T> extends Mapper<T>, InsertListMapper<T> {
}
