package Thread3;

import java.util.Random;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class RandomCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {

        Thread.sleep(2000);
        return new Random().nextInt(10);
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> callable=new RandomCallable();
        FutureTask<Integer> task=new FutureTask(callable);
        Thread thread=new Thread(task);

        thread.start();

        int result=task.get();
        System.out.println(result);
    }
}
