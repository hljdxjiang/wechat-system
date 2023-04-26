package com.nuoding.wechat.background.service.impl;

import com.alibaba.excel.util.CollectionUtils;
import com.nuoding.wechat.background.model.SaveRoleDTO;
import com.nuoding.wechat.background.model.UserSysMenusDTO;
import com.nuoding.wechat.background.model.UserSysRevokesDTO;
import com.nuoding.wechat.background.service.UserRoleInfoService;
import com.nuoding.wechat.common.constant.RedisKey;
import com.nuoding.wechat.common.dao.BackRoleDetailDao;
import com.nuoding.wechat.common.dao.BackSysMenusDao;
import com.nuoding.wechat.common.dao.BackSysRevokesDao;
import com.nuoding.wechat.common.dao.BackSysRolesDao;
import com.nuoding.wechat.common.entity.BackRoleDetail;
import com.nuoding.wechat.common.entity.BackSysMenus;
import com.nuoding.wechat.common.entity.BackSysRevokes;
import com.nuoding.wechat.common.entity.BackSysRoles;
import com.nuoding.wechat.common.service.RedisService;
import com.nuoding.wechat.common.utils.CollectionUtil;
import com.nuoding.wechat.common.utils.JsonUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Ahther:JHC
 * @Description:获取用户权限详情
 * @Date:2023/4/11 下午5:35
 */
@Service
public class UserRoleInfoServiceImpl implements UserRoleInfoService {


    @Resource
    private BackSysMenusDao backSysMenusDao;

    @Resource
    private BackSysRolesDao backSysRolesDao;

    @Resource
    private BackSysRevokesDao backSysRevokesDao;

    @Resource
    private BackRoleDetailDao backRoleDetailDao;

    @Autowired
    private RedisService redisService;

    private final String ROOT = "root";

    @Override
    public Map getRoleDetail(String tenantID, String roleId) {
        redisService.getValue(RedisKey.REDIS_ROLE_PRE.concat(roleId));
        String roleInfo = redisService.getValue(roleId);
        if (StringUtils.isNotBlank(roleInfo)) {
            return JsonUtil.json2Map(roleInfo);
        }
        Map map = new HashMap();
        BackRoleDetail detail = new BackRoleDetail();
        detail.setRoleId(roleId);
        detail.setTenantId(tenantID);
        List<BackRoleDetail> roleDetailList = this.getBackRoleDetail(detail);
        List<UserSysMenusDTO> backMenus = new ArrayList<>();
        map.put("menus", this.buildMenusTree(backSysMenusDao.queryAllByLimit(null)
                , ROOT, roleDetailList));
        map.put("revokes", this.buildRevokeTree(backSysRevokesDao.queryAllByLimit(null)
                , ROOT, roleDetailList));
        redisService.setValue(RedisKey.REDIS_ROLE_PRE.concat(roleId), JsonUtil.obj2Json(map));
        return map;
    }

    @Override
    public void deleteRole(String tenantId, String roleId) {
        BackSysRoles query = new BackSysRoles();
        query.setRoleId(roleId);
        query.setTenantId(tenantId);
        List<BackSysRoles> list = backSysRolesDao.queryAllByLimit(query);
        if (!CollectionUtils.isEmpty(list)) {
            for (BackSysRoles role : list) {
                backSysRolesDao.deleteById(role.getId());
            }
        }
        BackRoleDetail detailquery = new BackRoleDetail();
        detailquery.setRoleId(roleId);
        detailquery.setTenantId(tenantId);
        List<BackRoleDetail> roleDetails = backRoleDetailDao.queryAllByLimit(detailquery);
        if (!CollectionUtils.isEmpty(roleDetails)) {
            for (BackRoleDetail detail : roleDetails) {
                backSysRolesDao.deleteById(detail.getId());
            }
        }
    }

    @Override
    public void saveRoleDetail(SaveRoleDTO saveRoleDTO) {
        backSysRolesDao.insert(saveRoleDTO.getBackSysRole());
        this.saveMenus(saveRoleDTO.getMenusBackDTOList(), ROOT);
        this.saveRevokes(saveRoleDTO.getRevokesBackDTOList(), ROOT);
    }


