package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入学生人数:");
        int num=sc.nextInt();
        int [] arr=new int[num];
        String [] name=new String[num];
        for (int i = 0; i < num; i++) {
            System.out.println("请录入第"+(i+1)+"个学生的姓名：");
            name[i]=sc.next();
            System.out.println("请录入第"+(i+1)+"个学生的成绩：");
            arr[i]=sc.nextInt();
        }
        //降序排列
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num-i-1; j++) {
                int temp;
                if(arr[j]<arr[j+1])
                {
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;

                    String n=name[j];
                    name[j+1]=name[j];
                    name[j+1]=n;
                }
            }
        }
        for (int i = 0; i < num; i++) {
            System.out.println("第"+(i+1)+"名："+name[i]+",分数为："+arr[i]);
        }
    }
}
