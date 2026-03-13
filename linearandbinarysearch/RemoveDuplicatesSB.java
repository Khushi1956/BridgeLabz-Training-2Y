import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicatesSB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        StringBuilder result = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        for (char ch : input.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                result.append(ch);
            }
        }

        System.out.println("String without duplicates: " + result.toString());
        sc.close();
    }
}
