package 输出流;

import java.io.*;
/*
* PrintWriter 字符流 输出流 包装流
* */
public class TestPrintWriter {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new FileReader("D:/readme.txt"));
        //BufferedWriter bw=new BufferedWriter(new FileWriter("D:/readme1.txt"));
        PrintWriter pw=new PrintWriter("D:/read.txt");

        String str=br.readLine();
        while(str!=null){
            System.out.println(str);
            pw.println(str);
//            bw.write(str);
//            bw.newLine();//换行
            str=br.readLine();
        }

        br.close();
        //bw.close();
        pw.close();
    }
}
