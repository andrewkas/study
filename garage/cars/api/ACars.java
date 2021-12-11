package garage.cars.api;

import computer.IParts;
import garage.parts.Key.Key;
import garage.parts.Lock.Lock;
import garage.parts.api.IKey;
import garage.parts.api.ILock;
import garage.parts.api.IWheel;
import garage.parts.engine.AllEngine;

public abstract class ACars implements ICar{
    protected String brand;
    protected String model;
    protected AllEngine engine;
    protected IWheel wheel;
    protected ILock lock;
    private IKey key;


    @Override
    public void drive() {
       double mils=engine.running();
        System.out.println("Поехали!.....");
        System.out.println("Проехали " + mils + "км");
        if(mils>=500){
            System.out.println("Заезжаем на заправку!");
            System.out.println("Необходимо заправить "+mils/100*(engine.getCapacity()*3)+" Литров "+engine.getFuelType());
            this.stop();
            this.fuel();
        }
    }

    @Override
    public void close() {
        System.out.println("Закрыто");
    }

    @Override
    public void start() {
        try {
            engine.start();
            System.out.println("Запустили двигатель");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    @Override
    public void stop() {
        try {
            engine.stop();
        System.out.println("Двигатель остановлен");
    }  catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }}

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
    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    public void getInfo() {

            System.out.print("Ваш ключ подошел к : " + getBrand() + " " + getModel());
            System.out.println(" двигатель с характеристиками " + engine.toString());
            System.out.println("Колеса " + wheel.getDiametr() + " диаметра, сезон : " + wheel.getwheelSpec());

    }
    public boolean open(IKey key) {
        return lock.open(key);
    }

    }

