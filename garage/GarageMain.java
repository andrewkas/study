package garage;

import garage.cars.Audi;
import garage.cars.Bmw;
import garage.cars.Mercedes;
import garage.parts.Key.Key;
import garage.parts.Lock.Lock;
import garage.parts.Wheel.Wheels;
import garage.parts.Wheel.WheelSpec;
//import garage.parts.engine.MercedesEngine;
import garage.parts.api.IKey;
import garage.parts.engine.AllEngine;
import garage.parts.engine.api.FuelType;

import java.util.Scanner;

public class GarageMain {
    public static void main(String[] args) {
                Mercedes mercedes = new Mercedes("Mercedes", "GL666", new AllEngine(3000,
                        FuelType.PETROL, "MB20"),
                        new Wheels(WheelSpec.SUMMER, 18),new Lock(("mercedes")));

                 Bmw bmw = new Bmw("BMW", "X1", new AllEngine(2000, FuelType.DIESEL, "N50"),
                new Wheels(WheelSpec.WINTER, 17),new Lock("bmw"));

                Audi audi = new Audi("Audi", "Q3", new AllEngine(2000, FuelType.PETROL, "TFSI"),
                new Wheels(WheelSpec.ALLWEATHER, 18),new Lock("audi"));

            IKey key=new Key("audi");
                if(mercedes.open(key)){
               mercedes.getInfo();
               mercedes.start();
                mercedes.stop();
                mercedes.fuel();}

                else if(bmw.open(key)){
                bmw.getInfo();
                bmw.start();
                bmw.driverSeat();
                bmw.drive();
                bmw.stop();
                bmw.fuel();}
                else if(audi.open(key)){
                    audi.getInfo();
                    audi.start();
                    audi.driverSeat();
                    audi.drive();
                    audi.stop();
                    audi.fuel();
                audi.changeWheel();}
                }
        }





