package classwork;

import java.lang.annotation.Target;

public class GSMTel implements ITel {
    public void sendSms(){
        System.out.println("Отрпавлена");
    }


    public void snake(){
        System.out.println("Играю в змею");
    }

    @Override
    public void call() {

    }

    @Override
    public void stop() {

    }


}
