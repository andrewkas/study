package computer;

import java.util.Arrays;

public class HDD implements IParts {
    private HDDStandart standart;

    HDD(HDDStandart standart) {
        this.standart = standart;

    }

    @Override
    public IStandart[] getStandart() {
         return new IParts[2];
    }

    @Override
    public boolean test() {
        return false;

    }
}

