import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n >= 1) {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is Even");
                } else {
                    System.out.println(i + " is Odd");
                }
            }
        } else {
            System.out.println("Not a natural number");
        }

        sc.close();
    }
}
