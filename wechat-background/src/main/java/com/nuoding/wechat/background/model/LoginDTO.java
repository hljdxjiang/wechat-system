package com.nuoding.wechat.background.model;

/**
 * @Ahther:JHC
 * @Description:用户登录DTO
 * @Date:2023/4/11 下午5:15
 */
public class LoginDTO {
    String userId;
    String passWD;
    String passType;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassWD() {
        return passWD;
    }

    public void setPassWD(String passWD) {
        this.passWD = passWD;
    }

    public String getPassType() {
        return passType;
    }

    public void setPassType(String passType) {
        this.passType = passType;
    }
}
