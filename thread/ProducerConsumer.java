package thread;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {
    private Queue<Integer> queue = new LinkedList<Integer>();
    private int LIMIT = 10;
    private Object lock = new Object();

    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (lock) {
                while (queue.size() == LIMIT) {
                    lock.wait();
                }
                queue.offer(value++);
                lock.notify();
            }
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
            synchronized (lock) {
                while (queue.size() == 0) {
                    lock.wait();
                }
                int value = queue.poll();
                System.out.println(value);
                System.out.println("Queue size" + queue.size());
                lock.notify();
            }
            Thread.sleep(3000);
        }
    }
}

 class Main{

    public static void main(String[] args) throws InterruptedException {
        ProducerConsumer pc=new ProducerConsumer();
        Thread thread1= new Thread(() -> {
            try {
                pc.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });
        Thread thread2= new Thread(() -> {
            try {
                pc.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });
        thread1.start();
        thread2.start();
        System.out.println("Thread starts");

        thread1.join();
        thread2.join();



    }
}
