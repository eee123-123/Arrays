package Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestURL {
    public static void main(String[] args) throws MalformedURLException {
        URL url=new URL("https://www.bjsxt.com:90/news/11068.html#cloths");
        System.out.println(url.getProtocol());
        System.out.println(url.getHost());
        System.out.println(url.getPort());
        System.out.println(url.getPath());
        System.out.println(url.getRef());
    }
}
