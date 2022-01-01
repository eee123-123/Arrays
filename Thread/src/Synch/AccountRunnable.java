package Synch;

import javafx.scene.control.TableRow;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//线程同步方式一：同步代码块synchronized (引用变量，不能是普通变量),建议使用final修饰同步监视器
//方式二：Lock

public class AccountRunnable implements Runnable{
    private final Account account=new Account();
    //购买一把锁
    private Lock lock=new ReentrantLock();
    @Override
    public void run() {
//        synchronized (account){
//            if(account.getBalance()>=400){
//                try {
//                    Thread.sleep(20);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                account.withDraw(400);
//                System.out.println(Thread.currentThread().getName()+"取款成功，当前余额："+account.getBalance());
//            }else{
//                System.out.println(Thread.currentThread().getName()+"取款失败，当前余额："+account.getBalance());
//            }
//        }
        //上锁
        lock.lock();
        try{
            if(account.getBalance()>=400){
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                account.withDraw(400);
                System.out.println(Thread.currentThread().getName()+"取款成功，当前余额："+account.getBalance());
            }else{
                System.out.println(Thread.currentThread().getName()+"取款失败，当前余额："+account.getBalance());
            }
        }finally {
            //解锁
            lock.unlock();
        }
    }
}
