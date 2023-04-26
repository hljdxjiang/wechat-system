package com.nuoding.wechat.common.utils;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期工具类, 继承org.apache.commons.lang.time.DateUtils类
 */
public class DateUtils extends org.apache.commons.lang3.time.DateUtils {

    private static final String DATE_TIME_PATTERN_TIMESTAMP = "yyyyMMddHHmmssSSS";

    private static final String[] parsePatterns = {
            "yyyy-MM-dd", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm", "yyyy-MM",
            "yyyy/MM/dd", "yyyy/MM/dd HH:mm:ss", "yyyy/MM/dd HH:mm", "yyyy/MM",
            "yyyy.MM.dd", "yyyy.MM.dd HH:mm:ss", "yyyy.MM.dd HH:mm", "yyyy.MM"};

    /**
     * 得到当前日期字符串 格式（yyyy-MM-dd）
     */
    public static String getDate() {
        return getDate("yyyy-MM-dd");
    }

    /**
     * 得到当前日期字符串 格式（yyyy-MM-dd） pattern可以为："yyyy-MM-dd" "HH:mm:ss" "E"
     */
    public static String getDate(String pattern) {
        return DateFormatUtils.format(new Date(), pattern);
    }

    /**
     * 得到日期字符串 默认格式（yyyy-MM-dd） pattern可以为："yyyy-MM-dd" "HH:mm:ss" "E"
     */
    public static String formatDate(Date date, Object... pattern) {

        String formatDate = null;
        if (date != null) {
            if (pattern != null && pattern.length > 0) {
                formatDate = DateFormatUtils.format(date, pattern[0].toString());
            } else {
                formatDate = DateFormatUtils.format(date, "yyyy-MM-dd");
            }
        }
        return formatDate;
    }

    /**
     * 得到日期时间字符串，转换格式（yyyy-MM-dd HH:mm:ss）
     */
    public static String formatDateTime(Date date) {
        return formatDate(date, "yyyy-MM-dd HH:mm:ss");
    }

    /**
     * 得到日期时间字符串，转换格式（yyyyMMdd）
     */
    public static String formatDateTi(Date date) {
        return formatDate(date, "yyyyMMdd");
    }

    /**
     * 得到当前时间字符串 格式（HH:mm:ss）
     */
    public static String getTime() {
        return formatDate(new Date(), "HH:mm:ss");
    }

    /**
     * 得到当前日期和时间字符串 格式（yyyy-MM-dd HH:mm:ss）
     */
    public static String getDateTime() {
        return formatDate(new Date(), "yyyy-MM-dd HH:mm:ss");
    }

    /**
     * 得到当前年份字符串 格式（yyyy）
     */
    public static String getYear() {
        return formatDate(new Date(), "yyyy");
    }

    /**
     * 得到当前月份字符串 格式（MM）
     */
    public static String getMonth() {
        return formatDate(new Date(), "MM");
    }

    /**
     * 得到当天字符串 格式（dd）
     */
    public static String getDay() {
        return formatDate(new Date(), "dd");
    }

    /**
     * 得到当前星期字符串 格式（E）星期几
     */
    public static String getWeek() {
        return formatDate(new Date(), "E");
    }

    /**
     * 得到当前日期时间戳
     */
    public static String getNowDate() {
        return formatDate(new Date(), "yyyyMMdd");
    }

    /**
     * 日期型字符串转化为日期 格式
     * { "yyyy-MM-dd", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm",
     * "yyyy/MM/dd", "yyyy/MM/dd HH:mm:ss", "yyyy/MM/dd HH:mm",
     * "yyyy.MM.dd", "yyyy.MM.dd HH:mm:ss", "yyyy.MM.dd HH:mm" }
     */
    public static Date parseDate(Object str) {
        if (str == null) {
            return null;
        }
        try {
            return parseDate(str.toString(), parsePatterns);
        } catch (ParseException e) {
            return null;
        }
    }

