public class Problem01AgeValidatorUnsolved {
    public static void checkAge (int age) {
        if (age < 0) {
            System.out.println("Invalid age");
        } else if (age >= 65) {
            System.out.println("Senior user");
        } else if (age >= 18) {
            System.out.println("Adult user");
        } else {
            System.out.println("Minor user");
        }
    }

    public static void main(String[] args) {
        checkAge(-5); 
        checkAge(0); 
        checkAge(30);
        checkAge(65);
        checkAge(80); 
    }
}

