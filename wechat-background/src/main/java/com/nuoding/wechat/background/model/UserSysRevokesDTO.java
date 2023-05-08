package com.nuoding.wechat.background.model;

import com.nuoding.wechat.common.entity.back.BackSysRevokesEntity;

import java.util.List;

/**
 * 功能描述:
 *
 * @Author $
 * @Description //TODO $
 * @Date $ $
 **/
public class UserSysRevokesDTO extends BackSysRevokesEntity {
    List<UserSysRevokesDTO> list;

    public List<UserSysRevokesDTO> getList() {
        return list;
    }

    public void setList(List<UserSysRevokesDTO> list) {
        this.list = list;
    }
}
