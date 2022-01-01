package 节点流;

import java.io.*;

public class TestFileReaderWriter {
    public static void main(String[] args) throws IOException {
        Reader fr=new FileReader("D:/readme.txt");//字符流，以字符为单位读取
        //Writer fw=new FileWriter("D:/readme1.txt");//覆盖
        Writer fw=new FileWriter("D:/readme1.txt",true);//追加

        int n=fr.read();
        while (n!=-1){
            System.out.println((char)n);
            fw.write(n);
            n=fr.read();
        }

//        while((n= fr.read())!=-1){
//            fw.write(n);
//        }

        char [] buff=new char[1024];
        int len=fr.read(buff);
        while(len!=-1){
            fw.write(buff,0,len);
            len=fr.read(buff);
        }

        fr.close();
        fw.close();
    }
    //本质上无字符流，字符流底层仍是字节流,字符流只能进行可以用记事本打开的文件
}
