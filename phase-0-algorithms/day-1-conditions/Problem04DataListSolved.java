public class Problem04DataListSolved {

    static String[] names = new String[5]; // static array to store names
    static int count = 0;                  // controller for the number of stored names

    public static void main(String[] args) {

        addName("Alice");
        addName("Bob");
        addName("Charlie");

        listNames();
    }

    // Adds a name to the list
    static void addName(String name) {
        if (count < names.length) {
            names[count] = name;
            count++;
        }
    }

    // Lists all stored names
    static void listNames() {
        System.out.println("Stored names:");
        for (int i = 0; i < count; i++) {
            System.out.println("- " + names[i]);
        }
    }
}
