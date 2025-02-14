package BehaviouralPattern.ObserverPattern;

import BehaviouralPattern.ObserverPattern.Observables.Stock;
import BehaviouralPattern.ObserverPattern.Observers.Investor;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Stock appleStock = new Stock();

        Investor investor1 = new Investor("Nitish");
        Investor investor2 = new Investor("Vartica");

        appleStock.addObserver(investor1);
        appleStock.addObserver(investor2);

        appleStock.setData(150.50f);
        appleStock.setData(155.75f);

        // Removing an observer
        appleStock.removeObserver(investor1);

        // Another stock price change (only Vartica gets notified)
        appleStock.setData(160.00f);
        appleStock.setData(170.00f);
        appleStock.setData(100.00f);

    }
}
