package com.nuoding.wechat.common.constant;

/**
 * @Classname CommonConstant
 * @Description 公共常量实体类
 * @Date 2022/8/7 15:54
 * @Created by jhc
 */
public class CommonConstant {

    /**
     * 仅为中国税收居民
     */
    public static final String TAX_FLAG = "1";


    /**
     * 是否取得自证证明(Y-是)
     */
    public static final String TAX_IS_HAVE_Y = "Y";

    /**
     * 报文头路由字段分割符
     */
    public static final String SPLIT_FLAG = "|";

    /**
     * 产品停售状态标识
     */
    public static final String SALE_STATUS_OUT = "0";

    /**
     * 产品在售状态标识
     */
    public static final String SALE_STATUS_SELL = "1";


    /**
     * 报文头路由body字段分割符
     */
    public static final String SPLIT_FLAG_BODY = "@";

    /**
     * 获取routeKey
     */
    public static final String SPLIT_ROUTE_KEY_FLAG = "\\|";

    /**
     * 存在未结清存款标识
     */
    public static final String IS_HAVE = "Y";

    /**
     * 未存在未结清存款标识
     */
    public static final String IS_NOT_HAVE = "N";


    public static final String SUCCESS_FLAG = "Y";

    /**
     * 人脸识别成功标识
     */
    public static final String FACE_MATCH_SUCCESS_FLAG = "0";

    /**
     * 交易记录使用:花点时间扣款账户
     **/
    public static final String ORCHARD_DEPOSIT_PAY_ACCOUNT = "orchard.deposit.pay.account";

    /**
     * 新版隐私协议用户确认状态:
     * 1:表示首次隐私政策已确认
     * 2:表示第二次隐私协议已确认状态
     * 3:表示第三次隐私协议状态已确认
     */
    public static final String CONFIRM_SUCCESS_FLAG = "3";

    /**
     * ocr图片上传图片类型标识:正面
     */
    public static final String OCR_FACE_ = "face";

    /**
     * ocr图片上传图片类型标识:反面
     */
    public static final String OCR_FRONT = "front";

    /**
     * ocr图片上传图片类型标识:手持
     */
    public static final String OCR_HAND = "hand";

    /**
     * ocr图片上传标识:0代表否，1代表是
     */
    public static final String NOT_OCR_FLAG = "0";


    public static final String OCR_BACK = "back";

    public static final String OCR_STATE_SUCC = "1";

    public static final String SUCCESS = "1";

    public static final String FAIL = "0";

    public static final String PROCESSING = "2";


    public static final String YILLION_BANK_NAME = "亿联银行";

    public static final String ALL = "ALL";

    /**
     * 账户挂失操作类型
     */
    public static final String OPTION_LOST = "VL";

    /**
     * 账户解挂失操作类型
     */
    public static final String OPTION_CANCEL_LOST = "UV";

    /**
     * 分页默认条数
     */
    public static final String PAGE_VALUE = "10";

    /**
     * 产品开关开启状态
     */
    public static final String SWITCH_ON = "on";

    public static final String SWITCH_OFF = "off";

    /**
     * 推荐表配置用途类型：推荐位
     */
    public static final String FEATURE_FIRST = "FEATURE_FIRST";

    /**
     * 推荐表配置用途类型：加息券支持产品列表
     */
    public static final String COUPON_INTEREST = "COUPON_INTEREST";

    /**
     * 起购金额占位符
     */
    public static final String MIN_AMOUNT_PLACEHOLDER = "<minAmount>";

    /**
     * 期限占位符
     */
    public static final String TERM_PLACEHOLDER = "(term)";

    /**
     * 年化利率占位符
     */
    public static final String RATE_PRO_PLACEHOLDER = "<rate>";
    /**
     * 产品期限占位符
     */
    public static final String TERM_PROD_PLACEHOLDER = "<term>";
    /**
     * 产品期限类型占符
     */
    public static final String TERMTYPE_PROD_PLACEHOLDER = "<termType>";
    /**
     * 付息周期占位符
     */
    public static final String PERIOD_PROD_PLACEHOLDER = "<period>";
    /**
     * 付息周期类型占符
     */
    public static final String PERIODTYPE_PROD_PLACEHOLDER = "<periodType>";
    /**
     * 产品名称占位符
     */
    public static final String PRODNAME_PROD_PLACEHOLDER = "<prodName>";
    /**
     * 提前支取利率占位符
     */
    public static final String AHEADRATE_PROD_PLACEHOLDER = "<aheadRate>";

