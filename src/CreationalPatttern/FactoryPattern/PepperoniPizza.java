package CreationalPatttern.FactoryPattern;

public class PepperoniPizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing Pepperoni Pizza");
    }
}
