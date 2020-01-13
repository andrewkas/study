package garage.cars;

import garage.cars.api.ACars;
import garage.parts.Lock.Lock;
import garage.parts.api.IKey;
import garage.parts.api.ILock;
import garage.parts.api.IWheel;
import garage.parts.engine.AllEngine;
import garage.parts.engine.api.IEngine;

public class Mercedes extends ACars {
    private String brand;
    private String model;
    private IEngine engine;
    private IWheel wheel;
    private ILock lock;

    public Mercedes(String brand, String model, AllEngine engine, IWheel wheel, ILock lock) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.wheel = wheel;
        this.lock = lock;
    }

    public void getInfo() {
        System.out.print("Ваш ключ подошел к : " + getBrand() + " " + getModel());
        System.out.println(" двигатель с характеристиками " + engine.getCapacity() + " "
                + engine.getId() + " " + engine.getFuelType());
        System.out.println("Колеса " + wheel.getDiametr() + " диаметра, сезон : " + wheel.getwheelSpec());
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    public boolean open(IKey key) {

        return lock.open(key);
    }
}
