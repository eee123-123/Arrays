package Test;

import java.net.UnknownHostException;
import java.net.InetAddress;

public class TestInetAddress {
    public static void main(String[] args) throws UnknownHostException {
        //InetAddress ia= InetAddress.getLocalHost();
        InetAddress ia=InetAddress.getByName("www.baidu.com");
        System.out.println(ia);
        System.out.println(ia.getHostName());

    }
}
