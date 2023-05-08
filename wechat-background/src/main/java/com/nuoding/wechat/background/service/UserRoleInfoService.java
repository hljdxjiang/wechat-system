package com.nuoding.wechat.background.service;

import com.nuoding.wechat.background.model.SaveRoleDTO;
import com.nuoding.wechat.background.model.UserSysMenusDTO;
import com.nuoding.wechat.background.model.UserSysRevokesDTO;
import com.nuoding.wechat.common.entity.back.BackSysMenusEntity;
import com.nuoding.wechat.common.entity.back.BackSysRevokesEntity;

import java.util.List;
import java.util.Map;

/**
 * @Ahther:JHC
 * @Description:用户登录Service
 * @Date:2023/4/11 下午5:19
 */
public interface UserRoleInfoService {
    Map getRoleDetail(String tenantId, String roleId);

    void deleteRole(String tenantId, String roleId);

    void saveRoleDetail(SaveRoleDTO saveRoleDTO);

    List<UserSysMenusDTO> getBackSysMenus(BackSysMenusEntity backSysMenus);

    List<UserSysRevokesDTO> getBackSysRevokes(BackSysRevokesEntity backSysRevokes);
}
