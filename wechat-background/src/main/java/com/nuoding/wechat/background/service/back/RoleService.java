package com.nuoding.wechat.background.service.back;

import com.nuoding.wechat.background.model.back.RoleDTO;
import com.nuoding.wechat.background.model.back.SaveRoleDetail;
import com.nuoding.wechat.common.entity.back.BackSysRolesEntity;
import com.nuoding.wechat.common.model.base.MapResponse;

public interface RoleService {
    MapResponse getRoleDetail(RoleDTO detail);

    MapResponse deleteRole(RoleDTO detail);

    MapResponse saveRoleDetail(SaveRoleDetail saveRoleDetail);
}
