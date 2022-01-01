package com.junjun;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;

public class StringClass {
    public static void main(String[] args) {
        String str1="ssvsass";
        String str2=new String("sdasf");

        System.out.println(str1.length());
        System.out.println(str1.isEmpty());
        System.out.println(str1.startsWith("s"));
        System.out.println(str1.endsWith("a"));
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        System.out.println(str1);//依旧保持，不可改变,但可以改变引用指向
        System.out.println(str1.contains("ss"));

        char ch= str1.charAt(3);
        System.out.println(str1.substring(2,5));//其实是前闭后开
        System.out.println(str1.substring(5));

        System.out.println(str1.indexOf("ss"));//找首字母索引
        System.out.println(str1.indexOf("ss",6));
        System.out.println(str1.lastIndexOf("ss"));//从后向前找

        String str= str1.replace("a","A");
        System.out.println(str);
        str="    sdas  asf  fa   ";
        System.out.println(str.length());
        str=str.trim();//去除两端空格
        System.out.println(str.length());

        str="asgvfbvfd";
        byte [] buf=str.getBytes();
        System.out.println(buf);
        System.out.println(buf.length);
        System.out.println(Arrays.toString(buf));

        String str3= new String(buf);
        System.out.println(str3);
        String str4=new String(buf,3,3);
        System.out.println(str4);

    }
}
