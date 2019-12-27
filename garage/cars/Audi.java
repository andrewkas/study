package garage.cars;

import garage.cars.api.ICar;
import garage.parts.Lock;
import org.w3c.dom.ls.LSOutput;

import static garage.parts.EngineSpecific.*;

public class Audi implements ICar {
    Lock lock=new Lock();
    public void specification(){
        System.out.println("Ваш ключ подошел к Audi A4 объем двигателя "+TFSI.getVolume()+TFSI.name()+" "+TFSI.getHpower()+" л.с.");

                }


    @Override
    public void drive() {
        TFSI.running();


    }

    @Override
    public void open() {
       lock.unlock();


    }

    @Override
    public void close() {
        lock.lock();


    }

    @Override
    public void start() {
      TFSI.start();

    }

    @Override
    public void stop() {
       TFSI.stop();

    }

    @Override
    public void fuel() {
        TFSI.getConsump();

    }

    @Override
    public void changeWheel() {

    }

    @Override
    public void driverSeat() {
        System.out.println("Подогрев сиденя включен");


    }

    @Override
    public void passengerSeat() {
        System.out.println("3 свободных места");

    }
}
