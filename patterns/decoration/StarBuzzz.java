package patterns.decoration;

public class StarBuzzz {
    public static void main(String[] args) {
        Beverage beverage=new Espresso();
        System.out.println(beverage.getDescription()+" $ "+beverage.cost());

        Beverage beverage1=new HouseBlend();
        beverage1=new Mocha(beverage1);
        beverage1=new Mocha(beverage1);
        beverage1=new Whip(beverage1);
        System.out.println(beverage1.getDescription()+" $ "+beverage1.cost());

        Beverage beverage2=new Whip(new Mocha(new Soy(new Espresso())));
        System.out.println(beverage2.getDescription()+" $ "+beverage2.cost());
    }
}