    /**
     * 示例购买金额
     */
    public static final String EXAMPLEBUYAMT_PROD_PLACEHOLDER = "<exampleBuyAmt>";
    /**
     * 示例周期付息支取时利息分子
     */
    public static final String INTERESTGETTINGMOLECULE_PROD_PLACEHOLDER = "<interestGettingMolecule>";
    /**
     * 示例周期付息已获利息分子
     */
    public static final String INTERESTGETTEDMOLECULE_PROD_PLACEHOLDER = "<interestGettedMolecule>";
    /**
     * 整存整取提前支取持有天数
     */
    public static final String DEPOSITPREDRAWDAYS_PROD_PLACEHOLDER = "<depositPreDrawDays>";
    /**
     * 产品期限天数
     */
    public static final String TERMDAY_PROD_PLACEHOLDER = "<termDay>";
    /**
     * 付息周期天数
     */
    public static final String PERIODDAY_PROD_PLACEHOLDER = "<periodDay>";
    /**
     * 实例说明计算结果1
     */
    public static final String TOTALAMT1_PROD_PLACEHOLDER = "<totalAmt1>";
    /**
     * 实例说明计算结果2
     */
    public static final String TOTALAMT2_PROD_PLACEHOLDER = "<totalAmt2>";
    /**
     * 实例说明计算结果3
     */
    public static final String TOTALAMT3_PROD_PLACEHOLDER = "<totalAmt3>";
    /**
     * 模板类型：整存整取
     */
    public static final String DEPOSIT_TAKING = "DEPOSIT_TAKING";

    /**
     * 模板类型：整存整取4.0
     */
    public static final String DEPOSIT_TAKING_NEW = "DEPOSIT_TAKING_NEW";

    /**
     * 模板类型：周期付息
     */
    public static final String PERIODIC_INTEREST_PAYMENTS = "PERIODIC_INTEREST_PAYMENTS";
    /**
     * 产品模板类型：周期付息
     */
    public static final String PRODUCT_DEPOSIT_TAKING = "D";

    /**
     * 产品模板类型：整存整取
     */
    public static final String PRODUCT_PERIODIC_INTEREST_PAYMENTS = "P";

    public static final String PP = "PP";

    public static final String BB = "BB";

    public static final String M = "M";

    public static final String UTF8 = "utf-8";

    public static final String COM_FLAG_ZERO = "0";

    public static final String COM_FLAG_ONE = "1";

    public static final String COM_FLAG_TWO = "2";

    public static final String COM_FLAG_THREE = "3";

    public static final String COM_FLAG_FOUR = "4";

    /**
     * 证件有效期为长期统一用户中心定义类型
     */
    public static final String ID_LONG_TIME_TYPE = "99991231";

    public static final String DEFAULT_ERROR_MESSAGE = "查询信息失败,请稍后重试";

    public static final String I = "I";

    public static final String D = "D";

    /**
     * 更换绑定账户
     */
    public static final String CHANGE_BIND_CARD = "A";

    /**
     * 埋点手机号加密值秘钥
     */
    public static final String BURIED_POINT_SECRET_KEY = "buried.point.secret.key";

    /**
     * 存款账户类型
     */
    public static final String DEPOSIT_ACCT_CLASS = "T";

    /**
     * 续存类型O-本息转存 W-本金转存
     */
    public static final String AUTO_RENEW_ROLLOVER_O = "O";

    /**
     * 续存类型:W-本金转存
     */
    public static final String AUTO_RENEW_W = "W";

    /**
     * 续存类型O-本息转存 W-本金转存
     */
    public static final String RENEWAL_NUM_ONE = "1";

    /**
     * 续存类型:W-本金转存
     */
    public static final String RENEWAL_NUM_LONG_TERM = "9999";

    /**
     * 续存类型:存款配置中台续存类型
     * 永久续存
     */
    public static final String YJXC = "YJXC";

    /**
     * 续存类型:存款配置中台续存类型
     * 单次续存
     */
    public static final String DCXC = "DCXC";

    /**
     * 图片前缀
     */
    public static final String BASE64_PREFIX = "data:image/jpeg;base64,";

    /**
     * 人脸模式：只使用旷世人脸识别
     */
    public static final String FACE_MATCH_PATTERN_KS = "KS";

    /**
     * 人脸模式：使用旷世和百度人脸识别
     */
    public static final String FACE_MATCH_PATTERN_KS_BD = "KS_BD";

    /**
     * 行为埋点唯一ID前缀
     */
    public static final String DISTINCT_ID_PREFIX = "MOBILE_";

    /**
     * 钱包plus产品编码
     */
    public static final String WALLET_PLUS_CODE = "WALLET_PLUS_NEW";

    /**
     * 钱包plus产品编码
     */
    public static final String COM_FLAG_ZERO_ONE = "01";

    /**
     * 连连看账户冻结提示语
     */
    public static final String LLK_FAIL_MSG = "该笔存款目前无法支取，如您参加了转购理财活动，请先撤销活动申请后再来支取该笔存款，或咨询我行客服。";

    /**
     * 用户标签分隔符
     */
    public static final String LABEL_SPLIT_FLAG = ",";

}
