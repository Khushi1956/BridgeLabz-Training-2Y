import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take base and height in inches
        System.out.print("Enter base of the triangle (in inches): ");
        double baseInches = input.nextDouble();

        System.out.print("Enter height of the triangle (in inches): ");
        double heightInches = input.nextDouble();

        // Area in square inches
        double areaSqInches = 0.5 * baseInches * heightInches;

        // Convert to square centimeters (1 inch = 2.54 cm → 1 in² = (2.54)² cm²)
        double areaSqCm = areaSqInches * Math.pow(2.54, 2);

        // Display results
        System.out.println("The area of the triangle is " + areaSqInches + " square inches and " + areaSqCm + " square centimeters.");

        input.close();
    }
}
