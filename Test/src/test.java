import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        String[] st=new String[128];
        demo1(n,st);
        demo2(n,st);
    }

    //public static String[] st=new String[128];

    public static void demo1(int n,String []st){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            st[i]=sc.next();
        }
    }


    public static void demo2(int n,String []st){
        for(int i=0;i<n;i++){
            System.out.println(st[i]);
        }
    }
}
