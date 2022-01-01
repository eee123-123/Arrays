package com.junjun;

public class StringBufferBuilder {
    public static void main(String[] args) {
        //两者其实差不多
//        StringBuilder builder=new StringBuilder();
        StringBuilder builder=new StringBuilder("asfa");//String->StringBuilder
        builder.append("sfdv");
        builder.append("vfnvj");
        builder.append("rrte");//相比于String,少了许多中间拼接串
        String str=builder.toString();
        System.out.println(str);
        System.out.println(builder);

        builder.reverse();
        System.out.println(builder);

        builder.insert(2,"avf");
        System.out.println(builder);

        builder.delete(3,6);//前闭后开
        System.out.println(builder);

        builder.replace(0,3,"cn");
        System.out.println(builder);

        //StringBuilder和StringBuffer差不多，主要是在多线程中有区别
    }
}
