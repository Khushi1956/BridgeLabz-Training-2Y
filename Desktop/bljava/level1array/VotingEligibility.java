import java.util.Scanner;
class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   // for taking input
        int[] ages = new int[10];              // array to store 10 ages

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();   // take input

            // check conditions
            if (ages[i] < 0) {
                System.out.println("Invalid age");
            } else if (ages[i] >= 18) {
                System.out.println("Age " + ages[i] + " can vote");
            } else {
                System.out.println("Age " + ages[i] + " cannot vote");
            }
        }
    }
}
