package garage.parts.Key;

import garage.cars.Mercedes;
import garage.parts.Lock.Lock;
import garage.parts.api.IKey;

public class Key implements IKey {
    private final String key;
        public Key(String key) {
        this.key = key;
       // keyOfLock(key);



    }

    @Override
    public String keyOfLock() {
        System.out.println("Мы пришли сюда");
        return key;
    }
}
