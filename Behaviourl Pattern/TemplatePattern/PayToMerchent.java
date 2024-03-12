public class PayToMerchent extends PaymentFlow{

    @Override
    public void validateRequest() {
        System.out.println("request validated by merchent");
    }

    @Override
    public void calculateFee() {
        System.out.println("merchent fee is calculated");
    }

    @Override
    public void debit() {
        System.out.println("money debited");
    }

    @Override
    public void credit() {
        System.out.println("money credited");
    }
    
}
