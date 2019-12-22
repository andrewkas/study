package classwork;

public class Main {
    public static void main(String[] args) {
        ITel oldphone = new Tel();
        GSMTel gsmphone=new GSMTel();
        Smartp smart =new Smartp();

        oldphone.call();
        gsmphone.call();
      //  smart.snake();
        smart.call();
        oldphone.stop();
        ((Tel)oldphone).stop();// тут происходит приведение типов


    }
}
