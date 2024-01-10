package uok2024.basicjava;

import java.util.Scanner;

public class QuestionFive {

	public static void main(String[] args) {
		// Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of terms for the Fibonacci sequence
        System.out.print("Enter the number of terms for the Fibonacci sequence: ");

        // Read the entered number of terms from the user
        int numTerms = scanner.nextInt();

        // Generate and print the Fibonacci sequence
        printFibonacciSequence(numTerms);

        // Close the Scanner to avoid resource leak
        scanner.close();
    }

    // Function to generate and print the Fibonacci sequence
    private static void printFibonacciSequence(int numTerms) {
        int firstTerm = 0, secondTerm = 1;

        System.out.println("Fibonacci Sequence up to " + numTerms + " terms:");

        for (int i = 0; i < numTerms; i++) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        System.out.println();
    }

	}


