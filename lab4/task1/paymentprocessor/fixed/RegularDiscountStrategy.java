package lab4.task1.paymentprocessor.fixed;

public class RegularDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.05;
    }
}
