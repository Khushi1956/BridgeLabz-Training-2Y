import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[10];  // Array of max size 10
        double total = 0.0;
        int index = 0;

        // Infinite loop
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = sc.nextDouble();

            // Break conditions
            if (num <= 0 || index == 10) {
                break;
            }

            // Store number in array
            numbers[index] = num;
            index++;
        }

        // Display all numbers
        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            total += numbers[i];  // Add to total
        }

        System.out.println("\nSum of numbers = " + total);

        sc.close();
    }
}
