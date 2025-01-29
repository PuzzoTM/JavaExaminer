// Simple lesson runner
package main;

import firstcup.HelloWorld;
import firstcup.Variables;
import firstcup.Operators;
import firstcup.ControlFlow;
import firstcup.Methods;
import java.util.Scanner;

public class LessonRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to First Cup of Java!");
        System.out.println("1. Hello World");
        System.out.println("2. Variables");
        System.out.println("3. Operators");
        System.out.println("4. Control Flow");
        System.out.println("5. Methods");
        System.out.print("Choose a lesson: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> HelloWorld.main(args);
            case 2 -> Variables.main(args);
            case 3 -> Operators.main(args);
            case 4 -> ControlFlow.main(args);
            case 5 -> Methods.main(args);
            default -> System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
