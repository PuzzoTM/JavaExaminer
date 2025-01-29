// Concepts Covered: if-else, for loop, while loop.
package firstcup;

public class ControlFlow {
    public static void main(String[] args) {
        int number = 10;

        // If-Else
        if (number > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative number or zero");
        }

        // For Loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("Loop iteration: " + i);
        }

        // While Loop
        int count = 3;
        while (count > 0) {
            System.out.println("Countdown: " + count);
            count--;
        }
    }
}
