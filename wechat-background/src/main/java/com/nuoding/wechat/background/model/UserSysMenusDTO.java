package com.nuoding.wechat.background.model;

import com.nuoding.wechat.common.entity.back.BackSysMenusEntity;

import java.util.List;

/**
 * 功能描述:
 *
 * @Author $
 * @Description //TODO $
 * @Date $ $
 **/
public class UserSysMenusDTO extends BackSysMenusEntity {
    List<UserSysMenusDTO> list;

    public List<UserSysMenusDTO> getList() {
        return list;
    }

    public void setList(List<UserSysMenusDTO> list) {
        this.list = list;
    }
}
