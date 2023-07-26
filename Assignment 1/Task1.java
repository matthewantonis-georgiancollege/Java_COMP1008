import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.println("Enter a first number:");
        int num1 = input.nextInt();

        // Prompt the user to enter the second number
        System.out.println("Enter a second number:");
        int num2 = input.nextInt();

        // Prompt the user to enter an arithmetic operator
        System.out.println("Enter an arithmetic operator ( +, -, *, /) :");
        String operator = input.next();

        // Initialize the result variable
        int result = 0;

        // Perform the operation based on the entered operator
        if (operator.equals("+")) {
            result = num1 + num2;  // Perform addition if '+' is entered
        } else if (operator.equals("-")) {
            result = num1 - num2;  // Perform subtraction if '-' is entered
        } else if (operator.equals("*")) {
            result = num1 * num2;  // Perform multiplication if '*' is entered
        } else if (operator.equals("/")) {
            result = num1 / num2;  // Perform division if '/' is entered
        }

        // Print the result of the operation
        System.out.printf("Result of: %d %s %d = %d%n", num1, operator, num2, result);
    }
}
