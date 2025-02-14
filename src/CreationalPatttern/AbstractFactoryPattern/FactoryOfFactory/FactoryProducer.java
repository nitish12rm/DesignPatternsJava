package CreationalPatttern.AbstractFactoryPattern.FactoryOfFactory;

import CreationalPatttern.AbstractFactoryPattern.Factory.CarFactory;
import CreationalPatttern.AbstractFactoryPattern.Factory.EconomyCarFactory;
import CreationalPatttern.AbstractFactoryPattern.Factory.LuxuryCarFactory;

public class FactoryProducer {
    public static CarFactory getFactory(String type){
       return switch (type){
            case "economy"-> new EconomyCarFactory();
            case "luxury" -> new LuxuryCarFactory();
            default -> throw new IllegalArgumentException("Unknown car");
        };
    }
}
