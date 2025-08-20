import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take distance in feet from user
        System.out.print("Enter distance in feet: ");
        double distanceFeet = input.nextDouble();

        // Convert feet to yards (1 yard = 3 feet)
        double distanceYards = distanceFeet / 3;

        // Convert yards to miles (1 mile = 1760 yards)
        double distanceMiles = distanceYards / 1760;

        // Display results
        System.out.println("The distance is " + distanceFeet + " feet, which is " + distanceYards + " yards and " + distanceMiles + " miles.");

        input.close();
    }
}
