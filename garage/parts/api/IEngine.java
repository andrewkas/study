package garage.parts.api;

import garage.parts.engine.FuelType;

public interface IEngine {
    String getId();
    FuelType getFuelType();
    double getCapacity();
    int getEnginePower();

    boolean start();
    boolean stop();
    double running();

}
