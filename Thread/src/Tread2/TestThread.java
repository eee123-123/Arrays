package Tread2;

public class TestThread {
    public static void main(String[] args) {
        Runnable runnable=new TortoiseRunnable();
        Thread thread=new Thread(runnable);
        thread.setName("乌龟一线程");
        thread.start();

        Thread thread1=new Thread(runnable,"乌龟二线程");
        thread1.start();

        Thread.currentThread().setName("主线程");
        while(true){
            System.out.println("兔子领先"+Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
        }
    }
}
