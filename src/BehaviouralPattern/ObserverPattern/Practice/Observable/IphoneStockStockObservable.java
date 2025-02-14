package BehaviouralPattern.ObserverPattern.Practice.Observable;

import BehaviouralPattern.ObserverPattern.Practice.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockStockObservable implements StockObservable {
    public static String name = "Iphone";
    public List<NotificationAlertObserver> notificationAlertObserverList = new ArrayList<>();
    private int quantity=0;
    @Override
    public void addObserver(NotificationAlertObserver obj) {
        notificationAlertObserverList.add(obj);
    }

    @Override
    public void removeObserver(NotificationAlertObserver obj) {
    notificationAlertObserverList.remove(obj);
    }

    @Override
    public void notifyObserver() {
        for(NotificationAlertObserver notificationAlertObserver : notificationAlertObserverList){
            notificationAlertObserver.update();
        }
    }

    @Override
    public void setData(int newQtyCount) {
        if(quantity == 0){
            notifyObserver();
        }
        quantity += newQtyCount;
    }
}
