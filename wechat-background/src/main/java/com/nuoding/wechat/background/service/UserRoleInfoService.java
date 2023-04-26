package com.nuoding.wechat.background.service;

import com.nuoding.wechat.background.model.SaveRoleDTO;
import com.nuoding.wechat.background.model.UserSysMenusDTO;
import com.nuoding.wechat.background.model.UserSysRevokesDTO;
import com.nuoding.wechat.common.entity.BackSysMenus;
import com.nuoding.wechat.common.entity.BackSysRevokes;

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

    List<UserSysMenusDTO> getBackSysMenus(BackSysMenus backSysMenus);

    List<UserSysRevokesDTO> getBackSysRevokes(BackSysRevokes backSysRevokes);
}
