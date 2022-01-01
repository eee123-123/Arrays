package Test1;

public class demo1 {
    /*可变参数
    * 当...作为形参，传入的实参是可变的
    * 在方法体内，可将可变参数当成数组使用
    * 如果传入的实参是多个单独的变量，程序会自动将多个单独变量放入数组
    * 好处：
    * 传入数组、多个单独变量及其数量都可以
    * 坏处：
    * 可变参数必须是最后一个列表参数
    * 一个方法参数最多有一个可变参数
    * */
    public static void main(String[] args) {
        int [] arr={1,2,2,3};
        int a=1;
        int b=5;
        int c=5;
        int d=7;
        int e=6;
        int f=2;
        int g=20;
        int [] arr2={a,b,c,d,e,f,g};
        showArr(arr2);
        showArr(a,b,c,d,e);
    }

    public static void showArr(int ...arr){
        System.out.println("方法执行");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
