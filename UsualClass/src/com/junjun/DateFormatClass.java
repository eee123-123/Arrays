package com.junjun;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;

public class DateFormatClass {
    public static void main(String[] args) {
        DateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");//DateFormat是抽象类,yyyy等有特殊规范

        String str="1999-12-23 09:23:45";
        Date date=null;
        try {
            date=sdf.parse(str);
        }catch (ParseException e){
            e.printStackTrace();
        }

        System.out.println(date.toLocaleString());

        String str2=sdf.format(date);
        System.out.println(str2);

        DateFormat sdf2=new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
        String str3=sdf2.format(date);
        System.out.println(str3);
    }
}
