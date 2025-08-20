import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take inputs for a, b, and c as doubles
        System.out.print("Enter value of a: ");
        double a = input.nextDouble();

        System.out.print("Enter value of b: ");
        double b = input.nextDouble();

        System.out.print("Enter value of c: ");
        double c = input.nextDouble();

        // Perform operations (respecting operator precedence)
        double result1 = a + b * c;   // Multiplication before addition
        double result2 = a * b + c;   // Multiplication before addition
        double result3 = c + a / b;   // Division before addition
        double result4 = a % b + c;   // Modulus before addition

        // Display results
        System.out.println("The results of Double Operations are " 
                           + result1 + ", " + result2 + ", " 
                           + result3 + ", and " + result4);

        input.close();
    }
}
