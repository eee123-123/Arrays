package Login2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class LoginServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(8800);
        Socket socket=serverSocket.accept();//请求不到阻塞，否则返回socket继续执行后继
        InputStream is=socket.getInputStream();
        DataInputStream dis=new DataInputStream(is);
        String info=dis.readUTF();
        System.out.println(info+",收到啦");

        OutputStream os=socket.getOutputStream();
        DataOutputStream dos=new DataOutputStream(os);
        dos.writeUTF("我走啦");

        dis.close();
        dos.close();
        //socket.close();
        serverSocket.close();
    }
}
