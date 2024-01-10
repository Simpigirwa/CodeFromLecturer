package uok2024.basicjava;

public class QuestionNine {
	    public static void main(String[] args) {
	        // Initialize an array
	        int[] originalArray = {1, 2, 3, 4, 5};

	        // Double each element in the array
	        doubleArray(originalArray);

	        // Print the modified array
	        System.out.print("Modified Array: ");
	        for (int element : originalArray) {
	            System.out.print(element + " ");
	        }
	    }

	    // Function to double each element in the array
	    private static void doubleArray(int[] arr) {
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] *= 2;  // Double each element
	        }
	    }
	}

