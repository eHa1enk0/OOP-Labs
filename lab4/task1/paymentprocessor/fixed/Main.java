package lab4.task1.paymentprocessor.fixed;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        DiscountStrategy premiumDiscount = new PremiumDiscountStrategy();
        double discount = paymentProcessor.calculateDiscount(premiumDiscount, 1000);
        System.out.println("Discount: " + discount);
    }
}
