import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take inputs for a, b, and c
        System.out.print("Enter value of a: ");
        int a = input.nextInt();

        System.out.print("Enter value of b: ");
        int b = input.nextInt();

        System.out.print("Enter value of c: ");
        int c = input.nextInt();

        // Perform operations (respecting operator precedence)
        int result1 = a + b * c;   // Multiplication before addition
        int result2 = a * b + c;   // Multiplication before addition
        int result3 = c + a / b;   // Division before addition
        int result4 = a % b + c;   // Modulus before addition

        // Display results
        System.out.println("The results of Int Operations are " 
                           + result1 + ", " + result2 + ", " 
                           + result3 + ", and " + result4);

        input.close();
    }
}
