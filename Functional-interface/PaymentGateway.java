interface PaymentProcessor {
    void pay(double amount);

    default void refund(double amount) {
        System.out.println("Default refund of ₹" + amount);
    }
}

class Paytm implements PaymentProcessor {
    public void pay(double amount) { System.out.println("Paid ₹" + amount + " via Paytm."); }
}

public class PaymentGateway {
    public static void main(String[] args) {
        Paytm p = new Paytm();
        p.pay(500);
        p.refund(100);
    }
}
