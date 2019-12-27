package garage.parts;

import garage.parts.api.ILock;

public class Lock implements ILock {

    @Override
    public void unlock() {
        System.out.println("Замок открыт");
    }

    @Override
    public void lock() {
        System.out.println("Замок закрыт");

    }
}
