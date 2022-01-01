package Login4;

import Entity.User;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class LoginServer {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket serverSocket=new ServerSocket(8800);
        int i=1;
        while(true){
            Socket socket=serverSocket.accept();//请求不到阻塞，否则返回socket继续执行后继

            new LoginThread(socket).start();

            InetAddress ia=socket.getInetAddress();
            System.out.println("这是第"+(i++)+"个请求,ip为："+ia.getHostAddress());
        }

        //socket.close();
        //serverSocket.close();
    }
}
