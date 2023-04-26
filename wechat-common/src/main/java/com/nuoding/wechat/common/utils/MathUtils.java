package com.nuoding.wechat.common.utils;

import com.nuoding.wechat.common.enums.RespStatusEnum;
import com.nuoding.wechat.common.exception.BusException;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ClassName:MathUtils
 * Function: 数值计算
 * Reason:
 *
 * @author wind
 * @see
 * @since Ver 1.1
 */
public class MathUtils {

    /**
     * 提供精确的加法运算。
     *
     * @param v1
     * @param v2
     * @return 两个参数的和
     */
    public static double add(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return Double.valueOf(b1.add(b2).toString());
    }

    /**
     * 提供精确的加法运算
     *
     * @param v1
     * @param v2
     * @return 两个参数数学加和，以字符串格式返回
     */
    public static String add2String(String v1, String v2) {
        BigDecimal b1 = new BigDecimal(v1);
        BigDecimal b2 = new BigDecimal(v2);
        return b1.add(b2).toString();
    }

    /**
     * 提供精确的加法运算
     * addB:(简单描述这个方法的作用)
     * TODO(在这里对方法进行描述)
     *
     * @param v1
     * @param v2
     * @return BigDecimal
     * @throws
     * @author wgs
     * @since CodingExample　Ver 1.1
     */
    public static BigDecimal addB(String v1, String v2) {
        BigDecimal b1 = new BigDecimal(v1);
        BigDecimal b2 = new BigDecimal(v2);
        return b1.add(b2);
    }

    /**
     * 提供精确的加法，多个相加
     * add:(简单描述这个方法的作用)
     * TODO(在这里对方法进行描述)
     *
     * @return String
     * @throws
     * @author wgs
     * @since CodingExample　Ver 1.1
     */
    public static BigDecimal add(String... v) {
        BigDecimal tempV = new BigDecimal("0");
        for (int i = 0; i < v.length; i++) {
            tempV = tempV.add(new BigDecimal(v[i]));
        }
        return tempV;
    }

    /**
     * 提供精确的减法运算。
     *
     * @param v1
     * @param v2
     * @return 两个参数的差
     */
    public static double subtract(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return Double.valueOf(b1.subtract(b2).toString());
    }

    /**
     * 提供精确的减法运算
     * subtractB:(简单描述这个方法的作用)
     * TODO(在这里对方法进行描述)
     *
     * @param v1
     * @param v2
     * @return BigDecimal
     * @throws
     * @author wgs
     * @since CodingExample　Ver 1.1
     */
    public static BigDecimal subtractB(String v1, String v2) {
        BigDecimal b1 = new BigDecimal(v1);
        BigDecimal b2 = new BigDecimal(v2);
        return b1.subtract(b2);
    }

    /**
     * 提供精确减法，多个相减
     * add:(简单描述这个方法的作用)
     * TODO(在这里对方法进行描述)
     *
     * @param v1--被减数
     * @param v2--减数集合
     * @return String
     * @throws
     * @author wgs
     * @since CodingExample　Ver 1.1
     */
    public static BigDecimal subtract(String v, String... args) {
        BigDecimal tempV = new BigDecimal(v);
        for (int i = 0; i < args.length; i++) {
            tempV = tempV.subtract(new BigDecimal(args[i]));
        }
        return tempV;
    }

    /**
     * 提供精确的乘法运算。
     *
     * @param v1
     * @param v2
     * @return 两个参数的积
     */
    public static double multiply(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return Double.valueOf(b1.multiply(b2).toString());
    }

    /**
     * 百分比利率转换1%-->0.01
     *
     * @param InterestRateOld
     * @return
     */
    public static String InterestRateParse(String InterestRateOld) {
        try {
            Double InterestRate = (Double) NumberFormat.getPercentInstance().parse(InterestRateOld);
            return InterestRate.toString();
        } catch (ParseException e) {
            throw new BusException(RespStatusEnum.TRANS_TYPE_ERROR);
        }
    }

    /**
     * @param key1 购买金额
     * @param key2 利率（年化利率/活期挂牌利率）
     * @param key3 期限(产品期限/活期产品持有期限)
     * @return
     */
    public static String earnings(String key1, String key2, String key3) {
        try {
            Number amount = NumberFormat.getNumberInstance().parse(key1);
            String amount1 = MathUtils.multiply(amount.toString(), MathUtils.InterestRateParse(key2));
            String amount2 = MathUtils.multiply(amount1, key3);
            double divide1 = MathUtils.divide(Double.parseDouble(amount2), Double.parseDouble("360"), 2);
            return String.valueOf(divide1);
        } catch (ParseException e) {
            throw new BusException(RespStatusEnum.FAIL_WITH_EXCEPTION);
        }

    }

