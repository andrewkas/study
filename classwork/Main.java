package classwork;

public class Main {
    public static void main(String[] args) {
        ITel oldphone = new Tel();
        ITel gsmphone=new GSMTel();
        ITel smart =new Smartp();

        oldphone.call();
        gsmphone.call();
        ((Smartp) smart).playTanks();
      //  smart.snake();
        smart.call();
        oldphone.stop();
        ((Tel)oldphone).stop();// тут происходит приведение типов


    }
}
