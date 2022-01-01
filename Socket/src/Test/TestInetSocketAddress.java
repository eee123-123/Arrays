package Test;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

public class TestInetSocketAddress {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ia=InetAddress.getByName("www.baidu.com");
        InetSocketAddress isa=new InetSocketAddress(ia,8080);
        System.out.println(isa);
    }
}
