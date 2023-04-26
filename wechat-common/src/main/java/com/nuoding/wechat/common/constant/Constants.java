package com.nuoding.wechat.common.constant;

/**
 * @author :tf
 * @create :2022/05/07
 * @desc :
 **/
public class Constants {
    private Constants() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * 用户密码加盐模板
     */
    public static final String USER_PWD_PREFIX_TEMPLATE = "{%s}-{%s}";
    /**
     * 角色编号key
     */
    public static final String ROLE_NO_KEY = "CPC_ROLE_NO";
    /**
     * 用户编号key
     */
    public static final String USER_NO_KEY = "CPC_USER_NO";
    /**
     * 编号位数 1+7位自增
     */
    public static final String OFFSET = "1%07d";
    /**
     * tokenHandler 检查通过后用户信息存在threadlocal中的key
     */
    public static final String CURRENT_USER_INFO = "CURRENT_USER_INFO";
    /**
     * requuest请求头中的token所在key
     */
    public static final String LOGIN_TOKEN_HEADER = "Authorization";

    /**
     * 登录token 缓存前缀
     */
    public static final String USER_TOKEN_PREFIX = "LOGIN_TOKEN_%s_%s";
    /**
     * 登录失败锁定缓存前缀
     */
    public static final String LOGIN_FAIL_LOCK_PREFIX = "LOGIN_FAIL_LOCK_%s";
    /**
     * 登录初始化密码
     */
    public static final String DEFAULT_PASSWORD = "Yillion@666";
    /**
     * 健康状态
     */
    public static final String HEALTH_MSG = "OK";

    /**
     * 名单删除密码
     */
    public static final String ROLL_DELETE_PASSWORD = "P@ssw0rd";

    /**
     * 日志打印，请求时的唯一标识符
     */
    public static final String REQUEST_ID = "requestId";

    /**
     * 产品信息缓存前缀
     */
    public static final String PRODUCT_INFO_CACHE_PREFIX = "product_info_cache_";

    /**
     * 核心产品数据缓存
     */
    public static final String CBS_PRODUCT_INFO_CACHE = "cbs_product_info_";

    /**
     * 开屏页模块编码，当前版本在程序中进行初始化，且不可更改
     * date:2022-09-03
     */
    public static final String OPEN_SCREEN_PAGE_MODULE_CODE = "OPEN_PAGE";

    /**
     * 缓存核心产品信息定时任务锁
     */
    public static final String CBS_PRODUCT_CACHE_TASK_LOCK = "cbs_product_cache_task_lock";

    /**
     * 合众金科文件处理lock
     */
    public static final String HZJK_FILE_TASK_LOCK = "hzjk_file_task_lock";

    /**
     * 缓存核心产品信息开关
     */
    public static final String CBS_PRODUCT_CACHE_OFF = "cbs_product_cache_off";

    /**
     * 核心产品信息刷新定时任务锁
     */
    public static final String CBS_PRODUCT_INFO_REFRESH = "cbs_product_info_refresh";

    /**
     * ESC接口请求缓存key
     */
    public static final String ESC_LOCK_PREFIX = "ESC_LOCK_PREFIX_%s";

    /**
     * 产品详情remark
     */
    public static final String PRODUCT_REMARK = "注：以上示例仅供参考，实际收益以具体到账为准。";

    /**
     * 产品缓存前缀
     */
    public static final String PRODUCT_CACHE_PREFIX = "channel_product_cache_prefix";

    /**
     * 系统配置缓存key 长期生效
     */
    public static final String SYSTEM_ARGUMENT_CACHE = "system_argument_cache";


}
