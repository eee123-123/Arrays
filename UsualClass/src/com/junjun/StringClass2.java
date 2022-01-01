package com.junjun;

public class StringClass2 {
    public static void main(String[] args) {
        String str1=new String("vacsdv");//new出来的空间在栈中存取的是堆地址，所以str1！=str2
        String str2=new String("vacsdv");
        System.out.println(str1==str2);//false
        System.out.println(str1.equals(str2));//true，堆空间比较


        String str3="vacsdv";//直接等的这种在栈中存放的地址相同
        String str4="vacsdv";
        String str5=str3;
        System.out.println(str3.equals(str5));//true
        System.out.println(str3==str4);//true
        System.out.println(str3.equals(str4));//true

        String str6="";//栈中地址指向堆中的空
        String str7=null;//栈中地址为空
        System.out.println(str6.length());

        String str="as";
        str=str.concat("dsf");
        str=str.concat("scs");
        str=str.concat("dv");//String进行相关如拼接操作时，每进行一次，会在堆中多开辟一块新空间，然后改变栈中地址指向，从而会产生许多不必要的垃圾，可用StringBuilder或StringBuffer解决解决
        System.out.println(str);

    }
}
