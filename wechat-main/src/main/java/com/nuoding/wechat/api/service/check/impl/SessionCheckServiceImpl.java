package com.nuoding.wechat.api.service.check.impl;

import com.nuoding.wechat.api.service.check.SessionCheckService;
import com.nuoding.wechat.common.constant.SessionKey;
import com.nuoding.wechat.common.constant.SwitchKey;
import com.nuoding.wechat.common.constant.UtilConstant;
import com.nuoding.wechat.common.interceptor.SessionValue;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SessionCheckServiceImpl implements SessionCheckService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    //验证会话开关
    @Value("${system.session.check}")
    private String checkSession;

    @Override
    public boolean check(SessionValue sessionValue) {
        if (sessionValue == null) {
            return true;
        }

        if (StringUtils.equalsIgnoreCase(checkSession, SwitchKey.SWITCH_OFF)) {
            return true;
        }

        if (sessionValue.values().length < 1) {
            return true;
        }

        String[] values = sessionValue.values();
        String[] vs = null;
        boolean oneFind = false;
        for (String v : values) {
            if (!StringUtils.isEmpty(v) && v.contains(UtilConstant.OR)) {
                vs = null;
                oneFind = false;
                vs = v.split(UtilConstant.OR);
                if (vs == null || vs.length < 1) {
                    return false;
                }

                for (String vsOne : vs) {
                    String sv = SessionKey.getValue(vsOne);
                    if (!StringUtils.isEmpty(sv)) {
                        oneFind = true;
                        break;
                    }
                }

                if (!oneFind) {
                    return false;
                }
            } else {
                String svalue = SessionKey.getValue(v);
                if (StringUtils.isEmpty(svalue)) {
                    return false;
                }
            }
        }
        logger.info("handler user:" + SessionKey.getLoginID());
        return true;
    }
}
