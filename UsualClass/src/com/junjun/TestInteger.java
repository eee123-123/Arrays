package com.junjun;

import java.util.ArrayList;
import java.util.List;
//包装类

public class TestInteger {
    public static void main(String[] args) {
        List li=new ArrayList();
        li.add(new Integer(100));
        li.add(new Integer(20));
        System.out.println(li);

        System.out.println(Integer.SIZE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.toBinaryString(13));

        String sage="30";
        int age=Integer.parseInt(sage);
        System.out.println(age);

        Integer in=new Integer(10);
        System.out.println(in);
    }
}
