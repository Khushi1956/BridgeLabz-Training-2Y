import java.util.Scanner;

public class ReverseStringSB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        sb.append(input);
        sb.reverse();

        System.out.println("Reversed string: " + sb.toString());
        sc.close();
    }
}
