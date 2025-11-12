import java.util.*;

public class UserInputValidation {
    public static boolean isValidAge(String ageInput) {
        try {
            int age = Integer.parseInt(ageInput);
            return age >= 18;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        String input = sc.nextLine();

        if (isValidAge(input))
            System.out.println("✅ Age valid. Signup successful!");
        else
            System.out.println("❌ Invalid age or below 18. Try again.");
    }
}
