package garage;

import garage.cars.Audi;
import garage.cars.Bmw;
import garage.cars.Mercedes;
import garage.cars.api.ACars;
import garage.parts.api.IKey;

public class Garage {
    ACars cars = new Audi();
    ACars cars1 = new Bmw();
    ACars cars2 = new Mercedes();

    public ACars getCar(IKey key) {
        if (cars.open(key))
            return cars;
        else if (cars1.open(key))
            return cars1;
        else if (cars2.open(key))
            return cars2;
        else return null;
    }
}
