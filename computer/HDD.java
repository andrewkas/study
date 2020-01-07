package computer;

public class HDD implements IParts{
    private HDDStandart standart;

    HDD(HDDStandart standart) {
        this.standart = standart;

    }

    @Override
    public IStandart[] getStandart() {
        return new IStandart[0];
    }

    @Override
    public boolean test() {
        return false;
    }
}

