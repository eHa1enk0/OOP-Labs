package lab4.task1.paymentprocessor.fixed;

public class PremiumDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.10;
    }
}
