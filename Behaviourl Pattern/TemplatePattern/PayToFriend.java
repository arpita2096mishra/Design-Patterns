public class PayToFriend extends PaymentFlow{

    @Override
    public void validateRequest() {
       System.out.println("The request is validated for friend");
    }

    @Override
    public void calculateFee() {
        System.out.println("No fee");
    }

    @Override
    public void debit() {
        System.out.println("Amount debited");
      
    }

    @Override
    public void credit() {
        System.out.println("Amount credited");
    }
    
}
