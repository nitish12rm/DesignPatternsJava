package CreationalPatttern.AbstractFactoryPattern.products;

public class LuxurySuv implements Suv{
    @Override
    public void build() {
        System.out.println("Building a Luxury SUV 🚙💎");
    }
}
