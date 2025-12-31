public class Problem03DiscountCalculatorSolved {

    public static void main(String[] args) {
        double price = 150;
        double finalPrice = DiscountCalculator.calculate(price);

        System.out.println("Original price: " + price);
        System.out.println("Final price with discount: " + finalPrice);
    }
}
class DiscountCalculator {
    public static double calculate(double price) {
        if (price > 100) {
            return price * 0.9; // 10% discount
        } else {
            return price; // no discount
        }
    }
}