package 缓冲流;

import java.io.*;

public class TestBuffredReaderWriter {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("D:/readme.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("D:/readme1.txt"));

        String str=br.readLine();
        while(str!=null){
            System.out.println(str);
            bw.write(str);
            bw.newLine();//换行
            str=br.readLine();
        }

        br.close();
        bw.close();
    }
}
