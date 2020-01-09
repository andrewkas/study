package computer;

public class CPU implements IParts{
    private IStandart standart;

    CPU(IStandart standart) {
        this.standart = standart;
    }

    @Override
    public CPUStandart getStandart() {
        return (CPUStandart) standart;
    }

    @Override
    public boolean test() {
        return false;

    }

}
