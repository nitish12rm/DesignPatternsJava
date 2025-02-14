package CreationalPatttern.AbstractFactoryPattern.Factory;

import CreationalPatttern.AbstractFactoryPattern.products.Car;
import CreationalPatttern.AbstractFactoryPattern.products.CoupeCar;
import CreationalPatttern.AbstractFactoryPattern.products.LuxurySuv;
import CreationalPatttern.AbstractFactoryPattern.products.Suv;

public class LuxuryCarFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new CoupeCar();
    }

    @Override
    public Suv createSUV() {
        return new LuxurySuv();
    }
}
