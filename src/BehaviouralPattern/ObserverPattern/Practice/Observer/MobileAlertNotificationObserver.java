package BehaviouralPattern.ObserverPattern.Practice.Observer;


import BehaviouralPattern.ObserverPattern.Practice.Observable.StockObservable;

public class MobileAlertNotificationObserver implements NotificationAlertObserver {
   String mobileNumber;
   StockObservable stockObservable;

   public  MobileAlertNotificationObserver(String mobileNumber, StockObservable stockObservable){
       this.mobileNumber = mobileNumber;
       this.stockObservable = stockObservable;
   }
    @Override
    public void update() {
        System.out.println("Mobile message sent to:" + mobileNumber);
    }
}