    /**
     * 提供精确的乘法运算
     *
     * @param v1
     * @param v2
     * @return 两个参数的数学积，以字符串格式返回
     */
    public static String multiply(String v1, String v2) throws ParseException {
        //判断是否是利率
        if (v1.indexOf("%") != -1) {
            v1 = InterestRateParse(v1);
        } else {
            v1 = NumberFormat.getNumberInstance().parse(v1).toString();
        }
        if (v2.indexOf("%") != -1) {
            v2 = InterestRateParse(v2);
        } else {
            v2 = NumberFormat.getNumberInstance().parse(v2).toString();
        }

        BigDecimal b1 = new BigDecimal(v1);
        BigDecimal b2 = new BigDecimal(v2);
        return b1.multiply(b2).toString();
    }


    /**
     * 提供（相对）精确的除法运算。当发生除不尽的情况时，由scale参数指
     * 定精度，以后的数字四舍五入。舍入模式采用ROUND_HALF_EVEN
     *
     * @param v1
     * @param v2
     * @param scale 表示需要精确到小数点以后几位。
     * @return 两个参数的商
     */
    public static double divide(double v1, double v2, int scale) {
        return divide(v1, v2, scale, BigDecimal.ROUND_HALF_EVEN);
    }

    /**
     * 提供（相对）精确的除法运算。当发生除不尽的情况时，由scale参数指
     * 定精度，以后的数字四舍五入。舍入模式采用用户指定舍入模式
     *
     * @param v1
     * @param v2
     * @param scale      表示需要精确到小数点以后几位
     * @param round_mode 表示用户指定的舍入模式
     * @return 两个参数的商
     */
    public static double divide(double v1, double v2, int scale, int round_mode) {
        if (scale < 0) {
            throw new IllegalArgumentException("The scale must be a positive integer or zero");
        }
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.divide(b2, scale, round_mode).doubleValue();
    }


    /**
     * 提供（相对）精确的除法运算。当发生除不尽的情况时，由scale参数指
     * 定精度，以后的数字四舍五入。舍入模式采用用户指定舍入模式
     *
     * @param v1
     * @param v2
     * @param scale      表示需要精确到小数点以后几位
     * @param round_mode 表示用户指定的舍入模式
     * @return 两个参数的商，以字符串格式返回
     */
    public static String divide(String v1, String v2, int scale, int round_mode) throws ParseException {
        if (scale < 0) {
            throw new IllegalArgumentException("The scale must be a positive integer or zero");
        }

        //判断是否是利率
        if (v1.indexOf("%") != -1) {
            v1 = InterestRateParse(v1);
        } else {
            v1 = NumberFormat.getNumberInstance().parse(v1).toString();
        }
        if (v2.indexOf("%") != -1) {
            v2 = InterestRateParse(v2);
        } else {
            v2 = NumberFormat.getNumberInstance().parse(v2).toString();
        }
        BigDecimal b1 = new BigDecimal(v1);
        BigDecimal b2 = new BigDecimal(v2);
        return b1.divide(b2, scale, round_mode).toString();
    }

    /**
     * 提供精确的小数位四舍五入处理,舍入模式采用ROUND_HALF_EVEN
     *
     * @param v     需要四舍五入的数字
     * @param scale 小数点后保留几位
     * @return 四舍五入后的结果
     */
    public static double round(double v, int scale) {
        return round(v, scale, BigDecimal.ROUND_HALF_EVEN);
    }

    /**
     * 提供精确的小数位四舍五入处理
     *
     * @param v          需要四舍五入的数字
     * @param scale      小数点后保留几位
     * @param round_mode 指定的舍入模式
     * @return 四舍五入后的结果
     */
    public static double round(double v, int scale, int round_mode) {
        if (scale < 0) {
            throw new IllegalArgumentException("The scale must be a positive integer or zero");
        }
        BigDecimal b = new BigDecimal(Double.toString(v));
        return b.setScale(scale, round_mode).doubleValue();
    }

    /**
     * 提供精确的小数位四舍五入处理,舍入模式采用ROUND_HALF_EVEN
     *
     * @param v     需要四舍五入的数字
     * @param scale 小数点后保留几位
     * @return 四舍五入后的结果，以字符串格式返回
     */
    public static String round(String v, int scale) {
        return round(v, scale, BigDecimal.ROUND_HALF_EVEN);
    }

