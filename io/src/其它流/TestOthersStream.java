package 其它流;

import java.io.*;

public class TestOthersStream {
    public static void main(String[] args) {
        //节点流
        FileInputStream fis;
        FileOutputStream fos;
        //处理流
        BufferedInputStream bis;
        BufferedOutputStream bos;
        DataInputStream dis;
        DataOutputStream dos;
        PrintStream ps;

        //IO中使用了适配器模式（InputStreamReader OutputStreamWriter）
        //和装饰模式：继承的一种替代方案，大大减少子类数量，如：
        //OutputStream os=new FileOutputStream("D:/readme1.txt");
        //BufferedOutputStream bos=new BufferedOutputStream(os);
        //DataOutputStream dos=new DataOutputStream(bos);
    }
}
