package garage.cars.api;

import garage.parts.api.IKey;

public interface ICar {
    String getModel();
    String getBrand();

    void getInfo();

    void drive();
    boolean open(IKey key);

//    void open();

    void close();
    void start();
    void stop();
    void fuel();
    void changeWheel();
    void driverSeat();
    void passengerSeat();
}