    /**
     * 提供精确的小数位四舍五入处理
     *
     * @param v          需要四舍五入的数字
     * @param scale      小数点后保留几位
     * @param round_mode 指定的舍入模式
     * @return 四舍五入后的结果，以字符串格式返回
     */
    public static String round(String v, int scale, int round_mode) {
        if (scale < 0) {
            throw new IllegalArgumentException("The scale must be a positive integer or zero");
        }
        BigDecimal b = new BigDecimal(v);
        return b.setScale(scale, round_mode).toString();
    }

    /**
     * @Comment:自动判空,如果为空,回传0
     * @Author: ZhangNing
     * @Date: 2017/9/21 16:28
     */
    public static BigDecimal getDecimalNotNull(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return BigDecimal.ZERO;
        } else {
            return bigDecimal;
        }
    }

    //公式检查
    public static void checkFormula(LinkedList list, String tempInfo, LinkedList resultList) {
        //获取公式
        try {
            getFormula(tempInfo, list, true);
        } catch (Exception e) {
            //跳出递归
            // System.out.println(e.getMessage());
        }
        //公式检查
        list.forEach(obj -> {
            String replace = obj.toString();
            try {
                if (obj.toString().indexOf("（") != -1) {
                    replace = obj.toString().replace("（", "(");
                }
                if (obj.toString().indexOf("）") != -1) {
                    replace = replace.replace("）", ")");
                }
                if (obj.toString().indexOf("×") != -1) {
                    replace = replace.replace("×", "*");
                }
                if (obj.toString().indexOf(",") != -1) {
                    replace = replace.replace(",", "");
                }
                //公式计算
                String result = MathUtils.handlernumberExpression(replace);
                resultList.add(result);
                System.out.println();
            } catch (ParseException e) {
                e.printStackTrace();
            }
        });
    }


    //提取公式
    public static void getFormula(String tempInfo, List list, boolean flag) throws Exception {
        while (flag) {
            if (tempInfo.indexOf("##{") != -1) {
                String substring = tempInfo.substring(tempInfo.indexOf("##{") + 3, tempInfo.indexOf("}##"));
                String replace = tempInfo.replaceFirst("##\\{", "");
                String replace1 = replace.replaceFirst("}##", "");
                list.add(substring);
                if (replace1.indexOf("##{") != -1) {
                    getFormula(replace1, list, true);
                } else {
                    throw new Exception(list.toString());
                }
            } else {
                throw new Exception(list.toString());
            }
        }
    }

    //公式计算
    public static String handlernumberExpression(String src) throws ParseException {
        StringBuilder builder = new StringBuilder();
        if (src.contains("(")) {
            Pattern pattern = Pattern.compile("\\(([^()]+)\\)");
            Matcher matcher = pattern.matcher(src);
            int lastend = 0;
            while (matcher.find()) {
                builder.append(src, lastend, matcher.start());
                builder.append(handlernumberExpression(matcher.group(1)));
                lastend = matcher.end();
            }
            builder.append(src.substring(lastend));

        } else {
            Pattern pattern = Pattern.compile("([\\d.]+)\\s*([*/])\\s*([\\d.\\d%]+)");
            builder.append(src);
            Matcher matcher = pattern.matcher(builder.toString());
            while (matcher.find()) {

                String f1 = matcher.group(1);
                String f2 = matcher.group(3);

                String result = "";
                switch (matcher.group(2)) {
                    case "*":
                        result = MathUtils.multiply(f1, f2);
                        break;
                    case "/":
                        result = MathUtils.divide(f1, f2, 2, BigDecimal.ROUND_HALF_UP);
                        break;
                }
                builder.replace(matcher.start(), matcher.end(), String.valueOf(result));
                matcher.reset(builder.toString());
            }
            pattern = Pattern.compile("([\\d.]+)\\s*([+-])\\s*([\\d.]+)");
            matcher = pattern.matcher(builder.toString());
            while (matcher.find()) {
                String f1 = matcher.group(1);
                String f2 = matcher.group(3);

                String result = "";
                switch (matcher.group(2)) {
                    case "+":
                        result = MathUtils.add2String(f1, f2);
                        break;
                    case "-":
                        result = MathUtils.subtractB(f1, f2).toString();
                        break;
                }
                builder.replace(matcher.start(), matcher.end(), String.valueOf(result));
                matcher.reset(builder.toString());

            }
            return builder.toString();
        }
        return handlernumberExpression(builder.toString());
    }
}

