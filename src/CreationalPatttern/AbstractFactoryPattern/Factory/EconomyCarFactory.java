package CreationalPatttern.AbstractFactoryPattern.Factory;

import CreationalPatttern.AbstractFactoryPattern.products.Car;
import CreationalPatttern.AbstractFactoryPattern.products.CompactSuv;
import CreationalPatttern.AbstractFactoryPattern.products.SedanCar;
import CreationalPatttern.AbstractFactoryPattern.products.Suv;

public class EconomyCarFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new SedanCar();
    }

    @Override
    public Suv createSUV() {
        return new CompactSuv();
    }
}
