package StructuralPattern.DecoratorPattern.Decorators;

import StructuralPattern.DecoratorPattern.BasePizza;

public class Mushroom extends ToppingDecorator{
    public Mushroom(BasePizza pizza) {
        super(pizza);
    }
    @Override
    public String getDesc() {
        return tempPizza.getDesc() + " + Mushroom";
    }
    @Override
    public int cost(){
        return tempPizza.cost() + 11;
    }
}
