package StructuralPattern.DecoratorPattern.Decorators;

import StructuralPattern.DecoratorPattern.BasePizza;

public class ExtraCheese extends ToppingDecorator{
    /// Constructor Injection
    BasePizza basePizza;
    public ExtraCheese(BasePizza pizza){
        super(pizza);
    }
    @Override
    public String getDesc() {
        return tempPizza.getDesc() + " + Extra Cheese";
    }

    @Override
    public int cost() {
        return tempPizza.cost() + 15;
    }
}
