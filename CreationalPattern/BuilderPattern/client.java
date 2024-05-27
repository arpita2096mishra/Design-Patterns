public class client {
    public static void main(String[] args) {
        Phone nPhone=new PhoneBuilder().setOs("Android").setRam(32).getPhone();
        System.out.println(nPhone);
                
    }
}
