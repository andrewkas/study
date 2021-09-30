package thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownMain {
    private static int VAL=3;
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch=new CountDownLatch(VAL);
        List<Integer>out= Collections.synchronizedList(new ArrayList<>());
        ExecutorService executorService= Executors.newFixedThreadPool(3);
        for(int i = 0; i<3; i++){
        executorService.execute(new Worker(countDownLatch,out,i));}
        for (int i = 0; i <VAL; i++) {
            countDownLatch.countDown();
        }
        System.out.println("CountDownLatch worked out");
        executorService.shutdown();
        for (Integer x:out
             ) {
            System.out.println(x);
        }
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
        while (true) {
            for (int i = 0; i < 100; i++) {
                output.add(i);
            }
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}