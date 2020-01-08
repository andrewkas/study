package garage.cars.api;

import garage.parts.engine.AllEngine;
import garage.parts.engine.api.IEngine;

public abstract class ACars implements ICar{



    public void getInfo() {
    }

    @Override
    public void drive() {
        System.out.println("Поехал");
    }



    @Override
    public void close() {
        System.out.println("Закрыто");
    }

    @Override
    public void start() {

        System.out.println("Запустили двигатель");
    }

    @Override
    public void stop() {
        System.out.println("Двигатель остановлен");
    }

    @Override
    public void fuel() {
        System.out.println("Заправляем");
    }

    @Override
    public void changeWheel() {
        System.out.println("Меняем шины");

    }

    @Override
    public void driverSeat() {
        System.out.println("Садим водителя");
    }

    @Override
    public void passengerSeat() {
        System.out.println("Садим поссажира");

    }
}
