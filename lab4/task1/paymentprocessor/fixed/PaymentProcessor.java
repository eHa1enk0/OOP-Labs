package lab4.task1.paymentprocessor.fixed;

public class PaymentProcessor {
    public double calculateDiscount(DiscountStrategy discountStrategy, double amount) {
        return discountStrategy.applyDiscount(amount);
    }
}
