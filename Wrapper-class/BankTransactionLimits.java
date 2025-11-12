public class BankTransactionLimits {

    public static double getRemainingLimit(Double limit) {
        if (limit == null)
            return 0.0; // Handle null safely
        return limit - 1000.0; // Assume 1000 withdrawn
    }

    public static void main(String[] args) {
        Double newAccLimit = 5000.0;
        Double oldAccLimit = null;

        System.out.println("Remaining for new account: " + getRemainingLimit(newAccLimit));
        System.out.println("Remaining for old account: " + getRemainingLimit(oldAccLimit));
    }
}
