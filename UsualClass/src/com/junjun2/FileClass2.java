package com.junjun2;

import java.io.File;
import java.io.IOException;

public class FileClass2 {
    public static void main(String[] args) {
        File file=new File("D:/1.txt");
        if(file.exists()){
            file.delete();
        }else{
            try {
                file.createNewFile();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
