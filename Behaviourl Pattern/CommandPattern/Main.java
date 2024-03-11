/*
 * It is a behavioral design pattern.
 * It solves following three problems:
   1. Lack of abstraction
   2. Undo and Redo functionality
   3. Code maintainance

 * There are four entities involved in this pattern
   1. Client
   2. Invoker
   3. Command
   4. Receiver

   use case 1. TV Remote control  (you are a client, Remote control is invoker and TV is receuver. When you press a button on Tv remote, the invoker i.e TV remote generate a command and TV receives that command).
 */

public class Main{
    public static void main(String[] args) {
        AirConditioner airConditioner=new AirConditioner();
        RemoteController remoteController=new RemoteController();
        remoteController.setCommand(new TurnACOnCommand(airConditioner));
        remoteController.pressButton();
        
    }
}