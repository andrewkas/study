package computer;

public class CompConstructor {
    private CPUStandart CPU;
    private RAMStandart RAM;
    private HDDStandart HDD;
    private IStandart CPU1;
    private IStandart RAM1;
    private IStandart HDD1;
    IParts[]parts=new IParts[3];
    IStandart[]standarts =new IStandart[3];



    public void setCPU(CPUStandart CPU){
        this.CPU=CPU;
    }
    public void setRAM(RAMStandart RAM){
        this.RAM=RAM;
    }
    public void setHDD(HDDStandart HDD){
        this.HDD=HDD;
    }
    public void setCPU1(IStandart CPU1){
        this.CPU1=CPU1;
    }
    public void setRAM1 (IStandart RAM1){
        this.RAM1=RAM1;
    }
    public void setHDD1 (IStandart HDD1){
        this.HDD1=HDD1;
    }




    public Comp getComp(){
        parts[0]=new CPU(CPU);
        parts[1]=new RAM(RAM);
        parts[2]=new HDD(HDD);
        standarts[0]=CPU1;
        standarts[1]=RAM1;
        standarts[2]=HDD1;

        return new Comp(parts,standarts);


    }

}
