package computer;

public class Direktor {

    public void compSuperConst(CompConstructor compConstructor) {
        compConstructor.setCPU(CPUStandart.XEON);
        compConstructor.setRAM(RAMStandart.DDR3);
        compConstructor.setHDD(HDDStandart.SATA);
        compConstructor.setCPU1(CPUStandart.ZEN);
        compConstructor.setRAM1(RAMStandart.DDR3);
        compConstructor.setHDD1(HDDStandart.SAS);
    }

    public void compSimplyConst(CompConstructor compConstructor) {
        compConstructor.setCPU(CPUStandart.ZEN);
        compConstructor.setRAM(RAMStandart.DDR3);
        compConstructor.setHDD(HDDStandart.SAS);
        compConstructor.setCPU1(CPUStandart.ZEN);
        compConstructor.setRAM1(RAMStandart.DDR3);
        compConstructor.setHDD1(HDDStandart.SAS);
    }
}

