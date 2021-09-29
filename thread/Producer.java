package thread;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.*;

public class Producer {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Future<Integer>> fut = new ArrayList<>();
        Callable<Integer>callable=new Task();
        int result=0;

    ExecutorService service= Executors.newFixedThreadPool(6);

    for(int i=0; i<10;i++){
        //Future<Integer> future=service.submit(callable);
        fut.add(service.submit(callable));
    } service.shutdown();

do {
    Iterator<Future<Integer>> iterator = fut.iterator();


    while (iterator.hasNext()) {
        Future<Integer> next = iterator.next();
        if (next.isDone()) {
            result += next.get();
            iterator.remove();
        }
    }
}while(fut.size()>0);
        System.out.println(result);
    }
}
