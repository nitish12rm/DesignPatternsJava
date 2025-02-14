package CreationalPatttern.AbstractFactoryPattern.products;

public class CoupeCar implements Car{
    @Override
    public void assemble() {
        System.out.println("Assembling a Coupe 🚙");
    }
}
