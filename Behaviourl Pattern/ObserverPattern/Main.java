public class Main{
    public static void main(String[] args){
        IphoneObservable obj=new IphoneObservable();
        NotificationAlertObserver ob1=new EmailAlertObserver(obj, "xyz@gmail.com");
        NotificationAlertObserver ob2=new EmailAlertObserver(obj, "abc@gmail.com");
        NotificationAlertObserver ob3=new MobileAlertObserver(ob2, "8340238414");

        obj.add(ob1);
        obj.add(ob2);
        obj.add(ob3);
     
        obj.setCount(10);
        obj.setCount(0);
        obj.setCount(100);

    }
}