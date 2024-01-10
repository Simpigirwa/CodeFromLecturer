package uok2024.basicjava;
import java.util.Scanner;
public class QuestionSeven {

	public static void main(String[] args) {
		// Test with different input strings
		testStringReversal("Hello, Java!");
		testStringReversal("OpenAI GPT-3");
		testStringReversal("Palindrome");
	}

	// Function to reverse a given string
	private static String reverseString(String str) {
		return new StringBuilder(str).reverse().toString();
	}

	// Function to test string reversal and print the results
	private static void testStringReversal(String input) {
		String reversedString = reverseString(input);
		System.out.println("Original String: " + input);
		System.out.println("Reversed String: " + reversedString);
		System.out.println();
	}
}

