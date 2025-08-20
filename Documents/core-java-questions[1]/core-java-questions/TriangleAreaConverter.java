import java.util.Scanner;

public class TriangleAreaConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take base and height in cm
        System.out.print("Enter base of the triangle (in cm): ");
        double baseCm = input.nextDouble();

        System.out.print("Enter height of the triangle (in cm): ");
        double heightCm = input.nextDouble();

        // Area in square centimeters
        double areaSqCm = 0.5 * baseCm * heightCm;

        // Convert to square inches (1 inch = 2.54 cm → 1 in² = (2.54)^2 cm²)
        double areaSqIn = areaSqCm / Math.pow(2.54, 2);

        // Display results
        System.out.println("The Area of the triangle in sq in is " + areaSqIn +
                           " and sq cm is " + areaSqCm);

        input.close();
    }
}
