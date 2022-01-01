package 转换流;

import java.io.*;

/*
* 转换流：字节流->字符流
*InputStreamReader
*OutputStreamWriter
*
* 没有字符流转换成字节流
* */
public class TestInputStreamReader {
    public static void main(String[] args) throws Exception{
        InputStream is=System.in;//字节流
        Reader reader=new InputStreamReader(is);//字节流->字符流
        BufferedReader br=new BufferedReader(reader);//接收字符流
        //BufferedReader br=new BufferedReader(new FileReader("D:/readme.txt"));
        //BufferedWriter bw=new BufferedWriter(new FileWriter("D:/readme1.txt"));
        PrintWriter pw=new PrintWriter("D:/read.txt");

        String str=br.readLine();
        while(!"bye".equals(str)){
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
