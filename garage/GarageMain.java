package garage;

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
        IKey key=new Key("mercedes");
       // System.out.println("Введите Ваш ключ : ");
        //Scanner in = new Scanner(System.in);
        //int key = in.nextInt();

      //  switch (key) {
        //    case 1:
                Mercedes mercedes = new Mercedes("Mercedes", "GL666", new AllEngine(3000,
                        FuelType.PETROL, "MB20"),
                        new Wheels(WheelSpec.SUMMER, 18),new Lock(("mercedes")));
                System.out.print("Ваш ключ подошел к : " + mercedes.getBrand() + " " + mercedes.getModel());
                mercedes.getInfo();
                mercedes.start();
                mercedes.stop();
                mercedes.fuel();
                mercedes.open(key);

          //      break;
           // case 2:
                Bmw bmw = new Bmw("BMW", "X1", new AllEngine(2000, FuelType.DIESEL, "N50"),
                        new Wheels(WheelSpec.WINTER, 17),new Lock("bmw"));
                System.out.print("Ваш ключ подошел к : " + bmw.getBrand() + " " + bmw.getModel());
                bmw.getInfo();
                bmw.start();
                bmw.driverSeat();

           //     break;




        }


    }


