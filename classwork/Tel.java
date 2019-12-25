package classwork;

import org.w3c.dom.ls.LSOutput;

public class Tel implements ITel {//implements

    @Override //lfyysq метод переопределяте метод
    public void call() {

        System.out.println("Ту-ту-ту.....");

    }
    public void stop() {
        System.out.println("Положить");
    }

    protected void pause() {
        System.out.println("Пауза");
    }

}


