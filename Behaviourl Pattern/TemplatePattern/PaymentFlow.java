public abstract class PaymentFlow {
    public abstract void validateRequest();
    public abstract void calculateFee();
    public abstract void debit();
    public abstract void credit();

    public final void sendMoney(){
        validateRequest();
        calculateFee();
        debit();
        credit();
    }
    /* The subclasses can have different implementations for all the above methods but they can't overridde sendMoney() method and they have to call the implemented methods in the specified order */
}
