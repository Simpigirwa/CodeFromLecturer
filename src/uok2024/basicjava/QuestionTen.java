package uok2024.basicjava;
import java.util.Scanner;
public class QuestionTen {
	public static void main(String[] args) {
		// Create a Scanner object to read input from the user
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter the first number
		System.out.print("Enter the first number: ");
		double num1 = scanner.nextDouble();

		// Prompt the user to enter the operator
		System.out.print("Enter the operator (+, -, *, /): ");
		char operator = scanner.next().charAt(0);

		// Prompt the user to enter the second number
		System.out.print("Enter the second number: ");
		double num2 = scanner.nextDouble();

		// Calculate and display the result based on the operator
		double result = calculate(num1, operator, num2);
		System.out.println("Result: " + result);

		// Close the Scanner to avoid resource leak
		scanner.close();
	}

	// Function to perform the calculation based on the operator
	private static double calculate(double num1, char operator, double num2) {
		switch (operator) {
		case '+':
			return num1 + num2;
		case '-':
			return num1 - num2;
		case '*':
			return num1 * num2;
		case '/':
			if (num2 != 0) {
				return num1 / num2;
			} else {
				System.out.println("Error: Division by zero is not allowed.");
				System.exit(1); // Exit the program with an error code
			}
		default:
			System.out.println("Error: Invalid operator.");
			System.exit(1); // Exit the program with an error code
		}

		return 0; // This return statement is never reached, just for compilation
	}
}

