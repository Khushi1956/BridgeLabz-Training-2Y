import java.util.*;
import java.util.stream.Collectors;

class Invoice {
    int txnId;
    Invoice(int id) { this.txnId = id; }
    public String toString() { return "Invoice #" + txnId; }
}

public class InvoiceGenerator {
    public static void main(String[] args) {
        List<Integer> txnIds = Arrays.asList(5001, 5002, 5003);

        // Constructor reference instead of lambda (id -> new Invoice(id))
        List<Invoice> invoices = txnIds.stream()
                                       .map(Invoice::new)
                                       .collect(Collectors.toList());

        invoices.forEach(System.out::println);
    }
}
