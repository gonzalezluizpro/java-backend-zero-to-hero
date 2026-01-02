public class Problem03OddCounter {

    public static void main(String[] args) {
        int number = 1; // start at 1

        while (number <= 20) { // stop when reaching 20
            if (number % 2 != 0) { // odd check
                System.out.println(number);
            }
            number++; // increment
        }
    }
}
