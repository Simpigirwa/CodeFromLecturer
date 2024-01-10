package uok2024.basicjava;


import java.util.Scanner;
public class QuestionSix {
	public static void main(String[] args) {
		// Create a Scanner object to read input from the user
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter an integer
		System.out.print("Enter an integer: ");

		// Read the entered integer from the user
		int number = scanner.nextInt();

		// Calculate and print the sum of the digits
		int sum = calculateSumOfDigits(number);
		System.out.println("The sum of the digits in " + number + " is: " + sum);

		// Close the Scanner to avoid resource leak
		scanner.close();
	}

	// Function to calculate the sum of the digits in an integer
	private static int calculateSumOfDigits(int num) {
		// Ensure a positive number
		num = Math.abs(num);

		int sum = 0;

		// Iterate through each digit
		while (num > 0) {
			sum += num % 10;  // Add the last digit to the sum
			num /= 10;        // Remove the last digit from the number
		}

		return sum;
	}
}



