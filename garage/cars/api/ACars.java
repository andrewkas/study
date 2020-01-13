package garage.cars.api;

import computer.IParts;
import garage.parts.Lock.Lock;
import garage.parts.api.IKey;
import garage.parts.api.ILock;
import garage.parts.api.IWheel;

public abstract class ACars implements ICar{


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
         // System.out.println("Открыто"); }
    }

