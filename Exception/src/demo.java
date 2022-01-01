import java.util.Scanner;

public class demo {
    public static void main(String[] args) throws Exception{
        try {
            calAvg();
        }catch (CountMinusException e){
            e.printStackTrace();
        }
        calAvg();
    }
    public static void calAvg() throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入总分：");
        int num1= sc.nextInt();
        System.out.println("请输入人数：");
        int num2=sc.nextInt();
        if (num2<0){
            throw new CountMinusException("人数不能为负数"+num2);
        }
        int result=num1/num2;
        System.out.println("平均分是："+result);
    }

}
