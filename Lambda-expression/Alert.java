import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Alert {
    String type;
    Alert(String type) { this.type = type; }
    public String toString() { return "Alert: " + type; }
}

public class HospitalApp {
    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
            new Alert("Emergency"),
            new Alert("Medication"),
            new Alert("Appointment"),
            new Alert("Billing")
        );

        // Show only medical alerts
        Predicate<Alert> medicalOnly = a -> a.type.equals("Emergency") || a.type.equals("Medication");

        List<Alert> filtered = alerts.stream().filter(medicalOnly).collect(Collectors.toList());
        filtered.forEach(System.out::println);
    }
}
