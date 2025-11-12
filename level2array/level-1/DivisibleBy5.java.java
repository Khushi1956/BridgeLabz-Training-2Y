import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            // Check divisibility
            if (number % 5 == 0) {
                System.out.println("Is the number " + number + " divisible by 5? Yes");
            } else {
                System.out.println("Is the number " + number + " divisible by 5? No");
            }
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter an integer number.");
        }

        sc.close();
    }
}
