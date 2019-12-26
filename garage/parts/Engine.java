package garage.parts;

import garage.parts.api.IEngine;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Engine implements IEngine{
    Engine engine=new Engine();
    public void engineParam(String eng){
        int a=64;
        System.out.println(EngineSpecific.valueOf(eng).getHpower());
        System.out.println(EngineSpecific.valueOf(eng).getVolume());
        double distance=a/EngineSpecific.valueOf(eng).getConsump();
        System.out.println(distance);
    }

    public void start() {
        System.out.println("Запустили двигатель!");
    }

    public void running() {
        System.out.println("Работает тр-тр-тр-тр");
    }

    public void stop() {
        System.out.println("Двигатель заглушен!");
    }
}

