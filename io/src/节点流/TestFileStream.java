package 节点流;

import jdk.internal.util.xml.impl.Input;

import java.io.*;

public class TestFileStream {
    //使用TileInputStream和FileOutputStream实现文件复制
    public static void main(String[] args) throws IOException {
//        File file=new File("D:/readme.txt");
//        InputStream fis=new FileInputStream(file);
//        File file1=new File("D:/readme1.txt");
//        OutputStream fos=new FileOutputStream(file1);

//        InputStream fis=new FileInputStream(new File("D:/readme.txt"));
//        OutputStream fos=new FileOutputStream(new File("D:/read1.txt"));
        InputStream fis=new FileInputStream("D:/readme.txt");
        OutputStream fos=new FileOutputStream("D:/readme1.txt");
        //准备一个中转站(一个字节)
        int n=fis.read();//读源文件的一个字节
        while(n>=0){//判断是否末尾
            fos.write(n);//写一个字节
            n=fis.read();//再读一个字节
        }


        fis.close();
        fos.close();//一定要关闭流
    }
}
