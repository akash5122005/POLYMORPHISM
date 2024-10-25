import java.util.Scanner;
abstract class Payment {
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }
    public abstract void processPayment();
}
class CreditCardPayment extends Payment {
    private String cardNumber;
    public CreditCardPayment(String cardNumber, double amount) {
        super(amount);
        this.cardNumber = cardNumber;
    }
    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment of $" + amount + " using card number " + cardNumber);
    }
}
class PayPalPayment extends Payment {
    private String email;
    public PayPalPayment(String email, double amount) {
        super(amount);
        this.email = email;
    }
    @Override
    public void processPayment() {
        System.out.println("Processing PayPal payment of $" + amount + " using email " + email);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);;
        int numPayments = scanner.nextInt();
        scanner.nextLine();  
        Payment[] payments = new Payment[numPayments];
        for (int i = 0; i < numPayments; i++) {
            String paymentType = scanner.nextLine();
            if (paymentType.equalsIgnoreCase("CreditCard")) {
                String cardNumber = scanner.nextLine();
                double amount = scanner.nextDouble();
                scanner.nextLine();  
                payments[i] = new CreditCardPayment(cardNumber, amount);

            } else if (paymentType.equalsIgnoreCase("PayPal")) {
                String email = scanner.nextLine();
                double amount = scanner.nextDouble();
                scanner.nextLine();  
                payments[i] = new PayPalPayment(email, amount);
            } else {
                System.out.println("Invalid payment type. Skipping this payment.");
                i--;  
            }
        }
        for (Payment payment : payments) {
            payment.processPayment();
        }

        scanner.close();
    }
}
