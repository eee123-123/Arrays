import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException2 {
    public static void main(String[] args) {
        try {
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入总分：");
            int num1= sc.nextInt();
            System.out.println("请输入人数：");
            int num2=sc.nextInt();
            int  result=num1/num2;
            System.out.println("平均分是："+result);
        }catch (ArithmeticException e){
            System.out.println("除数不能为零");
        }catch (InputMismatchException e){
            System.out.println("必须输入数字");
        }catch (Exception e){
            System.out.println("其他异常");
        } finally {
            System.out.println("3q3q");
        }//finally中语句无论错误怎样被抛掷都会执行，除非有System.exit(0),退出虚拟机
        System.out.println("bye");
    }
}
