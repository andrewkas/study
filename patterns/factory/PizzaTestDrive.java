package patterns.factory;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chStore= new ChicagoStylePizzaStore();

        Pizza pizza=nyStore.orderPizza("cheese");
        System.out.println("I ordered a "+pizza.getName()+"\n");

        pizza=chStore.orderPizza("pepperoni");
        System.out.println("Helen ordered a "+pizza.getName()+"\n");

        pizza=chStore.orderPizza("cheese");
        System.out.println("Helen ordered a "+pizza.getName()+"\n");
    }
}
