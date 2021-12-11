package garage.cars;

import garage.cars.api.ACars;
import garage.parts.Lock.Lock;
import garage.parts.Wheel.VagWheels;
import garage.parts.api.IKey;
import garage.parts.api.ILock;
import garage.parts.api.IWheel;
import garage.parts.engine.AllEngine;
import garage.parts.engine.BmwEngine;
//import garage.parts.engine.MercedesEngine;


public class Bmw extends ACars {

    public Bmw() {

        this.brand = "BMW";
        this.model = "X3";
        this.engine = new BmwEngine();
        this.wheel = new VagWheels();
        this.lock = new Lock("BMW");



    }

}

