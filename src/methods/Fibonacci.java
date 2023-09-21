package methods;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 50; // Change this value to determine how many Fibonacci numbers to generate

        // Initialize the first two Fibonacci numbers
        int first = 0;
        int second = 1;

        System.out.println("Fibonacci Series of " + n + " numbers:");

        // Print the first two numbers
        System.out.print(first + " " + second + " ");

        // Generate the Fibonacci series
        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
}
