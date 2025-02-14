package StructuralPattern.DecoratorPattern;

public class MargaritaPizza extends  BasePizza{
    @Override
    public String getDesc() {
        return "Margarita Pizza";
    }

    @Override
    public int cost() {
        return 10;
    }
}
