public class AirConditioner {
    boolean isOn;
    int temp;

    public void turnOn(){
        isOn=true;
        System.out.println("AC is turned on");
    }

    public void turnOff(){
        isOn=false;
        System.out.println("AC is turned off");
    }

    public void setTemp(int temp){
        this.temp=temp;
        System.out.println("AC temp is set to:"+temp);
    }
}
