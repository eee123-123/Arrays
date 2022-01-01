package 缓冲流;

import java.awt.image.BufferedImage;
import java.io.*;

public class TestBuffredStream {
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
        BufferedInputStream bis=new BufferedInputStream(fis);
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        //准备一个中转站(一个字节)
        int n=bis.read();//读源文件的一个字节
        while(n>=0){//判断是否末尾
            bos.write(n);//写一个字节
            n=bis.read();//再读一个字节
        }

        bis.close();
        bos.close();//高层流关闭，底层流自动关闭
    }
    //缓冲流大大减少了对硬盘的访问，在积累一定缓存后一次性写入硬盘，故速度更快
}
