package computer;

public class HDD implements IParts {
    private IStandart standart;

    HDD(HDDStandart standart) {
        this.standart = standart;

    }

    @Override
    public HDDStandart getStandart() {
         return (HDDStandart) standart;
    }

    @Override
    public boolean test() {
        return false;

    }
}

