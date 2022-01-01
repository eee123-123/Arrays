package Login3;

import Entity.User;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class LoginServer {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket serverSocket=new ServerSocket(8800);
        Socket socket=serverSocket.accept();//请求不到阻塞，否则返回socket继续执行后继
        InputStream is=socket.getInputStream();
        ObjectInputStream ois=new ObjectInputStream(is);
        User user=(User)ois.readObject();
        System.out.println(user+",收到啦");

        OutputStream os=socket.getOutputStream();
        DataOutputStream dos=new DataOutputStream(os);
        if(user.getUserId().indexOf("wj")>=0&&user.getPassword().length()>=6){
            dos.writeUTF("成功");
        }else {
            dos.writeUTF("失败");
        }


        ois.close();
        dos.close();
        //socket.close();
        serverSocket.close();
    }
}
