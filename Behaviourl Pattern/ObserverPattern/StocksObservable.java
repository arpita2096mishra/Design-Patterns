
public interface StocksObservable{

    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void notifyObservers();
    public void setCount(int count);
    public int getCount();
    
}