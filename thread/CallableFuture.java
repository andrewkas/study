package thread;

import javax.swing.table.TableRowSorter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class CallableFuture {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(4);

        List<Future<Integer>> future = new ArrayList<>();
        for (int i = 0; i < 10; i++) {

            future.add(executor.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    System.out.println("Thread id: "+Thread.currentThread().getId()+ " started!");
                    Thread.sleep(500);
                    Random random = new Random();
                    int randomValue = random.nextInt(10);

                    if (randomValue < 5) {
                        throw new Exception("Thread id: "+Thread.currentThread().getId()+ " Bad bad work!");
                    }

                    return randomValue;
                }
            }));
        }
            executor.shutdown();

            Iterator<Future<Integer>> iterator = future.iterator();
            while (iterator.hasNext()) {
                Future<Integer> next = iterator.next();
                try {
                    int result = next.get();
                    System.out.println("Thread id: " + Thread.currentThread().getId()+ " = "+result);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    Throwable ex = e.getCause();
                    System.out.println(ex.getMessage());
                }

            }
        }
    }
