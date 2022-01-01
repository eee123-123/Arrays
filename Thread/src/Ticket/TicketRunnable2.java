package Ticket;

public class TicketRunnable2 implements Runnable{
    private int ticketNum=100;
    @Override
    public void run() {
        while(true){
            sellOne();
            if (ticketNum<=0){
                break;
            }
        }
    }

    public synchronized void sellOne(){
            if(ticketNum<=0){
                return;
            }
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"卖出了第"+ticketNum+"张票");
            ticketNum--;
        }

    public static void main(String[] args) {
        Runnable runnable=new TicketRunnable2();
        Thread thread1=new Thread(runnable);
        Thread thread2=new Thread(runnable);
        Thread thread3=new Thread(runnable);
        Thread thread4=new Thread(runnable);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }
}
