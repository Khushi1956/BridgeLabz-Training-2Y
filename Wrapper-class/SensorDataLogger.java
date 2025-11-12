import java.util.*;

public class SensorDataLogger {

    // Method to log data from both primitive and wrapper
    public static void logTemperature(Double temp) {
        System.out.println("Logged Temperature: " + temp + "°C");
    }

    public static void main(String[] args) {
        double primitiveTemp = 36.5; // primitive
        Double objectTemp = 38.2;    // wrapper

        // Auto-boxing and unboxing
        logTemperature(primitiveTemp); // auto-boxing
        logTemperature(objectTemp);    // direct

        System.out.println("Auto-boxing & unboxing works seamlessly!");
    }
}
