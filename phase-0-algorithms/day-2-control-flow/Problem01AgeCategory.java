public class Problem01AgeCategory {

    public static String getAgeCategory(int age) {
        if (age < 0) {
            return "Invalid age";
        } else if (age < 13) {
            return "Child";
        } else if (age < 18) {
            return "Teenager";
        } else if (age < 65) {
            return "Adult";
        } else {
            return "Senior";
        }
    }

    public static void main(String[] args) {
        System.out.println(getAgeCategory(10)); // Child
        System.out.println(getAgeCategory(30)); // Adult
        System.out.println(getAgeCategory(70)); // Senior
    }
}

