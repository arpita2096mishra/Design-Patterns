public class Main {
    public static void main(String[] args) {
        VehicleFactory vf=new VehicleFactory();
        Vehicle car=vf.getVehicle("car");
        Vehicle nh=vf.getVehicle("bike");
        getVehicleDetails(car);
        getVehicleDetails(nh);

    }
    public static void getVehicleDetails(Vehicle vehicle) {
        System.out.println("tank capacity:"+ vehicle.getTankCapacity());
        System.out.println("seating capacity:"+vehicle.getSeatingCapacity());
    }
}
