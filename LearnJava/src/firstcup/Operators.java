//Concepts Covered: Arithmetic, relational, logical operators.
package firstcup;

public class Operators {
    public static void main(String[] args) {
        int a = 10, b = 5;

        // Arithmetic
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));

        // Relational
        System.out.println("a > b: " + (a > b));
        System.out.println("a == b: " + (a == b));

        // Logical
        boolean x = true, y = false;
        System.out.println("x AND y: " + (x && y));
        System.out.println("x OR y: " + (x || y));
    }
}
