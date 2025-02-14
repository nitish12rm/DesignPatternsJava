package CreationalPatttern.FactoryPattern;

public class PizzaFactory {
    public static Pizza createPizza(String type){
        return switch (type.toLowerCase()) {
            case "cheese" -> new CheesePizza();
            case "pepperoni" -> new PepperoniPizza();
            case "veggie" -> new VeggiePizza();
            default -> throw new IllegalArgumentException("Unknown Pizza: " + type);
        };
    }
}
