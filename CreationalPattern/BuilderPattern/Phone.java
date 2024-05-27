public class Phone {
    private String os;
    private int ram;
    private String processor;
    private int battery;
    private double screenSize;
    public Phone(String os,int ram,String processor,int battery,double screenSize){
        this.os=os;
        this.ram=ram;
        this.processor=processor;
        this.battery=battery;
        this.screenSize=screenSize;
    }
    @Override
    public String toString(){
        return "Phone: "+"os-"+os+",ram-"+ram+",processor-"+processor+",battery-"+battery+",screensize-"+screenSize;
    }
}
    

