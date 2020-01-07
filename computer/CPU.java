package computer;

public class CPU implements IParts{
    private CPUStandart standart;

    CPU(CPUStandart standart) {
        this.standart = standart;
    }

    @Override
    public IStandart[] getStandart() {
        return new IStandart[0];
    }

    @Override
    public boolean test() {
        CPUStandart.valueOf(new CPU(CPUStandart.ZEN));
        return false;
    }
}
