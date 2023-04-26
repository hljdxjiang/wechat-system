package com.nuoding.wechat.common.service.impl;

import com.alibaba.excel.util.CollectionUtils;
import com.nuoding.wechat.common.constant.RedisKey;
import com.nuoding.wechat.common.constant.SysParamConfigKey;
import com.nuoding.wechat.common.dao.SysParamConfigDao;
import com.nuoding.wechat.common.entity.SysParamConfig;
import com.nuoding.wechat.common.service.RedisService;
import com.nuoding.wechat.common.service.SysParamConfigService;
import com.nuoding.wechat.common.utils.JsonUtil;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SysParamConfig)表服务实现类
 *
 * @author jhc
 * @since 2023-03-07 14:39:01
 */
@Service
public class SysParamConfigServiceImpl implements SysParamConfigService {
    @Resource
    private SysParamConfigDao sysParamConfigDao;

    @Autowired
    private RedisService redisService;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysParamConfig queryById(Integer id) {
        return this.sysParamConfigDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param sysParamConfig 筛选条件
     * @return 查询结果
     */
    @Override
    public List<SysParamConfig> queryByPage(SysParamConfig sysParamConfig) {
        return this.sysParamConfigDao.queryAllByLimit(sysParamConfig);
    }

    /**
     * 新增数据
     *
     * @param sysParamConfig 实例对象
     * @return 实例对象
     */
    @Override
    public SysParamConfig insert(SysParamConfig sysParamConfig) {
        this.sysParamConfigDao.insert(sysParamConfig);
        return sysParamConfig;
    }

    /**
     * 修改数据
     *
     * @param sysParamConfig 实例对象
     * @return 实例对象
     */
    @Override
    public SysParamConfig update(SysParamConfig sysParamConfig) {
        this.sysParamConfigDao.update(sysParamConfig);
        redisService.delValue(RedisKey.SYS_PARAM_CONFIG_KEY_PRE.concat(sysParamConfig.getTenantId())
                .concat(sysParamConfig.getConfigKey()));
        return this.queryById(sysParamConfig.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        SysParamConfig config = this.queryById(id);
        if (config != null) {
            redisService.delValue(RedisKey.SYS_PARAM_CONFIG_KEY_PRE.concat(config.getTenantId())
                    .concat(config.getConfigKey()));

            return this.sysParamConfigDao.deleteById(id) > 0;
        }
        return false;

    }

    @Override
    public String getConfigByCatch(String tenantId, SysParamConfigKey configKey) {
        SysParamConfig config = null;
        String val = redisService.getValue(RedisKey.SYS_PARAM_CONFIG_KEY_PRE.concat(tenantId)
                .concat(configKey.getCode()));
        if (val != null) {
            config = JsonUtil.json2Obj(val, SysParamConfig.class);
            return config.getConfigValue();
        }
        config = new SysParamConfig();
        config.setTenantId(tenantId);
        config.setConfigKey(configKey.getCode());
        List<SysParamConfig> list = this.queryByPage(config);
        if (!CollectionUtils.isEmpty(list)) {
            config = list.get(0);
            redisService.setValue(RedisKey.SYS_PARAM_CONFIG_KEY_PRE.concat(tenantId)
                    .concat(configKey.getCode()), JsonUtil.obj2Json(config));
            return config.getConfigValue();
        }
        return Strings.EMPTY;
    }
}
