package BehaviouralPattern.ObserverPattern.Practice;

import BehaviouralPattern.ObserverPattern.Practice.Observable.IphoneStockStockObservable;
import BehaviouralPattern.ObserverPattern.Practice.Observable.StockObservable;
import BehaviouralPattern.ObserverPattern.Practice.Observer.EmailAlertNotificationObserver;
import BehaviouralPattern.ObserverPattern.Practice.Observer.MobileAlertNotificationObserver;
import BehaviouralPattern.ObserverPattern.Practice.Observer.NotificationAlertObserver;

public class ObserverPracticeDemo {
    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneStockStockObservable();

        NotificationAlertObserver observer1 = new EmailAlertNotificationObserver("hjjh@gmail.com",iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertNotificationObserver("xyz@gmail.com",iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertNotificationObserver("12345678",iphoneStockObservable);

        iphoneStockObservable.addObserver(observer1);
        iphoneStockObservable.addObserver(observer2);
        iphoneStockObservable.addObserver(observer3);

        iphoneStockObservable.setData(10);

    }
}
