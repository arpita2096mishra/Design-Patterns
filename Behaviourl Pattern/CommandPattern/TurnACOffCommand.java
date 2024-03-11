public class TurnACOffCommand implements ICommand{
    AirConditioner ac;
    public TurnACOffCommand(AirConditioner ac){
        this.ac=ac;
    }

    @Override
    public void execute() {
        ac.turnOff();
    }
    public void undo() {
        ac.turnOn();
    }
    
}
