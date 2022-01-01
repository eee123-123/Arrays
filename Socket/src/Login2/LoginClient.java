package Login2;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class LoginClient {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket(InetAddress.getLocalHost(),8800);
        OutputStream os=socket.getOutputStream();
        DataOutputStream dos=new DataOutputStream(os);
        dos.writeUTF("我来啦");

        InputStream is=socket.getInputStream();
        DataInputStream dis=new DataInputStream(is);
        String result=dis.readUTF();
        System.out.println(result+",嗯嗯");

        dos.close();
        dis.close();
        //socket.close();
    }
}
