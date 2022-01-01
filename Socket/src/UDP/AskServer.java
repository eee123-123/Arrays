package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class AskServer {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket=new DatagramSocket(8888);

        byte [] buf=new byte[128];
        DatagramPacket packet=new DatagramPacket(buf,buf.length);
        socket.receive(packet);
        System.out.println(new String(packet.getData()));
        System.out.println(packet.getLength());
        System.out.println(packet.getAddress());
        System.out.println(packet.getPort());

        socket.close();
    }
}
