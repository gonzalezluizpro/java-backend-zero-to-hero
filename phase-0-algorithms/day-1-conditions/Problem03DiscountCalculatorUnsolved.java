public class Problem03DiscountCalculatorUnsolved {

    public static void main(String[] args) {

        double price = 200;
        String userType = "PREMIUM";

        double finalPrice = applyDiscounts(price, userType);

        System.out.println("Original price: " + price);
        System.out.println("User type: " + userType);
        System.out.println("Final price: " + finalPrice);
    }

    // Orchestrator (only coordinates rules)
    static double applyDiscounts(double value, String userType) {
        value = applyUserTypeDiscount(value, userType);
        value = applyValueDiscount(value);
        return value;
    }

    // Rule 1: discount by user type
    static double applyUserTypeDiscount(double value, String userType) {
        switch (userType) {
            case "PREMIUM" -> value = value * 0.95;
            case "VIP" -> value = value * 0.90;
        }
        return value;
    }

    // Rule 2: discount by value
    static double applyValueDiscount(double value) {
        if (value > 150) {
            return value * 0.90;
        }
        return value;
    }
}
