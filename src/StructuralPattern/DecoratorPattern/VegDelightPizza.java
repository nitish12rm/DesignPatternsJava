package StructuralPattern.DecoratorPattern;

public class VegDelightPizza extends  BasePizza{
    @Override
    public String getDesc() {
        return "Veg Delight Pizza";
    }

    @Override
    public int cost() {
        return 150;
    }
}
