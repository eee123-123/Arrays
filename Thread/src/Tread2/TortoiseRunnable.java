package Tread2;

public class TortoiseRunnable implements Runnable{
    @Override
    public void run() {
        //线程需要执行的任务
        while (true){
            System.out.println("乌龟领先"+Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
        }
    }
}
