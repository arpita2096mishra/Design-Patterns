public class VehicleFactory {
    public Vehicle getVehicle(String vehicle){
        if(vehicle.equalsIgnoreCase("Car")){
            return new Car();
        }
        return new NullVehicle();
    }
}
