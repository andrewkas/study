package garage.parts.api;

public interface ILock {

    boolean close(IKey key);
    boolean open(IKey key);

}
