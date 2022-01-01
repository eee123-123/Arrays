package Tread1;

public class TortoiseThread extends Thread{
    @Override
    public void run() {
//        this.setName("乌龟线程");
//        this.setPriority(Thread.MAX_PRIORITY);
        while(true){
            System.out.println("乌龟领先"+Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
        }
    }
}
