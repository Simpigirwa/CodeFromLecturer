package uok2024.basicjava;

import java.util.Scanner;

public class Questionthree {

	public static void main(String[] args) {
		// Create a Scanner object to read input from the user
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter a string
		System.out.print("Enter a string: ");

		// Read the entered string from the user
		String input = scanner.nextLine();

		// Check if the string is a palindrome
		if (isPalindrome(input)) {
			System.out.println("The string \"" + input + "\" is a palindrome.");
		} else {
			System.out.println("The string \"" + input + "\" is not a palindrome.");
		}

		// Close the Scanner to avoid resource leak
		scanner.close();
	}

	// Function to check if a string is a palindrome
	private static boolean isPalindrome(String str) {
		// Remove spaces and convert to lowercase
		str = str.replaceAll("\\s", "").toLowerCase();

		// Check if the string is the same when reversed
		String reversedStr = new StringBuilder(str).reverse().toString();
		return str.equals(reversedStr);
	}

}


