package Login3;

import Entity.User;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class LoginClient {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket(InetAddress.getLocalHost(),8800);

        Scanner input=new Scanner(System.in);
        System.out.println("请输入用户名:");
        String userId=input.next();
        System.out.println("请输入密码:");
        String password=input.next();
        User user=new User(userId,password);

        OutputStream os=socket.getOutputStream();
        ObjectOutputStream oos=new ObjectOutputStream(os);
        oos.writeObject(user);

        InputStream is=socket.getInputStream();
        DataInputStream dis=new DataInputStream(is);
        String result=dis.readUTF();
        System.out.println(result+",嗯嗯");

        oos.close();
        dis.close();
        //socket.close();
    }
}
