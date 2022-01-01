package Upload;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadClient {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket(InetAddress.getLocalHost(),8800);

        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("D:/readme.txt"));
        BufferedOutputStream bos=new BufferedOutputStream(socket.getOutputStream());
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
