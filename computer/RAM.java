package computer;

public class RAM implements IParts{
    private RAMStandart standart;
    RAM(RAMStandart standart){
        this.standart=standart;

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
