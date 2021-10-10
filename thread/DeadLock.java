package thread;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLock {
    public static void main(String[] args) throws InterruptedException {
        Runner runner = new Runner();
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                runner.firstThread();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                runner.secondThread();
            }
        });
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        runner.finished();


    }
}
class Runner {
    private Account account1 = new Account(10000);
    private Account account2 = new Account(12000);
    private Lock lock1=new ReentrantLock();
    private Lock lock2=new ReentrantLock();

    private void takeLock(Lock lock1, Lock lock2){
        boolean takeFirstLock=false;
        boolean takeSecondLock=false;
        while (true) {
            try {
                takeFirstLock = lock1.tryLock();
                takeSecondLock = lock2.tryLock();
            } finally {
                if (takeFirstLock && takeSecondLock) {
                    break;
                }
                if (takeFirstLock) {
                    lock1.unlock();
                }
                if (takeSecondLock) {
                    lock2.unlock();
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }}
    public void firstThread() {
        Random random = new Random();
        takeLock(lock1,lock2);
        for (int i = 0; i < 1000; i++) {
            Account.transfer(account1, account2, random.nextInt(100));

        }
        lock1.unlock();
        lock2.unlock();

    }

    public void secondThread() {
        Random random = new Random();
        takeLock(lock1,lock2);
        for (int i = 0; i < 1000; i++) {
            Account.transfer(account2, account1, random.nextInt(100));

        }
        lock1.unlock();
        lock2.unlock();

    }
    public void finished(){
        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
        System.out.println("Total balance "+ (account1.getBalance()+account2.getBalance()));
    }
}
class Account {
    private int balance;

    public Account(int balance){
        this.balance=balance;
    }
    public void deposite (int amount){
        balance+=amount;
    }
    public void withdraw (int amount){
        balance-=amount;
    }
    public int getBalance(){
        return balance;
    }
    public static void transfer(Account account1, Account account2,int amount){
        account1.withdraw(amount);
        account2.deposite(amount);

    }
}

