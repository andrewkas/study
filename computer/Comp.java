package computer;

import java.util.Arrays;

public class Comp {
    private IParts[]parts;
    public IStandart[]standarts;

    public Comp(IParts[]parts,IStandart[]standarts){
        this.parts=parts;
        this.standarts=standarts;
    }

    public boolean start() {
        return true;
//return parts.equals(standarts);
       //if(parts.equals(CPUStandart.values())){

            // return parts[2].test();
               // parts[0].test()& parts[1].test() & parts[2].test();

    }
}




