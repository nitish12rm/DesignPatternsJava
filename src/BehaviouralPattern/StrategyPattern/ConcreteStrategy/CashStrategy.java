package BehaviouralPattern.StrategyPattern.ConcreteStrategy;

import BehaviouralPattern.StrategyPattern.Strategy.PaymentStrategy;

public class CashStrategy implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Paying with Cash");
    }
}
