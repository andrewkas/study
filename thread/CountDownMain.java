package thread;

import java.util.*;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownMain {
    private static int VAL=5;
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch=new CountDownLatch(VAL);
        List<Integer>out= Collections.synchronizedList(new ArrayList<>());
        ExecutorService executorService= Executors.newFixedThreadPool(3);
        for(int i = 0; i<4; i++){
        executorService.execute(new Worker(countDownLatch,out,i));}
        countDownLatch.await();
        executorService.shutdown();
        System.out.println("CountDownLatch worked out");
        System.out.println(out);

    }

}
class Worker implements Runnable {
    int value;
    private CountDownLatch countDownLatch;
    private List<Integer> output;

    public Worker(CountDownLatch countDownLatch, List<Integer> output, int value) {
        this.countDownLatch = countDownLatch;
        this.output = output;
        this.value = value;
    }

    @Override
    public void run() {
                output.add(value);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        countDownLatch.countDown();

            }

        }

