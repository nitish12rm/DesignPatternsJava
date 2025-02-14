package StructuralPattern.DecoratorPattern;

import StructuralPattern.DecoratorPattern.Decorators.ExtraCheese;
import StructuralPattern.DecoratorPattern.Decorators.Mushroom;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        BasePizza pizza = new MargaritaPizza();
        System.out.println(pizza.getDesc() + " -> $" + pizza.cost());
        /// Add Extra cheese
        pizza = new ExtraCheese(pizza);
        System.out.println(pizza.getDesc() + " -> $" + pizza.cost());
        /// add mushrooms
        pizza = new Mushroom(pizza);
        System.out.println(pizza.getDesc() + " -> $" + pizza.cost());
    }
}
