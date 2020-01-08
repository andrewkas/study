package computer;

import java.util.Arrays;

public class RAM implements IParts {
    private RAMStandart standart;

    RAM(RAMStandart standart) {
        this.standart = standart;

    }

    @Override
    public IStandart[] getStandart() {
        return new IParts[1];
    }

    @Override
    public boolean test() {
        return false;
    }
}
