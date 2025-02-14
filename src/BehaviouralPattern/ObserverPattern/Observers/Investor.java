package BehaviouralPattern.ObserverPattern.Observers;

/// Observer Concrete class
public class Investor implements Observer{
    private String name;

    public Investor(String name) {
        this.name = name;
    }
    @Override
    public void update(float stockPrice) {
        System.out.println(name + " received stock price update: $" + stockPrice);
    }
}
