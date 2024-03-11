public class EmailAlertObserver implements NotificationAlertObserver {

    public StocksObservable observable;
    public String email;

    public EmailAlertObserver(StocksObservable observable,String email){
        this.observable=observable;
        this.email=email;
    }
    @Override
    public void update() {
       sendEmail(email,"The product is back in stock");
    }
    public void sendEmail(String email, String string) {
        System.out.println("email sent to "+email);
    }
    
}
