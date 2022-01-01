package 数据流;

import java.io.*;

public class TestDataStream {
    public static void main(String[] args) throws IOException {
        write();
        read();
    }

    public static void write() throws IOException {
        OutputStream os=new FileOutputStream("D:/readme1.txt");
        BufferedOutputStream bos=new BufferedOutputStream(os);
        DataOutputStream dos=new DataOutputStream(bos);
        dos.writeInt(10);
        dos.writeDouble(3.14);
        dos.writeUTF("vcua");
        dos.writeChar('c');
        dos.close();
    }

    public static void read() throws IOException {
        InputStream is=new FileInputStream("D:/readme1.txt");
        BufferedInputStream bis=new BufferedInputStream(is);
        DataInputStream dis=new DataInputStream(bis);
        System.out.println(dis.readInt());
        System.out.println(dis.readDouble());
        System.out.println(dis.readUTF());
        System.out.println(dis.readChar());
        dis.close();
    }
}
