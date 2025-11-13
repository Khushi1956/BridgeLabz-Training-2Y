interface VehicleDashboard {
    void displaySpeed();

    default void displayBattery() {
        System.out.println("Battery: 85%");
    }
}

class ElectricCar implements VehicleDashboard {
    public void displaySpeed() { System.out.println("Speed: 60 km/h"); }
}

public class Dashboard {
    public static void main(String[] args) {
        ElectricCar car = new ElectricCar();
        car.displaySpeed();
        car.displayBattery();
    }
}
