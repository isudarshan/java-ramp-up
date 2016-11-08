/**
 * 
 */
package org.isudarshan.code;

/**
 * @author Sudarsan 
 * METHOD (Use sum formula) Algorithm:
 * 
 *         1. Get the sum of numbers total = n*(n+1)/2 2 Subtract all the
 *         numbers from sum and you will get the missing number.
 *         
 *         http://www.geeksforgeeks.org/data-structures/
 */
public class MissingNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] x = {1, 2, 4, 6, 3, 7, 8 };
		System.out.println(getMissingNumber(x));
	}

	public static int getMissingNumber(int[] x) {
		int n = x.length + 1;
		int sum = ((n * n) + n) / 2;
		for (int i = 0; i < x.length; i++) {
			sum = sum - x[i];
		}
		return sum;

	}

}
