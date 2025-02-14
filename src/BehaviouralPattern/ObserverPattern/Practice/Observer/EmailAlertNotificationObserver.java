package BehaviouralPattern.ObserverPattern.Practice.Observer;

import BehaviouralPattern.ObserverPattern.Practice.Observable.IphoneStockStockObservable;
import BehaviouralPattern.ObserverPattern.Practice.Observable.StockObservable;

public class EmailAlertNotificationObserver implements NotificationAlertObserver{
   String email;
   StockObservable stockObservable;

   public  EmailAlertNotificationObserver(String email, StockObservable stockObservable){
       this.email = email;
       this.stockObservable = stockObservable;
   }
    @Override
    public void update() {
        System.out.println("mail sent to:" + email);
    }
}
