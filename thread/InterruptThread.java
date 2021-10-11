package thread;

import java.util.Random;

public class InterruptThread {
    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(new Runnable() {
        double res;
            @Override
            public void run() {
                Random random=new Random();
                for (int i = 0; i <10_000 ; i++) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        System.out.println("Thread interrupted!");
                        System.out.println(res);
                        break;
                      //  e.printStackTrace();
                    }
    //               if(Thread.currentThread().isInterrupted()) {
    //                   System.out.println("Thread interrupted");
    //                   break;
    //               }
                   double result= Math.sin(random.nextDouble());
                    res+=result;
                }
            }
        });

        System.out.println("Thread has started!");
        thread.start();
        Thread.sleep(10000);
        thread.interrupt();
        thread.join();
        System.out.println("Thread has finished!");
    }
}
