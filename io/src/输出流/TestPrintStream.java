package 输出流;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class TestPrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        //System.out.println("hello");
        PrintStream ps=new PrintStream("D:/read.txt");
        ps.println(3);
        ps.println('a');
        /*
        * PrintStream 只有输出流  包装流  字节流，并且其内部自定义缓冲流
        * println() 多个重载方法，可以是各种基本数据类型和引用数据类型
        *
        * */
    }
}
