package garage.cars;

import garage.cars.api.ACars;
import garage.parts.Lock.Lock;
import garage.parts.Wheel.VagWheels;
import garage.parts.api.IKey;
import garage.parts.api.ILock;
import garage.parts.api.IWheel;
import garage.parts.engine.AllEngine;
import garage.parts.engine.VagEngine;

public class Audi extends ACars {


    public Audi() {
        this.brand = "Audi";
        this.model = "Q3";
        this.engine = new VagEngine();
        this.wheel = new VagWheels();
        this.lock = new Lock("audi");

    }


}

