package 缓冲流;

import java.io.*;

public class TestBuffredStream1 {
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

        //准备一个中转站(多个字节)
        byte [] buf=new byte[1024];
        int len=bis.read(buf);//读源文件的一个字节
        while(len!=-1){//判断是否末尾
            bos.write(buf,0,len);//将字节数组内容写入目的文件
            len=bis.read(buf);//再读一次
        }


        bis.close();
        bos.close();//一定要关闭流
    }
}
