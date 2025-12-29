public class Problem01AgeValidatorSolved {

    public static boolean isAllowed(int age) {
        return age >= 18;
    }

    public static void main(String[] args) {
        System.out.println(isAllowed(20)); // true
        System.out.println(isAllowed(15)); // false
    }
}
