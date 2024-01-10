package uok2024.basicjava;

import java.util.Scanner;

public class QuestionTwo {

	public static void main(String[] args) {
		// Create a Scanner object to read input from the user
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter an integer
		System.out.print("Enter an integer: ");

		// Read the entered integer from the user
		int number = scanner.nextInt();

		// Check if the number is odd or even
		if (number % 2 == 0) {
			System.out.println(number + " is an even number.");
		} else {
			System.out.println(number + " is an odd number.");
		}

		// Close the Scanner to avoid resource leak
		scanner.close();
	}

}
