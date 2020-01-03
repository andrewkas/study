package garage.cars;

import garage.cars.api.ACars;
import garage.parts.api.IKey;
import garage.parts.api.IWheel;
import garage.parts.engine.AllEngine;
import garage.parts.engine.api.IEngine;

public class Audi extends ACars {
    private String brand;
    private String model;
    private AllEngine engine;
    private IWheel wheel;

    public Audi(String brand, String model, AllEngine engine, IWheel wheel) {
        this. brand = brand;
        this.model = model;
        this.engine = engine;
        this.wheel = wheel;


    }
    public void getInfo(){
        System.out.println(" двигатель с характеристиками "+engine.getCapacity()+ " "
                +engine.getId()+" "+engine.getFuelType());
        System.out.println("Колеса " +wheel.getDiametr()+" диаметра, сезон : "+wheel.getwheelSpec());
    }


    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getBrand() {
        return brand;
    }
    @Override
    public boolean open(IKey key) {
        return false;
    }
}

