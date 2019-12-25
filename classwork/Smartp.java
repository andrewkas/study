package classwork;

public class Smartp extends GSMTel{ //extends - возможен только один раз в данном классе
    public void openInternet(){
        System.out.println("Гуглю");
    }
    //@Override
    public void playTanks(){
        System.out.println("Танчики йуху!!!");
    }
    @Override//@ - nameMethod (params..) даная анотация требует и контролирует что что-то надо переопределить.
    public void call(){
       this.call("911");

    }
    public void call(String number){
        this.call(number, true);
    }
   // public void call(String number) {// это называется перегрузкой
     //   System.out.println("Отключить интернет...");
       // System.out.println("Набираю " + number + " Ту-ту-ту...");
        //System.out.println("Включить интернет...");
    //}
    public void call(String number, boolean stopCall) {// это называется перегрузкой
        System.out.println("Отключить интернет...");
        System.out.println("Набираю " + number );
        //super.pause();
        if(stopCall){
            System.out.println("Неожиданно бросаем трубку");
        }
        System.out.println("Включить интернет...");
    }

}
