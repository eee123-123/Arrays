import java.util.Locale;

public class TestExceprion2 {
    public static void main(String[] args) {
        int [] arr=new int[10];
        System.out.println(arr[100]);//运行时异常，不用处理

        String str="dsvs";
        str=null;
        System.out.println(str.toUpperCase());//运行时异常

        //还有一种检查异常，自己查吧
    }
}
