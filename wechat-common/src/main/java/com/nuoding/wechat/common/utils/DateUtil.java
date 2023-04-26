package com.nuoding.wechat.common.utils;

import com.nuoding.wechat.common.enums.RespStatusEnum;
import com.nuoding.wechat.common.exception.BusException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;


/**
 * 日期工具类
 */
public class DateUtil {

    public static final String DAY_FORMAT1 = "yyyyMMdd";
    public static final String DAY_FORMAT2 = "yyyy-MM-dd";
    public static final String DAY_FORMAT3 = "yyyy-MM-dd HH:mm:ss";
    public static final String DAY_FORMAT4 = "yyyy年MM月dd日";

    /**
     * 增加年
     *
     * @param date
     * @param year
     */
    public static Date changYear(Date date, int year) {
        Calendar ca = Calendar.getInstance();
        ca.setTime(date);
        ca.add(Calendar.YEAR, year);
        Date time = ca.getTime();
        return time;
    }

    /**
     * 增加月
     *
     * @param date
     * @param month
     * @return yyyyMMdd
     */
    public static Date changMonth(Date date, int month) {

        Calendar ca = Calendar.getInstance();
        ca.setTime(date);
        ca.add(Calendar.MONTH, month);
        Date time = ca.getTime();
        return time;
    }

    /**
     * 增加天
     *
     * @param date
     * @param day
     * @return
     */
    public static Date changDay(Date date, int day) {
        Calendar ca = Calendar.getInstance();
        ca.setTime(date);
        ca.add(Calendar.DATE, day);
        Date time = ca.getTime();
        return time;
    }

    /**
     * 计算两个日期间相差的天数
     *
     * @param start
     * @param end
     * @return
     */
    public static long compareTo(Date start, Date end) {
        // 去掉时分秒
        //start = parse(format(start, dataFarmat), dataFarmat);
        //end = parse(format(end, dataFarmat), dataFarmat);
        long days = (end.getTime() - start.getTime()) / (1000 * 60 * 60 * 24);
        return days;
    }

    /**
     * Formats a Date into a date/time string.
     *
     * @param date
     * @param pattern
     */
    public static String format(Date date, String pattern) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }

    /**
     * Parses text from the beginning of the given string to produce a date.
     *
     * @param date    日期字符串
     * @param pattern 格式
     * @return
     */
    public static Date parse(String date, String pattern) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        try {
            Date d = sdf.parse(date);
            return d;
        } catch (ParseException e) {
            throw new RuntimeException("日期转换错误", e);
        }
    }

    /**
     * @param term      期限
     * @param termType  期限类型 D天，M月，Y年
     * @param startDate 起点时间
     */
    public static String expireDate(int term, String termType, Date startDate) {
        Date convert = null;
        //Date now = parse(startDate, DAY_FORMAT1);
        if ("D".equals(termType)) {
            convert = changDay(startDate, term);
        } else if ("M".equals(termType)) {
            convert = changMonth(startDate, term);
        } else if ("Y".equals(termType)) {
            convert = changYear(startDate, term);
        } else {
            throw new BusException("计算产品到期日失败", RespStatusEnum.FAIL);
        }
        return format(convert, DAY_FORMAT2);
    }

    /**
     * @param term     期限
     * @param termType 期限类型 D天，M月，Y年
     */
    public static int getDays(int term, String termType) {
        Date startDate = new Date();
        if ("D".equals(termType)) {
            return term;
        } else if ("M".equals(termType)) {
            Date convert = changMonth(startDate, term);
            return (int) compareTo(startDate, convert);
        } else if ("Y".equals(termType)) {
            Date convert = changYear(startDate, term);
            return (int) compareTo(startDate, convert);
        } else {
            throw new BusException("计算产品天数", RespStatusEnum.FAIL);
        }
    }

    /**
     * 不关注时分秒判断当前是否在开始和结束之间，包含日期的临界值
     *
     * @param start 开始
     * @param end   结束
     * @return 在开始和结束之间返回true，否则返回false
     */
    public static boolean onDatePeriod(Date start, Date end) {
        LocalDate localStart = start.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate localEnd = end.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate now = LocalDate.now();
        return now.compareTo(localStart) >= 0 && now.compareTo(localEnd) <= 0;
    }

    public static void main(String[] args) {
        /*System.out.println(DateUtil.expireDate(5, "Y", new Date()));
        System.out.println(DateUtil.expireDate(5, "M",new Date()));
        System.out.println(DateUtil.expireDate(5, "D", new Date()));*/

        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
            Date start = format.parse("20220920 12:00:00");
            Date end = format.parse("20220920 12:00:00");
            System.out.println(onDatePeriod(start, end));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
