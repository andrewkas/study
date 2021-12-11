package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SemaphoreMain {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService=Executors.newFixedThreadPool(10);
        Connection connection=Connection.getConnection();
        for (int i = 0; i <20 ; i++) {executorService.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    connection.work();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.DAYS);



    }
}
class Connection {

    private static Connection connection;
    private int conectionCount;
    private Semaphore semaphore=new Semaphore(10);
    private Connection(){}

    public static Connection getConnection(){
        if(connection==null){
            connection=new Connection();}
        return connection;
    }
    public void work() throws InterruptedException {
        semaphore.acquire();
      try
      {synchronized (this){
        conectionCount++;
            System.out.println(conectionCount);}

        Thread.sleep(5000);
        synchronized (this){
            conectionCount--;
        }}
      finally {


        semaphore.release();
    }}
}