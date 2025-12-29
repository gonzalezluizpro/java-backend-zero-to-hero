import java.util.Scanner;

public class Problem02MenuSolved {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("1 - Create user");
            System.out.println("2 - Exit");
            option = scanner.nextInt();

            if (option == 1) {
                System.out.println("User created");
            }

        } while (option != 2);

        scanner.close();
    }
}
