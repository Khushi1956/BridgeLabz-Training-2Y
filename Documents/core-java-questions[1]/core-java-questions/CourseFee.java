public class CourseFee {
    public static void main(String[] args) {
        // Step 1: Declare variables
        double fee = 125000;
        double discountPercent = 10;

        // Step 2: Calculate discount amount
        double discount = (fee * discountPercent) / 100;

        // Step 3: Calculate final fee after discount
        double finalFee = fee - discount;

        // Step 4: Print results
        System.out.println("Discount amount: INR " + discount);
        System.out.println("Final fee to pay: INR " + finalFee);
    }
}
