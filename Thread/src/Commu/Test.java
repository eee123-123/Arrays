package Commu;

public class Test {
    public static void main(String[] args) {
        Product product=new Product();
        ProduceRunnable runnable1=new ProduceRunnable();
        runnable1.setProduct(product);
        Thread thread1=new Thread(runnable1);

        ConSumeRunnable runnable2=new ConSumeRunnable(product);
        Thread thread2=new Thread(runnable2);

        thread1.start();
        thread2.start();
    }
}
