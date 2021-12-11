package garage;

import garage.cars.Audi;
import garage.cars.Bmw;
import garage.cars.api.ACars;
import garage.parts.Key.Key;
import garage.parts.Lock.Lock;
import garage.parts.Wheel.Wheels;
import garage.parts.Wheel.WheelSpec;
//import garage.parts.engine.MercedesEngine;
import garage.parts.api.IKey;
import garage.parts.engine.AllEngine;
import garage.parts.engine.VagEngine;

public class GarageMain {
    public static void main(String[] args) {
    Garage garage=new Garage();
    IKey key = new Key("audi");
        ACars cars=garage.getCar(key);
    try {
        cars.getInfo();
        cars.driverSeat();
        cars.start();
        cars.start();
        cars.drive();
    }catch (NullPointerException e ) {System.out.println("Ключ не подходит!");}


          //  cars.changeWheel();
        }
    }







