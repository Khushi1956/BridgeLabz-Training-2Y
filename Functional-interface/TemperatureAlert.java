import java.util.function.Predicate;

public class TemperatureAlert {
    public static void main(String[] args) {
        Predicate<Double> isHigh = temp -> temp > 38.0;
        double current = 39.5;
        if (isHigh.test(current))
            System.out.println("Alert! High temperature: " + current);
    }
}
