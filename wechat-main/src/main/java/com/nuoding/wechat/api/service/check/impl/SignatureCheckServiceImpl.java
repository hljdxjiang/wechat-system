package com.nuoding.wechat.api.service.check.impl;

import com.nuoding.wechat.common.constant.RedisKey;
import com.nuoding.wechat.common.constant.SwitchKey;
import com.nuoding.wechat.common.model.MapRequest;
import com.nuoding.wechat.common.model.ReqHeader;
import com.nuoding.wechat.common.service.RedisService;
import com.nuoding.wechat.api.service.check.SignatureCheckService;
import com.nuoding.wechat.common.utils.JsonUtil;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SignatureCheckServiceImpl implements SignatureCheckService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private RedisService redisService;

    //验证报文签名开关
    @Value("${system.signature.check}")
    private String checkSignature;

    //时间戳偏差时长
    @Value("system.timestamp.expire.time")
    private String EXPIRE_TIME;

    @Override
    public boolean check(MapRequest request) {
        if (StringUtils.equalsIgnoreCase(checkSignature, SwitchKey.SWITCH_OFF)) {
            return true;
        }
        ReqHeader header = request.getHeader();
        String body = JsonUtil.obj2Json(request.getBody());
        if (!checkParam(header)) {
            logger.info("BaseProcessServiceImpl checkSignature.checkParam return false");
            return false;
        }
        //判断RequestID请求重复
        String redisRequestId = redisService.getValue(RedisKey.USER_REQUEST_REPLAY_KEY_PRE.concat(header.getRequestId()));
        if (StringUtils.equals(header.getRequestId(), redisRequestId)) {
            logger.info("BaseProcessServiceImpl checkSignature.requestID return false");
            return false;
        }
        //比对报文签章
        if (!checkSign(header, body)) {
            logger.info("BaseProcessServiceImpl checkSignature.checkSign return false");
            return false;
        }
        if (!checkExpire(Long.parseLong(header.getTimeStamp()))) {
            logger.info("BaseProcessServiceImpl checkSignature.checkExpire return false");
            return false;
        }
        return true;
    }


    /**
     * @Ahther:JHC
     * @Description:验证时间戳偏差
     * @Date:2023/4/20 下午3:23
     */
    private boolean checkExpire(long requestTime) {
        return Long.valueOf(EXPIRE_TIME) > System.currentTimeMillis() - requestTime;
    }


    /**
     * @Ahther:JHC
     * @Description:验证签名
     * @Date:2023/4/20 下午3:22
     */
    private boolean checkSign(ReqHeader header, String body) {
        String signature = header.getSignature();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(header.getUserId());
        stringBuffer.append(header.getTimeStamp());
        stringBuffer.append(header.getRequestId());
        stringBuffer.append(body);
        String decryptData = DigestUtils.sha256Hex(stringBuffer.toString());
        if (!StringUtils.equals(signature, decryptData)) {
            return false;
        }
        return true;
    }

    /***
     * 检查报文完整性
     * @param header
     * @return
     */
    private boolean checkParam(ReqHeader header) {
        if (header == null) {
            return false;
        }
        String userID = header.getUserId();
        String signature = header.getSignature();
        String timeStamp = header.getTimeStamp();
        String requestId = header.getRequestId();
        if (StringUtils.isBlank(signature) ||
                StringUtils.isBlank(timeStamp) || StringUtils.isBlank(requestId)) {
            return false;
        }
        return true;
    }
}
