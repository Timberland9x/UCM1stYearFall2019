
public class MinMaxReverse {

	public static void main(String[] args) {
		int[] arr = {1, 2, -3000, 4, 5, -100, 3, 50000, 700, 2, 4, 6, 8000};
		int[] rev_arr = new int [arr.length];

		int min = Integer.MAX_VALUE, minIndex = 0;
		int max = Integer.MIN_VALUE, maxIndex = 0;

		for (int i = 0; i < arr.length; i++) {
			/* Fill in your code here to find min/max
			 * There's only one loop needed
			 */	
		}

		System.out.println("Min number is " + min + " found at index " + minIndex);
		System.out.println("Max number is " + max + " found at index " + maxIndex);

		for (int i = 0; i < arr.length; i++) {
			/* Fill in your code here 
			 * To reverse the arr into rev_arr
			 */	
		}

		// Printing out the results
		System.out.println("\nPrinting out contents of both arrays in opposite order...");
		for (int i = arr.length; i > 0; i--) {
			System.out.print("arr[" + (arr.length-i) + "]=" + arr[arr.length-i]);
			System.out.println("\tis the same as \trev_arr[" + (i-1) + "]=" + rev_arr[i-1]);
		}

	}

}
