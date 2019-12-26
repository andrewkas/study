package garage.cars;

import garage.cars.api.ICar;
import garage.parts.Engine;

import static garage.parts.EngineSpecific.*;

public class Audi implements ICar {
    public static void main(String[] args) {
        System.out.println(TFSI.getConsump());
        System.out.println(FSI.getHpower());
        System.out.println(TFSI.name());
        TFSI.running();
        }


    @Override
    public void drive() {
        TFSI.running();

    }

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void start() {
     // Engine.start();

    }

    @Override
    public void stop() {
       // Engine.stop();

    }

    @Override
    public void fuel() {

    }

    @Override
    public void changeWheel() {

    }

    @Override
    public void driverSeat() {

    }

    @Override
    public void passengerSeat() {

    }
}
