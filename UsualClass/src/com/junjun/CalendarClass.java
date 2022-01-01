package com.junjun;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarClass {
    public static void main(String[] args) {
        Calendar cal=new GregorianCalendar();
        System.out.println(cal.toString());
        Calendar cal2=Calendar.getInstance();
        System.out.println(cal2);//cal与cal2一样的输出
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONDAY));//0~11
        System.out.println(cal.get(Calendar.DATE));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));//周日是1
        System.out.println(cal.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY);

        cal.set(Calendar.DATE,1);//改为第一天
        System.out.println(cal.getActualMaximum(Calendar.DATE));//判断当月最大天数

    }
}
