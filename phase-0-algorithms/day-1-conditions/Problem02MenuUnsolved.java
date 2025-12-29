import java.util.Scanner;

public class Problem02MenuUnsolved {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] users = new String[10];
        int userCount = 0;
        int option = 0;

        do {
            showMenu();

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid option. Please enter a number.");
                scanner.next();
                continue;
            }

            option = scanner.nextInt();

            if (option == 1) {
                users[userCount] = "User " + (userCount + 1);
                userCount++;
                System.out.println("User created");
            } 
            else if (option == 2) {
                listUsers(users, userCount);
            }

        } while (option != 3);

        scanner.close();
    }

    // Methods to show menu and list users
    public static void showMenu() {
        System.out.println("1 - Create user");
        System.out.println("2 - List users");
        System.out.println("3 - Exit");
    }

    public static void listUsers(String[] users, int count) {
        if (count == 0) {
            System.out.println("No users found.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println(users[i]);
        }
    }
}
