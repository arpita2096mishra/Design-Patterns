public class MobileAlertObserver implements NotificationAlertObserver{

    public NotificationAlertObserver observer;
    public String mob_no;

    public MobileAlertObserver(NotificationAlertObserver observer,String mob_no){
        this.observer=observer;
        this.mob_no=mob_no;
    }

    @Override
    public void update() {
      sendMessage(mob_no, "The item is back in stock");    
    }

    public void sendMessage(String mob_no2, String msg) {
      System.out.println("msg is sent to user:"+mob_no);
    }

    
}
