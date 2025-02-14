package CreationalPatttern.AbstractFactoryPattern;

import CreationalPatttern.AbstractFactoryPattern.Factory.CarFactory;
import CreationalPatttern.AbstractFactoryPattern.FactoryOfFactory.FactoryProducer;
import CreationalPatttern.AbstractFactoryPattern.products.Car;
import CreationalPatttern.AbstractFactoryPattern.products.Suv;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        CarFactory economyFactory = FactoryProducer.getFactory("economy");
        Car economyCar = economyFactory.createCar();
        Suv economySuv = economyFactory.createSUV();
        economyCar.assemble(); // Output: Assembling a Sedan 🚗
        economySuv.build();

        CarFactory luxuryFactory = FactoryProducer.getFactory("luxury");
        Car luxuryCar = luxuryFactory.createCar();
        Suv luxurySuv = luxuryFactory.createSUV();
        luxuryCar.assemble();
        luxurySuv.build();
    }
}
