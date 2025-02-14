package BehaviouralPattern.ObserverPattern.Observables;

import BehaviouralPattern.ObserverPattern.Observers.Observer;

public interface Observable {
    void addObserver(Observer obj);
    void removeObserver(Observer obj);
    void notifyObservers();
    void setData(float data);
}