    @Override
    public List<UserSysMenusDTO> getBackSysMenus(BackSysMenus backSysMenus) {
        List<BackSysMenus> list = backSysMenusDao.queryAllByLimit(backSysMenus);
        return this.buildMenusTree(list, ROOT, null);
    }

    @Override
    public List<UserSysRevokesDTO> getBackSysRevokes(BackSysRevokes backSysRevokes) {
        List<BackSysRevokes> list = backSysRevokesDao.queryAllByLimit(backSysRevokes);
        return this.buildRevokeTree(list, ROOT, null);
    }

    public List<BackRoleDetail> getBackRoleDetail(BackRoleDetail backRoleDetail) {
        return backRoleDetailDao.queryAllByLimit(backRoleDetail);
    }

    /***
     * 组装返回的菜单树
     * @param list
     * @param pid
     * @param roleDetailList
     * @return
     */
    private List<UserSysMenusDTO> buildMenusTree(List<BackSysMenus> list,
                                                 String pid, List<BackRoleDetail> roleDetailList) {
        List<UserSysMenusDTO> ret = null;
        if (!CollectionUtils.isEmpty(list)) {
            for (BackSysMenus menu : list) {
                if (StringUtils.equals(menu.getParentId(), pid)) {
                    if (ret == null) {
                        ret = new ArrayList<>();
                    }
                    boolean needAdd = false;
                    if (!CollectionUtils.isEmpty(roleDetailList)) {
                        if (!CollectionUtils.isEmpty(
                                CollectionUtil.containsByField(roleDetailList,
                                        "keyvalue", menu.getMenuId(), BackRoleDetail.class))) {
                            needAdd = true;
                        }

                    } else {
                        needAdd = true;
                    }
                    if (needAdd) {
                        UserSysMenusDTO dto = new UserSysMenusDTO();
                        BeanUtils.copyProperties(menu, dto);
                        dto.setList(this.buildMenusTree(list, menu.getMenuId(), roleDetailList));
                        ret.add(dto);
                    }
                }
            }
        }
        return ret;
    }

    /***
     * 组装返回的权限树
     * @param list
     * @param pid
     * @param roleDetailList
     * @return
     */
    private List<UserSysRevokesDTO> buildRevokeTree(List<BackSysRevokes> list, String pid, List<BackRoleDetail> roleDetailList) {
        List<UserSysRevokesDTO> ret = null;
        if (!CollectionUtils.isEmpty(list)) {
            for (BackSysRevokes revoke : list) {
                if (StringUtils.equals(revoke.getRevokeParentid(), pid)) {
                    if (ret == null) {
                        ret = new ArrayList<>();
                    }
                    boolean needAdd = false;
                    if (!CollectionUtils.isEmpty(roleDetailList)) {
                        if (!CollectionUtils.isEmpty(
                                CollectionUtil.containsByField(roleDetailList, "keyvalue", revoke.getRevokeId(), BackRoleDetail.class))) {
                            needAdd = true;
                        }

                    } else {
                        needAdd = true;
                    }
                    if (needAdd) {
                        UserSysRevokesDTO dto = new UserSysRevokesDTO();
                        BeanUtils.copyProperties(revoke, dto);
                        dto.setList(this.buildRevokeTree(list, revoke.getRevokeId(), roleDetailList));
                        ret.add(dto);
                    }
                }
            }
        }
        return ret;
    }

    private void saveRevokes(List<UserSysRevokesDTO> list, String id) {
        if (!CollectionUtils.isEmpty(list)) {
            for (UserSysRevokesDTO dto : list) {
                BackSysRevokes revokes = new BackSysRevokes();
                BeanUtils.copyProperties(dto, revokes);
                backSysRevokesDao.insert(revokes);
                this.saveRevokes(dto.getList(), dto.getRevokeId());
            }
        }
    }

    private void saveMenus(List<UserSysMenusDTO> list, String id) {
        if (!CollectionUtils.isEmpty(list)) {
            for (UserSysMenusDTO dto : list) {
                BackSysMenus menus = new BackSysMenus();
                BeanUtils.copyProperties(dto, menus);
                backSysMenusDao.insert(menus);
                this.saveMenus(dto.getList(), dto.getMenuId());
            }
        }
    }


}
