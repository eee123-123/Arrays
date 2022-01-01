package Statictest;

public class Student {
    int no=10;

    public Student(){
        System.out.println("Student");
    }
    //静态代码块：类中，可多个，第一次加载类的时候只执行一次，可对静态变量初始化
    static {
        System.out.println("static1");
    }
    //成员代码块,在类中，依次执行，每次创建对象都会执行，先执行代码块，再执行构造方法
    {
        System.out.println("1");
    }
    public void show(){
        int no=20;
        System.out.println(no);//局部变量
        //局部代码块：在方法中，可以有多个，依次执行，定义的局部变量范围仅在此中
        {
            int age=40;
            System.out.println(age);
            System.out.println(no);
            System.out.println(this.no);
        }
        System.out.println(this.no);//成员变量
        {
            //System.out.println(age);//无法访问
            System.out.println(no);
            System.out.println(this.no);
        }
    }

    {
        System.out.println("2");
    }
    public static void main(String[] args) {
        Student stu=new Student();
        Student stu2=new Student();
    }

    {
        System.out.println("3");
    }

    static {
        System.out.println("static2");
    }
}
