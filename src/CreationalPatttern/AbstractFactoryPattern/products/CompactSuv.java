package CreationalPatttern.AbstractFactoryPattern.products;

public class CompactSuv implements Suv{

    @Override
    public void build() {
        System.out.println("Building a Compact SUV 🚜");
    }
}
