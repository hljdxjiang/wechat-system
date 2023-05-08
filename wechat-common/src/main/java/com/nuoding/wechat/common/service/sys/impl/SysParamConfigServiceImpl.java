package com.nuoding.wechat.common.service.sys.impl;

import com.alibaba.excel.util.CollectionUtils;
import com.nuoding.wechat.common.constant.RedisKey;
import com.nuoding.wechat.common.dao.sys.SysParamConfigDao;
import com.nuoding.wechat.common.entity.sys.SysParamConfigEntity;
import com.nuoding.wechat.common.service.RedisService;
import com.nuoding.wechat.common.service.sys.SysParamConfigService;
import com.nuoding.wechat.common.utils.JsonUtil;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (sysParamConfig)表服务实现类
 * 系统参数配置表
 *
 * @author jhc
 * @since 2023-03-07 14:38:19
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
    public SysParamConfigEntity queryById(Integer id) {
        return this.sysParamConfigDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param sysParamConfigEntity 筛选条件
     * @return 查询结果
     */
    @Override
    public List<SysParamConfigEntity> queryByPage(SysParamConfigEntity sysParamConfigEntity) {
        return this.sysParamConfigDao.queryAllByLimit(sysParamConfigEntity);
    }

    /**
     * 新增数据
     *
     * @param sysParamConfigEntity 实例对象
     * @return 实例对象
     */
    @Override
    public SysParamConfigEntity insert(SysParamConfigEntity sysParamConfigEntity) {
        this.sysParamConfigDao.insert(sysParamConfigEntity);
        return sysParamConfigEntity;
    }

    /**
     * 修改数据
     *
     * @param sysParamConfigEntity 实例对象
     * @return 实例对象
     */
    @Override
    public SysParamConfigEntity update(SysParamConfigEntity sysParamConfigEntity) {
        this.sysParamConfigDao.update(sysParamConfigEntity);
        return this.queryById(sysParamConfigEntity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.sysParamConfigDao.deleteById(id) > 0;
    }

    @Override
    public String getConfigByCatch(String code) {
        SysParamConfigEntity config;
        String val = redisService.getValue(RedisKey.SYS_PARAM_CONFIG_KEY_PRE
                .concat(code));
        if (val != null) {
            config = JsonUtil.json2Obj(val, SysParamConfigEntity.class);
            return config.getConfigValue();
        }
        config = new SysParamConfigEntity();
        config.setConfigKey(code);
        List<SysParamConfigEntity> list = this.queryByPage(config);
        if (!CollectionUtils.isEmpty(list)) {
            config = list.get(0);
            redisService.setValue(RedisKey.SYS_PARAM_CONFIG_KEY_PRE
                    .concat(code), JsonUtil.obj2Json(config));
            return config.getConfigValue();
        }
        return Strings.EMPTY;
    }
}
