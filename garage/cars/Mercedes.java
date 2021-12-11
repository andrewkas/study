package garage.cars;

import garage.cars.api.ACars;
import garage.parts.Lock.Lock;
import garage.parts.Wheel.VagWheels;
import garage.parts.api.IKey;
import garage.parts.api.ILock;
import garage.parts.api.IWheel;
import garage.parts.engine.AllEngine;
import garage.parts.api.IEngine;
import garage.parts.engine.VagEngine;

public class Mercedes extends ACars {

    public Mercedes() {

        this.brand = "Mercedes";
        this.model = "CL";
        this.engine = new VagEngine();
        this.wheel = new VagWheels();
        this.lock = new Lock("merc");
    }





}
