import BehaviouralPattern.StrategyPattern.ConcreteStrategy.CashStrategy;
import BehaviouralPattern.StrategyPattern.ConcreteStrategy.CreditCardStrategy;
import BehaviouralPattern.StrategyPattern.ConcreteStrategy.UpiStrategy;
import BehaviouralPattern.StrategyPattern.PaymentContext;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /// BEHAVIOURAL--> STRATEGY PATTERNs
        List<PaymentContext> paymentContextList =  new ArrayList<>();
        paymentContextList.add(new PaymentContext(new CashStrategy()));
        paymentContextList.add(new PaymentContext(new CreditCardStrategy()));
        paymentContextList.add(new PaymentContext(new UpiStrategy()));

        for(PaymentContext paymentContext : paymentContextList){
            paymentContext.pay();
        }



    }
}