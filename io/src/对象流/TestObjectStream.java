package 对象流;

import java.io.*;
import java.util.Date;

public class TestObjectStream {
    public static void main(String[] args) throws Exception {
        write();
        read();
    }

    public static void write() throws IOException {
        OutputStream os=new FileOutputStream("D:/readme1.txt");
        BufferedOutputStream bos=new BufferedOutputStream(os);
        ObjectOutputStream dos=new ObjectOutputStream(bos);
        dos.writeInt(10);
        dos.writeDouble(3.14);
        dos.writeUTF("vcua");
        dos.writeChar('c');
        dos.writeObject(new Date());//序列化
        dos.close();
    }

    public static void read() throws IOException, ClassNotFoundException {
        InputStream is=new FileInputStream("D:/readme1.txt");
        BufferedInputStream bis=new BufferedInputStream(is);
        ObjectInputStream dis=new ObjectInputStream(bis);
        System.out.println(dis.readInt());
        System.out.println(dis.readDouble());
        System.out.println(dis.readUTF());
        System.out.println(dis.readChar());
        Object obj=dis.readObject();//反序列化
        System.out.println(obj);
        dis.close();
    }//可以将对象加进
    //static变量啥的不可进行序列化反序列化
}
