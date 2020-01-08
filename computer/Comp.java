package computer;

public class Comp {
    private IParts[]parts;
    private IStandart[]standarts;

    public Comp(IParts[]parts,IStandart[]standarts){
        this.parts=parts;
        this.standarts=standarts;
    }

    public boolean start(){
        return parts[0].test()&& parts[1].test() && parts[2].test();
}
}



