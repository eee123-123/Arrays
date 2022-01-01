package Tread1;

//继承顶级类Thread创建线程

public class TestThread {
    public static void main(String[] args) {
        //启动乌龟线程
        Thread thread=new TortoiseThread();
        thread.setName("乌龟1线程");
        //thread.run();//普通方法调用
        thread.start();//启动一个新线程

        Thread thread2=new TortoiseThread();
        thread2.setName("乌龟2线程");
        //thread2.run();//普通方法调用
        thread2.start();//启动一个新线程

        Thread.currentThread().setName("主线程");
        while(true){
            System.out.println("兔子领先"+Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());

        }

    }
}
