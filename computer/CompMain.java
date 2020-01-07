package computer;

import java.sql.SQLOutput;

public class CompMain {
    public static void main(String[] args) {
        IParts[]parts=new IParts[3];
        IStandart[]standarts =new IStandart[3];

        parts[0]=new CPU(CPUStandart.ZEN);
        parts[1]=new RAM(RAMStandart.DDR2);
        parts[2]=new HDD(HDDStandart.SAS);
        standarts[0]=CPUStandart.ZEN;
        standarts[1]=RAMStandart.DDR2;
       standarts[2]=HDDStandart.SATA;

        Comp comp=new Comp(parts,standarts);


        if(comp.start()) {
            System.out.println("Загружаюсь");
        }
    }
}
