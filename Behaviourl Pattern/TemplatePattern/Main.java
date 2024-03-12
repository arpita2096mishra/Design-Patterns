/*
 * when we want all classes to follow a specific order while doing a task.
 * eg paytoFriend,PayOnline (steps 1.validateRequest 2.calculateFee(platform fee) 3.debit money 4.credit money )
 */
public class Main{
    public static void main(String[] args) {
        PayToFriend pf=new PayToFriend();
        PayToMerchent pm=new PayToMerchent();
        pf.sendMoney();
        pm.sendMoney();
    }
}