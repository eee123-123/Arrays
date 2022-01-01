package Upload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(8800);

        Socket socket=serverSocket.accept();

        BufferedInputStream bis=new BufferedInputStream(socket.getInputStream());
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("D:/readme1.txt"));
        byte []buf=new byte[1024];
        int len=bis.read(buf);
        while(len!=-1){
            bos.write(buf,0,len);
            len=bis.read(buf);
        }

        bis.close();
        bos.close();
    }
}
