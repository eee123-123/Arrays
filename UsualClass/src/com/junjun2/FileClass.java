package com.junjun2;

import java.io.File;
import java.util.Date;

public class FileClass {
    public static void main(String[] args) {
        File f1 = new File("D:/1.txt");
        System.out.println(f1.getName());
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.exists());
        System.out.println(f1.length());
        System.out.println(f1.isFile());
        System.out.println(f1.isDirectory());
        System.out.println(new Date(f1.lastModified()).toLocaleString());
        System.out.println(f1.canRead());
        System.out.println(f1.canWrite());
        System.out.println("======================");

        File f2 = new File("D:\\学习");
        File[] files = f2.listFiles();
        for (int i = 0; i < f2.length(); i++) {
            System.out.println(new Date(files[i].lastModified()).toLocaleString());
            if (files[i].isFile()) {
                System.out.print("文件夹\t");
                System.out.print(files[i].length());
            } else {
                System.out.print("文件\t");
                System.out.print("      ");
            }
            System.out.println(files[i].getName());
        }
    }
}
