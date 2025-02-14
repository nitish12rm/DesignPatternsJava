package StructuralPattern.DecoratorPattern.Decorators;

import StructuralPattern.DecoratorPattern.BasePizza;

public abstract class ToppingDecorator extends BasePizza {
    protected BasePizza tempPizza;

    public ToppingDecorator(BasePizza pizza) {
        this.tempPizza = pizza;
    }

    @Override
    public String getDesc() {
        return tempPizza.getDesc();
    }

    @Override
    public int cost() {
        return tempPizza.cost();
    }
}
