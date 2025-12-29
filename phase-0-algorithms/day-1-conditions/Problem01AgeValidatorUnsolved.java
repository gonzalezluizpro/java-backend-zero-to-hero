public class Problem01AgeValidatorUnsolved {
    public static String classifyAge(int age) {
        if (age < 0) {
            return "Invalid age";
        } else if (age >= 65) {
            return "Senior user";
        } else if (age >= 18) {
            return "Adult user";
        } else {
            return "Minor user";
        }
    }

    public static void main(String[] args) {
        System.out.println(classifyAge(-5));
        System.out.println(classifyAge(0));
        System.out.println(classifyAge(30));
        System.out.println(classifyAge(65));
        System.out.println(classifyAge(80));
    }
}

