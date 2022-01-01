import java.util.Scanner;

public class TestException3 {
    public static void main(String[] args) throws Exception{
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入总分：");
            int num1= sc.nextInt();
            System.out.println("请输入人数：");
            int num2=sc.nextInt();
            if (num2<0){
                //throw new RuntimeException();//运行时异常不用加throws Exception
                throw new Exception("人数不能为负数");//检查时异常用加throws Exception
            }
            int  result=num1/num2;
            System.out.println("平均分是："+result);

    }
}