    /**
     * @Comment: 将字符串转成yyyy-mm-dd,字符串为空或转换异常则返回null
     * @Author: wyx
     * @Date: 2017-09-26
     */
    public static Date strToDateOrNull(String date) {
        if (StringUtils.isBlank(date)) {
            return null;
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date newDate = null;
            try {
                newDate = sdf.parse(date);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            return newDate;
        }
    }


    /**
     * @Comment: 将字符串转成yyyy-mm-dd,字符串为空或转换异常则返回null
     * @Author: wyx
     * @Date: 2017-09-26
     */
    public static Date strToDateTimeOrNull(String date) {
        if (StringUtils.isBlank(date)) {
            return null;
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date newDate = null;
            try {
                newDate = sdf.parse(date);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            return newDate;
        }
    }


    /**
     * 获取过去的天数
     *
     * @param date
     * @return
     */
    public static long pastDays(Date date) {
        long t = System.currentTimeMillis() - date.getTime();
        return t / (24 * 60 * 60 * 1000);
    }

    /**
     * 获取过去的小时
     *
     * @param date
     * @return
     */
    public static long pastHour(Date date) {
        long t = System.currentTimeMillis() - date.getTime();
        return t / (60 * 60 * 1000);
    }

    /**
     * 获取过去的分钟
     *
     * @param date
     * @return
     */
    public static long pastMinutes(Date date) {
        long t = System.currentTimeMillis() - date.getTime();
        return t / (60 * 1000);
    }

    public static long pastSeconds(Date date) {
        long t = System.currentTimeMillis() - date.getTime();
        return t / (1000);
    }

    /**
     * 转换为时间（天,时:分:秒.毫秒）
     *
     * @param timeMillis
     * @return
     */
    public static String formatDateTime(long timeMillis) {
        long day = timeMillis / (24 * 60 * 60 * 1000);
        long hour = (timeMillis / (60 * 60 * 1000) - day * 24);
        long min = ((timeMillis / (60 * 1000)) - day * 24 * 60 - hour * 60);
        long s = (timeMillis / 1000 - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60);
        long sss = (timeMillis - day * 24 * 60 * 60 * 1000 - hour * 60 * 60 * 1000 - min * 60 * 1000 - s * 1000);
        return (day > 0 ? day + "," : "") + hour + ":" + min + ":" + s + "." + sss;
    }

    /**
     * 获取两个日期之间的天数
     *
     * @param before
     * @param after
     * @return
     */
    public static double getDistanceOfTwoDate(Date before, Date after) {
        long beforeTime = before.getTime();
        long afterTime = after.getTime();
        return (afterTime - beforeTime) / (1000 * 60 * 60 * 24);
    }

    /**
     * @Ahther:JHC
     * @Description:获取两个日期的绝对分钟差
     * @Date:2023/4/12 下午3:50
     */
    public static int getTimeDifference(Timestamp formatTime1, Timestamp formatTime2) {
        SimpleDateFormat timeformat = new SimpleDateFormat("yyyy-MM-dd,HH:mm:ss");
        long t1 = formatTime1.getTime();
        long t2 = formatTime2.getTime();
        if (t1 > t2) {
            return (int) (((t1 - t2) / 1000) / 60);
        } else {
            return (int) (((t2 - t1) / 1000) / 60);
        }
    }

    public static String formatLocalDate(LocalDate localDate, String formatter) {
        formatter = formatter == null || "".equals(formatter) ? "yyyy.MM.dd" : formatter;
        return localDate.format(DateTimeFormatter.ofPattern(formatter));
    }

    public static String getDateTimeMsecStr() {
        return DateFormatUtils.format(System.currentTimeMillis(), DATE_TIME_PATTERN_TIMESTAMP);
    }

//===========guofei start=================

    /**
     * 差值计算类别
     */
    public enum Type {
        /**
         * 毫秒数
         */
        MSEC,
        /**
         * 秒数
         */
        SECOND,
        /**
         * 分钟数
         */
        MINUTE,
        /**
         * 小时数
         */
        HOUR,
        /**
         * 天数
         */
        DAY,
        /**
         * 周(星期/礼拜)数
         */
        WEEK,
        /**
         * 月数
         */
        MONTH,
        /**
         * 年数
         */
        YEAR
    }

    /**
     * 日期加减计算
     *
     * @param value  当前日期值
     * @param offset 加减偏移量(差值)
     * @param type   计算类型
     * @return 计算结果
     */
    public static Date dateReckon(Date value, Long offset, Type type) {
        Date now = null;
        try {
            if (value != null && offset != null && type != null) {
                Long abs = Math.abs(offset);//获取偏移量绝对值
                Calendar data = Calendar.getInstance();
                data.setTime(value);
                if (type.equals(Type.MSEC)) {
                    if (abs > 3122064000000L) {
                        throw new Exception("Offset is out of range [-3122064000000 ~ 3122064000000]!");
                    } else {
                        Long time = data.getTimeInMillis();
                        data.setTimeInMillis(time + offset);
                        now = data.getTime();
                    }
                } else if (type.equals(Type.SECOND)) {
                    if (abs > 3122064000L) {
                        throw new Exception("Offset is out of range [-3122064000 ~ 3122064000]!");
                    } else {
                        Long time = data.getTimeInMillis();
                        data.setTimeInMillis(time + (offset * 1000L));
                        now = data.getTime();
                    }
                } else if (type.equals(Type.MINUTE)) {
                    if (abs > 52034400) {
                        throw new Exception("Offset is out of range [-52034400 ~ 52034400]!");
                    } else {
                        data.add(Calendar.MINUTE, offset.intValue());
                        now = data.getTime();
                    }
                } else if (type.equals(Type.HOUR)) {
                    if (abs > 867240) {
                        throw new Exception("Offset is out of range [-867240 ~ 867240]!");
                    } else {
                        data.add(Calendar.HOUR, offset.intValue());
                        now = data.getTime();
                    }
                } else if (type.equals(Type.DAY)) {
                    if (abs > 36135) {
                        throw new Exception("Offset is out of range [-36135 ~ 36135]!");
                    } else {
                        data.add(Calendar.DATE, offset.intValue());
                        now = data.getTime();
                    }
                } else if (type.equals(Type.WEEK)) {
                    if (abs > 5148) {
                        throw new Exception("Offset is out of range [-5148 ~ 5148]!");
                    } else {
                        data.add(Calendar.WEEK_OF_YEAR, offset.intValue());
                        now = data.getTime();
                    }
                } else if (type.equals(Type.MONTH)) {
                    if (abs > 1188) {
                        throw new Exception("Offset is out of range [-1188 ~ 1188]!");
                    } else {
                        data.add(Calendar.MONTH, offset.intValue());
                        now = data.getTime();
                    }
                } else if (type.equals(Type.YEAR)) {
                    if (abs > 999) {
                        throw new Exception("Offset is out of range [-999 ~ 999]!");
                    } else {
                        data.add(Calendar.YEAR, offset.intValue());
                        now = data.getTime();
                    }
                }
            } else {
                now = value;
            }
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        return now;
    }


    /**
     * 计算两个时间之间的差值
     *
     * @param args1 时间1
     * @param args2 时间2
     * @param type  差值比较的类别
     * @return 偏移量(差值)结果
     */
    public static Long dateDeviation(Date args1, Date args2, Type type) {
        Long value = null;
        try {
            if (args1 != null && args2 != null && type != null) {
                Calendar one = Calendar.getInstance();
                one.setTime(args1);
                Calendar two = Calendar.getInstance();
                two.setTime(args2);
                if (type.equals(Type.MSEC)) {
                    value = (two.getTimeInMillis() - one.getTimeInMillis());
                } else if (type.equals(Type.SECOND)) {
                    value = ((two.getTimeInMillis() - one.getTimeInMillis()) / 1000);
                } else if (type.equals(Type.MINUTE)) {
                    value = ((two.getTimeInMillis() - one.getTimeInMillis()) / (1000 * 60));
                } else if (type.equals(Type.HOUR)) {
                    value = ((two.getTimeInMillis() - one.getTimeInMillis()) / (1000 * 60 * 60));
                } else if (type.equals(Type.DAY)) {
                    //value=((two.getTimeInMillis()-one.getTimeInMillis())/(1000*60*60*24));
                    value = ((long) (Math.rint((two.getTimeInMillis() - one.getTimeInMillis()) / (1000 * 60 * 60 * 24))));
                } else if (type.equals(Type.WEEK)) {
                    value = ((two.getTimeInMillis() - one.getTimeInMillis()) / (1000 * 60 * 60 * 24 * 7));
                } else if (type.equals(Type.MONTH)) {
                    Long m1 = Long.valueOf(one.get(Calendar.YEAR) * 12 + one.get(Calendar.MONTH));
                    Long m2 = Long.valueOf(two.get(Calendar.YEAR) * 12 + two.get(Calendar.MONTH));
                    value = m2 - m1;
                } else if (type.equals(Type.YEAR)) {
                    value = Long.valueOf((two.get(Calendar.YEAR) - one.get(Calendar.YEAR)));
                }
            }
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        return value;
    }

    /**
     * @Comment:获取开始时间
     * @Date: 2017/12/15 21:29
     */
    public static Date getDateStart(Date date) {
        if (date == null) {
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            date = sdf.parse(formatDate(date, "yyyy-MM-dd") + " 00:00:00");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return date;
    }

    /**
     * @Comment:获取结束时间
     * @Date: 2017/12/15 21:29
     */
    public static Date getDateEnd(Date date) {
        if (date == null) {
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            date = sdf.parse(formatDate(date, "yyyy-MM-dd") + " 23:59:59");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return date;
    }

    public static String getDateStart(String dateStart) {
        if (dateStart == null) {
            return null;
        }
        Date date = DateUtils.parseDate(dateStart);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            date = sdf.parse(formatDate(date, "yyyy-MM-dd") + " 00:00:00");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        String formatDateStart = DateUtils.formatDateTime(date);
        return formatDateStart;
    }

    public static String getDateEnd(String dateEnd) {
        if (dateEnd == null) {
            return null;
        }
        Date date = DateUtils.parseDate(dateEnd);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            date = sdf.parse(formatDate(date, "yyyy-MM-dd") + " 23:59:59");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        String formatDateEnd = DateUtils.formatDateTime(date);
        return formatDateEnd;
    }

    /**
     * @param days
     * @return
     * @方法名: getBeforeDay
     * @功能描述:获取前几天的日期 （传入正数是几天前，传入负数是几天后）
     * @作者 guofei
     * @日期 2017-3-24
     */
    public static String getBeforeDay(Long days) {
        String date = DateUtils.getDate();
        Date parseDate = DateUtils.parseDate(date);
        Date dateReckon = DateUtils.dateReckon(parseDate, -days, Type.DAY);
        String formatDate = DateUtils.formatDate(dateReckon, "yyyy-MM-dd");
        return formatDate;
    }

    /**
     * @param days
     * @方法名: getPastDate
     * @功能描述:获取前几天的日期（带时分秒）
     */
    public static String getPastDate(int days) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(Calendar.DATE, calendar.get(Calendar.DATE) - days);
        Date today = calendar.getTime();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sf.format(today);
        return format;
    }

    /**
     * @param date1
     * @param date2
     * @return int
     * @Description:比较两个日期的大小 精确到天   date1在date2之前返回1
     * @exception:
     * @author: guofei
     * @time:2017年9月13日 下午2:36:58
     */
    public static int compareTime(Date date1, Date date2) {
        Date dateStart1 = DateUtils.getDateStart(date1);
        Date dateStart2 = DateUtils.getDateStart(date2);
        if (dateStart1.before(dateStart2)) {
            return 1;
        } else if (dateStart1.after(dateStart2)) {
            return -1;
        } else {
            return 0;
        }
    }

    /**
     * @param day
     * @return Date
     * @Description:获取起始日期 0分 正数为几天前 负数为几天后
     * @exception:
     * @author: guofei
     * @time:2017年9月13日 下午2:45:33
     */
    public static Date getStartTime(Long day) {
        String date = DateUtils.getDate();
        Date parseDate = DateUtils.parseDate(date);
        Date dateReckon = DateUtils.dateReckon(parseDate, -day, Type.DAY);
        Date dateStart = DateUtils.getDateStart(dateReckon);
        return dateStart;
    }

    /**
     * @param day
     * @return Date
     * @Description:获取结束日期 0分  正数为几天前 负数为几天后 日期到第二天凌晨
     * @exception:
     * @author: guofei
     * @time:2017年9月13日 下午2:47:20
     */
    public static Date getEndTime(Long day) {
        String date = DateUtils.getDate();
        Date parseDate = DateUtils.parseDate(date);
        Date dateReckon = DateUtils.dateReckon(parseDate, -(day - 1), Type.DAY);
        Date dateEnd = DateUtils.getDateStart(dateReckon);
        return dateEnd;
    }


//======guofei   end============================>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>	
}
