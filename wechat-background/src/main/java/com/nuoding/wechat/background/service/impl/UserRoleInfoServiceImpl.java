package com.nuoding.wechat.background.service.impl;

import com.alibaba.excel.util.CollectionUtils;
import com.nuoding.wechat.background.model.SaveRoleDTO;
import com.nuoding.wechat.background.model.UserSysMenusDTO;
import com.nuoding.wechat.background.model.UserSysRevokesDTO;
import com.nuoding.wechat.background.service.UserRoleInfoService;
import com.nuoding.wechat.common.constant.RedisKey;
import com.nuoding.wechat.common.dao.back.BackRuleDetailDao;
import com.nuoding.wechat.common.dao.back.BackSysMenusDao;
import com.nuoding.wechat.common.dao.back.BackSysRevokesDao;
import com.nuoding.wechat.common.dao.back.BackSysRolesDao;
import com.nuoding.wechat.common.entity.back.BackRuleDetailEntity;
import com.nuoding.wechat.common.entity.back.BackSysMenusEntity;
import com.nuoding.wechat.common.entity.back.BackSysRevokesEntity;
import com.nuoding.wechat.common.entity.back.BackSysRolesEntity;
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
    private BackRuleDetailDao backRuleDetailDao;

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
        BackRuleDetailEntity detail = new BackRuleDetailEntity();
        detail.setRoleId(roleId);
        detail.setTenantId(tenantID);
        List<BackRuleDetailEntity> roleDetailList = this.getBackRoleDetail(detail);
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
        BackSysRolesEntity query = new BackSysRolesEntity();
        query.setRoleId(roleId);
        query.setTenantId(tenantId);
        List<BackSysRolesEntity> list = backSysRolesDao.queryAllByLimit(query);
        if (!CollectionUtils.isEmpty(list)) {
            for (BackSysRolesEntity role : list) {
                backSysRolesDao.deleteById(role.getId());
            }
        }
        BackRuleDetailEntity detailquery = new BackRuleDetailEntity();
        detailquery.setRoleId(roleId);
        detailquery.setTenantId(tenantId);
        List<BackRuleDetailEntity> roleDetails = backRuleDetailDao.queryAllByLimit(detailquery);
        if (!CollectionUtils.isEmpty(roleDetails)) {
            for (BackRuleDetailEntity detail : roleDetails) {
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
    public List<UserSysMenusDTO> getBackSysMenus(BackSysMenusEntity backSysMenus) {
        List<BackSysMenusEntity> list = backSysMenusDao.queryAllByLimit(backSysMenus);
        return this.buildMenusTree(list, ROOT, null);
    }

    @Override
    public List<UserSysRevokesDTO> getBackSysRevokes(BackSysRevokesEntity backSysRevokes) {
        List<BackSysRevokesEntity> list = backSysRevokesDao.queryAllByLimit(backSysRevokes);
        return this.buildRevokeTree(list, ROOT, null);
    }

    public List<BackRuleDetailEntity> getBackRoleDetail(BackRuleDetailEntity backRoleDetail) {
        return backRuleDetailDao.queryAllByLimit(backRoleDetail);
    }

    /***
     * 组装返回的菜单树
     * @param list
     * @param pid
     * @param roleDetailList
     * @return
     */
    private List<UserSysMenusDTO> buildMenusTree(List<BackSysMenusEntity> list,
                                                 String pid, List<BackRuleDetailEntity> roleDetailList) {
        List<UserSysMenusDTO> ret = null;
        if (!CollectionUtils.isEmpty(list)) {
            for (BackSysMenusEntity menu : list) {
                if (StringUtils.equals(menu.getParentId(), pid)) {
                    if (ret == null) {
                        ret = new ArrayList<>();
                    }
                    boolean needAdd = false;
                    if (!CollectionUtils.isEmpty(roleDetailList)) {
                        if (!CollectionUtils.isEmpty(
                                CollectionUtil.containsByField(roleDetailList,
                                        "keyvalue", menu.getMenuId(), BackRuleDetailEntity.class))) {
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
    private List<UserSysRevokesDTO> buildRevokeTree(List<BackSysRevokesEntity> list, String pid, List<BackRuleDetailEntity> roleDetailList) {
        List<UserSysRevokesDTO> ret = null;
        if (!CollectionUtils.isEmpty(list)) {
            for (BackSysRevokesEntity revoke : list) {
                if (StringUtils.equals(revoke.getRevokeParentid(), pid)) {
                    if (ret == null) {
                        ret = new ArrayList<>();
                    }
                    boolean needAdd = false;
                    if (!CollectionUtils.isEmpty(roleDetailList)) {
                        if (!CollectionUtils.isEmpty(
                                CollectionUtil.containsByField(roleDetailList, "keyvalue", revoke.getRevokeId(), BackRuleDetailEntity.class))) {
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
                BackSysRevokesEntity revokes = new BackSysRevokesEntity();
                BeanUtils.copyProperties(dto, revokes);
                backSysRevokesDao.insert(revokes);
                this.saveRevokes(dto.getList(), dto.getRevokeId());
            }
        }
    }

    private void saveMenus(List<UserSysMenusDTO> list, String id) {
        if (!CollectionUtils.isEmpty(list)) {
            for (UserSysMenusDTO dto : list) {
                BackSysMenusEntity menus = new BackSysMenusEntity();
                BeanUtils.copyProperties(dto, menus);
                backSysMenusDao.insert(menus);
                this.saveMenus(dto.getList(), dto.getMenuId());
            }
        }
    }


}
