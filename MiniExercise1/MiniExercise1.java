import java.util.Scanner;
import java.util.Random;

public class MiniExercise1 {
    // Main method, entry point for the program.
    public static void main(String[] args) {
        Task1();
        Task2();
    }

    // Task1 static method.
    public static void Task1() {
        // Create a new Scanner instance to read user input.
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of elements they want to create.
        System.out.println("How many elements would you like to create?");
        int count = scanner.nextInt();

        // Create an array with the user-defined number of elements.
        Object[] arr = new Object[count];

        // Loop over the array to get user input and perform type conversion.
        for (int i = 0; i < count; i++) {
            System.out.println("Enter value for element " + (i + 1) + ":");
            double val = scanner.nextDouble();

            // Depending on the user input, convert to Boolean, Byte, Short or Integer.
            if (val == 0 || val == 1) {
                arr[i] = val == 1;
                System.out.println("Will convert to Boolean...");
            } else if (val >= Byte.MIN_VALUE && val <= Byte.MAX_VALUE) {
                arr[i] = (byte) val;
                System.out.println("Will convert to Byte...");
            } else if (val >= Short.MIN_VALUE && val <= Short.MAX_VALUE) {
                arr[i] = (short) val;
                System.out.println("Will convert to Short...");
            } else {
                arr[i] = (int) val;
                System.out.println("Will convert to Int...");
            }
        }

        // Print out the resulting array.
        for (int i = 0; i < count; i++) {
            System.out.println("Element " + (i + 1) + " is: " + arr[i]);
        }
    }

    // Task2 static method.
    public static void Task2() {
        // Create a new Scanner instance to read user input.
        Scanner scanner = new Scanner(System.in);
        // Create a new Random instance to generate random numbers.
        Random random = new Random();

        // Create a multiplication table in a 2D array.
        int[][] table = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }

        // Ask the user for the number of questions they want to answer.
        System.out.println("How many questions would you like to answer?");
        int numQuestions = scanner.nextInt();

        int correctAnswers = 0;

        // Loop over the number of questions.
        for (int k = 0; k < numQuestions; k++) {
            // Generate random indices for the question.
            int i = random.nextInt(10);
            int j = random.nextInt(10);

            // Ask the user the multiplication question.
            System.out.println("What is " + (i + 1) + " x " + (j + 1) + "?");
            int answer = scanner.nextInt();

            // Check the user's answer and respond accordingly.
            if (answer == table[i][j]) {
                System.out.println("Congrats, your answer is correct!");
                correctAnswers++;
            } else {
                System.out.println("Your answer is incorrect. The correct answer is " + table[i][j]);
            }
        }

        // Calculate the percentage of correct answers.
        double percentage = ((double) correctAnswers / numQuestions) * 100;

        // Display the result summary.
        System.out.printf("You answered %d out of %d. That's a percentage of %.0f%%\n", correctAnswers, numQuestions, percentage);
    }
}