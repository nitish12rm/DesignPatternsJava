package CreationalPatttern.FactoryPattern;

public class CheesePizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing Cheesy Pizza");
    }
}
