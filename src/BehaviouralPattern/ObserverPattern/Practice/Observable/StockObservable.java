package BehaviouralPattern.ObserverPattern.Practice.Observable;

import BehaviouralPattern.ObserverPattern.Practice.Observer.NotificationAlertObserver;

public interface StockObservable {
    void addObserver(NotificationAlertObserver obj);
    void removeObserver(NotificationAlertObserver obj);
    void notifyObserver();
    void setData(int newQtyCount);
}
