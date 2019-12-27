package garage;

import garage.cars.Audi;

public class GarageMain {
    public static void main(String[] args) {
       Audi A4=new Audi();
       A4.specification();
        A4.open();
        A4.start();
       A4.drive();
       A4.stop();
       A4.close();




    }
}
