package com.junjun;

public class TestInterge2 {
    public static void main(String[] args) {
        Integer in1=5;//自动装箱
        //Integer in2=new Integer(10);//手动装箱
        int n=in1;//自动拆箱
        //int m=in2.intValue();//手动拆箱

        //==和equals
        Integer in2=new Integer(30);
        Integer in3=new Integer(30);
        System.out.println(in2==in3);//比的是地址,false
        System.out.println(in2.equals(in3));//比的是数值,true

        //自动装箱实质上是执行了Integer.valueOf方法而不是new Integer()
        Integer in4=1234;
        Integer in5=1234;
        System.out.println(in4==in5);//自动装箱如果数值在-128~127之间为true,否则为false
        System.out.println(in4.equals(in5));//true


    }
}
