//Concepts Covered: Defining and calling methods, parameters, return values.
package firstcup;

public class Methods {
    // Method with return type
    public static int add(int a, int b) {
        return a + b;
    }

    // Method without return type
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        System.out.println("Sum: " + add(5, 3));
        greet("Student");
    }
}
