package BehaviouralPattern.StrategyPattern;

import BehaviouralPattern.StrategyPattern.Strategy.PaymentStrategy;

public class PaymentContext{
    PaymentStrategy paymentStrategy;
    public PaymentContext(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }
    public void pay(){
        paymentStrategy.pay();
    }
}
