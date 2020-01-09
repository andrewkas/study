package computer;

import java.util.Arrays;

public class Comp {
    private IParts[] parts;
    private IStandart[] standarts;

    public Comp(IParts[] parts, IStandart[] standarts) {
        this.parts = parts;
        this.standarts = standarts;
    }

    public boolean start() {
        boolean result=true;
        for (int i = 0; i < parts.length; i++) {
               boolean check=parts[i].getStandart().equals(standarts[i]);
               if(check==false){
                   System.out.println(parts[i].getStandart()+" несовместим");}
                result=result&check;}
        return result;
    }
}






