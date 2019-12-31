package garage.parts.Key;

import garage.parts.api.IKey;

public class Key implements IKey {
    private final String key;

    public Key(String key) {
        this.key = key;
    }

    @Override
    public String keyOfLock() {
        return null;
    }
}
