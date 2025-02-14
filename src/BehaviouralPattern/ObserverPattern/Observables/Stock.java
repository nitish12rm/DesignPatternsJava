package BehaviouralPattern.ObserverPattern.Observables;

import BehaviouralPattern.ObserverPattern.Observers.Observer;

import java.util.ArrayList;
import java.util.List;


/// Observable concrete class
public class Stock implements Observable{
    public List<Observer> observerList = new ArrayList<>();
    private float stockPrice;

    @Override
    public void addObserver(Observer obj) {
        observerList.add(obj);
    }

    @Override
    public void removeObserver(Observer obj) {
        observerList.remove(obj);

    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observerList){
            observer.update(stockPrice);
        }
    }

    @Override
    public void setData(float data) {
        this.stockPrice = data;
        notifyObservers();
    }
}
