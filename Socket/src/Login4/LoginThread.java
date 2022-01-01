package Login4;

import Entity.User;

import java.io.*;
import java.net.Socket;

public class LoginThread extends Thread{
    private Socket socket;

    public LoginThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        ObjectInputStream ois=null;
        DataOutputStream dos=null;
        try{
            InputStream is=socket.getInputStream();
            ois=new ObjectInputStream(is);
            User user=(User)ois.readObject();
            System.out.println(user+",收到啦");

            OutputStream os=socket.getOutputStream();
            dos=new DataOutputStream(os);
            if(user.getUserId().indexOf("wj")>=0&&user.getPassword().length()>=6){
                dos.writeUTF("成功");
            }else {
                dos.writeUTF("失败");
            }
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }finally {
            try {
                if(ois!=null){
                    ois.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(dos!=null){
                    dos.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
