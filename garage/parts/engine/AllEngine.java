package garage.parts.engine;

import garage.parts.api.IEngine;

import java.util.Random;

public abstract class AllEngine implements IEngine {
    protected String id;
    protected double capacity;
    protected int enginePower;


   FuelType fuelType;
    private boolean running = false;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public double getCapacity() {
        return capacity;
    }

    @Override
    public int getEnginePower() {
        return enginePower;
    }

    @Override
    public FuelType getFuelType() {
        return fuelType;
    }


    public boolean start(){
        if(!running){
            running = true;
        } else {
            throw new IllegalArgumentException("КХХХХХ двигатель уже заведен!!!");
        }
        return running;
    }
    public boolean stop(){
        if(running){
            running = false;
        } else {
            throw new IllegalArgumentException("Двигатель уже остановлен!!!");
        }
        return running;
    }
    public double running(){
        if(running){
            int runTime=new Random().nextInt(600);
            return runTime;
        }
        return 0;
    }

    @Override
    public String toString() {
        return
                "id='" + id + '\'' +
                ", capacity=" + capacity +
                ", enginePower=" + enginePower +
                ", fuelType=" + fuelType
                ;
    }
}
