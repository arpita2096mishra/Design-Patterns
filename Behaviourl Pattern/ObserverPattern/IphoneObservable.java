import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements StocksObservable {
    public List<NotificationAlertObserver> observers=new ArrayList<>();
    public int count=0;

    @Override
    public void add(NotificationAlertObserver observer){
       observers.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer){
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(){
       for(NotificationAlertObserver obj: observers){
        obj.update();
       }
    }

    @Override
    public void setCount(int count){
           if(this.count==0){
            notifyObservers();
           }
           this.count=count;
    }

    @Override
    public int getCount(){
        return count;

    }
}
