import java.util.*;

public class FleetManagerDemo {
    static class Vehicle { String id; Vehicle(String id){this.id=id;} public String toString(){return id;} }
    static class Truck extends Vehicle { Truck(String id){super(id);} }
    static class Bike extends Vehicle { Bike(String id){super(id);} }

    public static class FleetManager<T extends Vehicle> {
        private final List<T> fleet = new ArrayList<>();
        public void addVehicle(T v) { fleet.add(v); }
        public void showFleet() {
            System.out.println("Fleet list:");
            for (T v : fleet) System.out.println(" - " + v);
        }
    }

    public static void main(String[] args) {
        FleetManager<Truck> truckManager = new FleetManager<>();
        truckManager.addVehicle(new Truck("TR-001"));
        truckManager.addVehicle(new Truck("TR-002"));

        FleetManager<Bike> bikeManager = new FleetManager<>();
        bikeManager.addVehicle(new Bike("BK-101"));
        bikeManager.addVehicle(new Bike("BK-102"));

        System.out.println("Trucks:");
        truckManager.showFleet();
        System.out.println("Bikes:");
        bikeManager.showFleet();
    }
}
