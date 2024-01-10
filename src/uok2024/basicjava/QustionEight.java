package uok2024.basicjava;
import java.util.Scanner;
public class QustionEight {
	public static void main(String[] args) {
		// Create a Scanner object to read input from the user
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter a number
		System.out.print("Enter a number: ");

		// Read the entered number from the user
		int number = scanner.nextInt();

		// Check if the number is prime and print the result
		if (isPrime(number)) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is not a prime number.");
		}

		// Close the Scanner to avoid resource leak
		scanner.close();
	}

	// Function to check whether a given number is prime
	private static boolean isPrime(int num) {
		if (num <= 1) {
			return false;  // 0 and 1 are not prime numbers
		}

		// Check for divisibility from 2 to the square root of the number
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;  // The number is divisible by i, so it's not prime
			}
		}

		return true;  // The number is prime
	}
}

