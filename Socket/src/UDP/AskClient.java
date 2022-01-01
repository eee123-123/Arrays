package UDP;

import java.io.IOException;
import java.net.*;

public class AskClient {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket=new DatagramSocket(9999);

        String str="在吗?";
        byte [] buf=str.getBytes();
        InetAddress address=InetAddress.getLocalHost();
        int port=8888;
        DatagramPacket packet=new DatagramPacket(buf,buf.length,address,port);
        socket.send(packet);

        socket.close();
    }
}
