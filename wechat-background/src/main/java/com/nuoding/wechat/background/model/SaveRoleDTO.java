package com.nuoding.wechat.background.model;

import com.nuoding.wechat.common.entity.back.BackSysRolesEntity;

import java.util.List;

public class SaveRoleDTO {
    BackSysRolesEntity backSysRole;
    List<UserSysMenusDTO> menusBackDTOList;
    List<UserSysRevokesDTO> revokesBackDTOList;

    public BackSysRolesEntity getBackSysRole() {
        return backSysRole;
    }

    public void setBackSysRole(BackSysRolesEntity backSysRole) {
        this.backSysRole = backSysRole;
    }

    public List<UserSysMenusDTO> getMenusBackDTOList() {
        return menusBackDTOList;
    }

    public void setMenusBackDTOList(List<UserSysMenusDTO> menusBackDTOList) {
        this.menusBackDTOList = menusBackDTOList;
    }

    public List<UserSysRevokesDTO> getRevokesBackDTOList() {
        return revokesBackDTOList;
    }

    public void setRevokesBackDTOList(List<UserSysRevokesDTO> revokesBackDTOList) {
        this.revokesBackDTOList = revokesBackDTOList;
    }
}
