package thread;

public class DeadLock {
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
}

