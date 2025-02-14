package BehaviouralPattern.StrategyPattern.ConcreteStrategy;

import BehaviouralPattern.StrategyPattern.Strategy.PaymentStrategy;

public class UpiStrategy implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Paying with Upi");

    }
}
