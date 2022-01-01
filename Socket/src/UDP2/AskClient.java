package UDP2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class AskClient {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket=new DatagramSocket(9999);
        Scanner input=new Scanner(System.in);

        while (true){
            String str=input.nextLine();
            byte [] buf=str.getBytes();
            InetAddress address=InetAddress.getLocalHost();
            int port=8888;
            DatagramPacket packet=new DatagramPacket(buf,buf.length,address,port);
            socket.send(packet);
            if ("bye".equals(str)){
                break;
            }

            byte [] buf2=new byte[128];
            DatagramPacket packet2=new DatagramPacket(buf2,buf2.length);
            socket.receive(packet2);
            System.out.println(new String(packet2.getData(),0,packet2.getLength()));

        }


        socket.close();
    }
}
