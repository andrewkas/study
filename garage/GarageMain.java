package garage;

import garage.cars.Bmw;
import garage.cars.Mercedes;
import garage.parts.Wheel.Wheels;
import garage.parts.Wheel.WheelSpec;
//import garage.parts.engine.MercedesEngine;
import garage.parts.engine.AllEngine;
import garage.parts.engine.api.FuelType;

import java.util.Scanner;

public class GarageMain {
    public static void main(String[] args) {
        System.out.println("Введите Ваш ключ : ");
        Scanner in = new Scanner(System.in);
        int key = in.nextInt();

        switch (key) {
            case 1:
                Mercedes mercedes1 = new Mercedes("Mercedes", "GL666", new AllEngine(3,
                        FuelType.PETROL, "MB20"),
                        new Wheels(WheelSpec.SUMMER, 18));
                //  Mercedes mercedes2 = new Mercedes("GL666", new NoNameEngine());
                System.out.print("Ваш ключ подошел к : " + mercedes1.getBrand() + " " + mercedes1.getModel());
                mercedes1.getInfo();

                mercedes1.start();
                mercedes1.stop();
                mercedes1.fuel();
                break;
            case 2:
                Bmw bmw1 = new Bmw("BMW", "X1", new AllEngine(2, FuelType.DIESEL, "N50"),
                        new Wheels(WheelSpec.WINTER, 17));
                System.out.print("Ваш ключ подошел к : " + bmw1.getBrand() + " " + bmw1.getModel());
                bmw1.getInfo();
                bmw1.start();


        }


    }}


