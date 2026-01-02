public class Problem02PasswordChecker {

    public static void main(String[] args) {
        final String correctPassword = "java123";
        String attempt = "";
        int attempts = 0;

        do {
            // Simulate attempts (in real life this would come from Scanner)
            if (attempts == 0) {
                attempt = "wrong1";
            } else if (attempts == 1) {
                attempt = "wrong2";
            } else {
                attempt = "java123";
            }

            System.out.println("Attempt " + (attempts + 1) + ": " + attempt);

            attempts++;

            if (attempt.equals(correctPassword)) {
                System.out.println("Access granted");
                break;
            }

        } while (!attempt.equals(correctPassword) && attempts < 3);

        if (!attempt.equals(correctPassword)) {
            System.out.println("Account locked");
        }
    }
}
