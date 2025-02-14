package CreationalPatttern.AbstractFactoryPattern.Factory;

import CreationalPatttern.AbstractFactoryPattern.products.Car;
import CreationalPatttern.AbstractFactoryPattern.products.Suv;

public interface CarFactory {
    Car createCar();
    Suv createSUV();
}
