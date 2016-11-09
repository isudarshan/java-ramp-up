/**
 * 
 */
package org.isudarshan.code;

/**
 * @author Sudarsan 
 * 		1) Initialize start and end indexes. start = 0, end = n-1 2)
 *         In a loop, swap arr[start] with arr[end] and change start and end as
 *         follows. start = start +1; end = end – 1
 * 
 */
public class ReverseArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int x[] = { 3, 2, 9, 5, 10 };
		reverseArray(x, 0, 4);
		printArray(x);
	}

	public static void reverseArray(int[] x, int start, int end) {
		int temp;

		if (start >= end) {
			return;
		}

		temp = x[start];
		x[start] = x[end];
		x[end] = temp;

		reverseArray(x, start + 1, end - 1);
	}

	public static void printArray(int[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + "\t");
		}
	}

}
