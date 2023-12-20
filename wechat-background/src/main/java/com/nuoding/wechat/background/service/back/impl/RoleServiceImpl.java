package com.nuoding.wechat.background.service.back.impl;

import com.nuoding.wechat.background.model.back.RoleDTO;
import com.nuoding.wechat.background.model.back.SaveRoleDetail;
import com.nuoding.wechat.background.service.back.RoleService;
import com.nuoding.wechat.common.entity.back.BackSysRoleDetailEntity;
import com.nuoding.wechat.common.entity.back.BackSysRolesEntity;
import com.nuoding.wechat.common.enums.RespStatusEnum;
import com.nuoding.wechat.common.model.base.MapResponse;
import com.nuoding.wechat.common.service.back.BackSysRoleDetailService;
import com.nuoding.wechat.common.service.back.BackSysRolesService;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RoleServiceImpl implements RoleService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private BackSysRoleDetailService backSysRoleDetailService;

    private BackSysRolesService backSysRolesService;

    public RoleServiceImpl(BackSysRoleDetailService backSysRoleDetailService, BackSysRolesService backSysRolesService) {
        this.backSysRoleDetailService = backSysRoleDetailService;
        this.backSysRolesService = backSysRolesService;
    }

    @Override
    public MapResponse getRoleDetail(RoleDTO detail) {
        logger.info("getRoleDetail begin");
        MapResponse mapResponse = new MapResponse();
        Map retMap = new HashMap<>();
        String roleId = detail.getRoleId();
        if (StringUtils.isBlank(roleId)) {
            mapResponse.setResponse(RespStatusEnum.ARGS_ERROR);
            return mapResponse;
        }
        BackSysRolesEntity rolesEntity = new BackSysRolesEntity();
        rolesEntity.setRoleId(roleId);
        rolesEntity = backSysRolesService.selectOne(rolesEntity);
        if (rolesEntity != null) {
            retMap.put("roleInfo", rolesEntity);
            BackSysRoleDetailEntity entity = new BackSysRoleDetailEntity();
            entity.setRoleid(roleId);
            List<BackSysRoleDetailEntity> list = backSysRoleDetailService.queryAllByLimit(entity);
            if (CollectionUtils.isNotEmpty(list)) {
                List<String> menus = new ArrayList<>();
                List<String> revokes = new ArrayList<>();
                for (BackSysRoleDetailEntity entity2 : list) {
                    String type = entity2.getType();
                    if (StringUtils.equalsIgnoreCase(type, "MENU")) {
                        menus.add(entity2.getPath());
                    }

                    if (StringUtils.equalsIgnoreCase(type, "REVOKE")) {
                        revokes.add(entity2.getPath());
                    }
                }
                retMap.put("menus", menus);
                retMap.put("revokes", revokes);
            }
        }

        mapResponse.setData(retMap);
        return mapResponse;
    }

    @Override
    public MapResponse deleteRole(RoleDTO detail) {
        MapResponse mapResponse = new MapResponse();
        String roleId = detail.getRoleId();
        if (StringUtils.isBlank(roleId)) {
            mapResponse.setResponse(RespStatusEnum.ARGS_ERROR);
            return mapResponse;
        }
        return deleteRole(roleId);
    }

    private MapResponse deleteRole(String roleId) {
        logger.info("deleteRole detail");
        MapResponse mapResponse = new MapResponse();

        if (StringUtils.isBlank(roleId)) {
            mapResponse.setResponse(RespStatusEnum.ARGS_ERROR);
            return mapResponse;
        }
        BackSysRolesEntity entity = new BackSysRolesEntity();
        entity.setRoleId(roleId);
        List<BackSysRolesEntity> list = backSysRolesService.queryAllByLimit(entity);
        if (!CollectionUtils.isEmpty(list)) {
            for (BackSysRolesEntity entity1 : list) {
                backSysRolesService.deleteById(entity1.getId());
            }
        }
        BackSysRoleDetailEntity detailEntity = new BackSysRoleDetailEntity();
        detailEntity.setRoleid(roleId);
        List<BackSysRoleDetailEntity> detailEntities = backSysRoleDetailService.queryAllByLimit(detailEntity);
        if (!CollectionUtils.isEmpty(detailEntities)) {
            for (BackSysRoleDetailEntity detailEntity1 : detailEntities) {
                backSysRoleDetailService.deleteById(detailEntity1.getId());
            }
        }
        return mapResponse;
    }

    @Override
    public MapResponse saveRoleDetail(SaveRoleDetail saveRoleDetail) {
        logger.info("saveRoleDetail detail");
        MapResponse mapResponse = new MapResponse();
        String roleId = saveRoleDetail.getRoleId();
        if (StringUtils.isBlank(roleId)) {
            mapResponse.setResponse(RespStatusEnum.ARGS_ERROR);
            return mapResponse;
        }
        mapResponse = deleteRole(saveRoleDetail.getRoleId());
        if (!MapResponse.verifyMapResponse(mapResponse)) {
            return mapResponse;
        }
        BackSysRolesEntity entity = new BackSysRolesEntity();
        entity.setRoleId(saveRoleDetail.getRoleId());
        entity.setRoleName(saveRoleDetail.getRoleName());
        entity.setRoleRemark(saveRoleDetail.getRoleDesc());
        backSysRolesService.insert(entity);
        List<String> mens = saveRoleDetail.getMenus();
        if (CollectionUtils.isNotEmpty(mens)) {
            for (String s : mens) {
                saveRoleDetail(roleId, s, "MENU");
            }
        }
        List<String> revokes = saveRoleDetail.getRevokes();
        if (CollectionUtils.isNotEmpty(revokes)) {
            for (String s : mens) {
                saveRoleDetail(roleId, s, "REVOKE");
            }
        }

        return mapResponse;
    }

    private void saveRoleDetail(String roleID, String path, String type) {
        BackSysRoleDetailEntity entity = new BackSysRoleDetailEntity();
        entity.setRoleid(roleID);
        entity.setPath(path);
        entity.setType(type);
        backSysRoleDetailService.insert(entity);
    }

}
