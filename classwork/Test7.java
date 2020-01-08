package classwork;

import garage.parts.engine.AllEngine;

import java.beans.ConstructorProperties;
import java.lang.reflect.Constructor;

public class Test7 {
    public static void main(String[] args) {
        Constructor<?>[]constructors=AllEngine.class.getConstructors();
        for(Constructor<?>constructor:constructors){
            Version annotation =constructor.getAnnotation(Version.class);
            if(annotation!=null){
                System.out.println(annotation.info());
            }
        }
    }

}
//дженерики в названии класса <T>