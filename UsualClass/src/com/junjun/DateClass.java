package com.junjun;

import java.util.Date;

public class DateClass {
    public static void main(String[] args) {
        Date date=new Date(0);
        System.out.println(date.toString());
        System.out.println(date.toLocaleString());

        Date date1=new Date(-1000/*毫秒*/*60*60*24*60L/*不加L会越界*/);
        System.out.println(date1.toString());
        System.out.println(date1.toLocaleString());

        Date date2=new Date(System.currentTimeMillis());
        System.out.println(date2.toString());
        System.out.println(date2.toLocaleString());

        Date date3=new Date();
        System.out.println(date3.toLocaleString());

        System.out.println(date3.getDay());
        System.out.println(date3.getMonth());//0~11

        //Date的三个子类
        java.sql.Date sdate;
        java.sql.Time stime;
        java.sql.Timestamp timestamp;

    }
}
