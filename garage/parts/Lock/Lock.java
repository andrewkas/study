package garage.parts.Lock;

import garage.parts.api.IKey;
import garage.parts.api.ILock;

public class Lock implements ILock {
private final String numberOfKey;

   public Lock(String numberOfKey) {
        this.numberOfKey = numberOfKey;
    }
    @Override
    public boolean close(IKey key) {
        return key.keyOfLock().equals(numberOfKey);
  }
    @Override
    public boolean open(IKey key) {
        return key.keyOfLock().equals(numberOfKey);
    }
}

