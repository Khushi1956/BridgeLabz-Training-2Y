import java.util.Scanner;

public class KmToMiles2 {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Declare variable
        double km;

        // Take input from user
        System.out.print("Enter distance in kilometers: ");
        km = input.nextDouble();

        // Convert km to miles (1 mile = 1.6 km)
        double miles = km / 1.6;

        // Display output
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");

        // Close scanner
        input.close();
    }
}
