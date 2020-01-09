package computer;

public class RAM implements IParts {
    private IStandart standart;

    RAM(IStandart standart) {
        this.standart = standart;

    }

    @Override
    public RAMStandart getStandart() {
        return (RAMStandart) standart;
    }

    @Override
    public boolean test() {
        return false;
    }
}
