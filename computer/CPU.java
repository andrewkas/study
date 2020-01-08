package computer;

import java.util.Arrays;

public class CPU implements IParts{
    private CPUStandart standart;

    CPU(CPUStandart standart) {
        this.standart = standart;
    }

    @Override
    public IStandart[] getStandart() {
        return new IParts[0];
    }

    @Override
    public boolean test() {
        return Arrays.equals(CPUStandart.values(),getStandart());

    }
}
