package com.hutool;

import cn.hutool.core.date.DateField;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;

import java.util.Date;

public class DateUtilDemo {

    public static void main(String[] args) {
        new DateUtilDemo().format();
    }

    /**
     * 字符串转日期
     */
    public void parse() {
        String dateStr = "2017-03-01";
        Date date = DateUtil.parse(dateStr);
        System.out.println(date);
    }

    /**
     * 字符串转日期。按格式
     */
    public void parsePattern() {
        String dateStr = "2017-03-01 01:21:32";
        Date date = DateUtil.parse(dateStr, "yyyy-MM-dd hh:mm:ss");
        System.out.println(date);
    }

    /**
     * 日期转字符串。按格式
     */
    public void format() {
        Date date = new Date();
        String dateStr = DateUtil.format(date, "yyyy-MM-dd hh:mm:ss");
        System.out.println(dateStr);
    }



}
