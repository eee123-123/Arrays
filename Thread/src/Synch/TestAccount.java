package Synch;

import javax.swing.table.TableRowSorter;

public class TestAccount {
    public static void main(String[] args) {
        Runnable runnable=new AccountRunnable();
        Thread thread1=new Thread(runnable,"张三");
        Thread thread2=new Thread(runnable,"李四");
        thread1.start();
        thread2.start();
    }
}
