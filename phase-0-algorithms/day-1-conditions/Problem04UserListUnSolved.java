public class Problem04UserListUnSolved {
    // STATE (in-memory)
    static String[] users = new String[10];
    static int userCount = 0;

    public static void main(String[] args) {

        addUser("Alice");
        addUser("Bob");
        addUser("Charlie");

        listUsers();

        removeUser("Bob");

        listUsers();
    }

    // ADD
    static void addUser(String name) {
        if (userCount < users.length) {
            users[userCount] = name;
            userCount++;
        }
    }

    // LIST
    static void listUsers() {
        System.out.println("Users:");
        for (int i = 0; i < userCount; i++) {
            System.out.println("- " + users[i]);
        }
    }

    // REMOVE (intentionally naive)
    static void removeUser(String name) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].equals(name)) {
                users[i] = null; // 👈 problema proposital
                break;
            }
        }
    }
}
