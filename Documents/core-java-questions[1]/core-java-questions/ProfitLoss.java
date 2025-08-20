public class ProfitLoss {
    public static void main(String[] args) {
        double costPrice = 129;
        double sellingPrice = 191;

        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit / costPrice) * 100;

        System.out.println(
            "Cost Price: INR " + costPrice + "\n" +
            "Selling Price: INR " + sellingPrice + "\n" +
            "Profit: INR " + profit + "\n" +
            "Profit Percentage: " + profitPercentage + "%"
        );
    }
}
