package CreationalPatttern.AbstractFactoryPattern.products;

public class SedanCar implements Car{
    @Override
    public void assemble() {
        System.out.println("Assembling a Sedan 🚗");
    }
}
