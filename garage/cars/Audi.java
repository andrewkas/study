package garage.cars;

import garage.cars.api.ACars;
import garage.parts.engine.api.IEngine;

public abstract class Audi extends ACars {
    private String model;
    private IEngine engine;

    public Audi(String model, IEngine engine){
        this.model = model;
        this.engine = engine;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getBrand() {
        return "Mercedes";
    }
}