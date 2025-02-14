package CreationalPatttern.FactoryPattern;

public class FactoryDemo {
    public static void main(String[] args) {
        Pizza pizza1 = PizzaFactory.createPizza("cheese");
        pizza1.prepare();

        Pizza pizza2 = PizzaFactory.createPizza("pepperoni");
        pizza2.prepare();

        Pizza pizza3 = PizzaFactory.createPizza("veggie");
        pizza3.prepare();
    }
}
