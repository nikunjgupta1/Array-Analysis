/**
 * @ Nikunj Gupta 
 * This class creates all the methods that will be used in the main method to analyze the random array.
 */

public class ArrayTools {

	/**
     * Returns the minimum element of the given array.
     *
     * Complexity: this method iterates over the entire array, hence it requires
     * time proportional to the size of the array.
     *
     * @data  array whose minimum element is to be determined.
     * @return the minimum element of the given array.
     * Precondition: data contains at least one element.
     */
	public static int min(int[] myNumbers) {
		int min = Integer.MAX_VALUE;
		for (int x : myNumbers) {
			if (x < min) {
				min = x;
			}
		}
		return min;
	}
	
	/**
     * Returns the maximum element of the given array.
     *
     * Complexity: this method iterates over the entire array, hence it requires
     * time proportional to the size of the array.
     *
     * @data  array whose maximum element is to be determined.
     * @return the maximum element of the given array.
     * Precondition: data contains at least one element.
     */
	public static int max(int[] numbers) {
		int max = Integer.MIN_VALUE;
		for (int x : numbers) {
			if (x > max) {
				max = x;
			}
		}
		return max;
	}

	/**
     * Returns the index of the minimum element of the given array.
     *
     * Complexity: this method iterates over the entire array, hence it requires
     * time proportional to the size of the array.
     *
     * @data  array whose index of the minimum element is to be determined.
     * @return the index of the minimum element of the given array.
     * Precondition: data contains at least one element.
     */
	public static int minimumAt(int[] numbers) {
		int index = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
				index = i;
			}
		}
		return index;
	}

	/**
     * Returns the index of the maximum element of the given array.
     *
     * Complexity: this method iterates over the entire array, hence it requires
     * time proportional to the size of the array.
     *
     * @data  array whose index of the maximum element is to be determined.
     * @return the index of the maximum element of the given array.
     * Precondition: data contains at least one element.
     */
	public static int maximumAt(int[] numbers) {
		int index = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
				index = i;
			}
		}
		return index;
	}

	/**
     * Returns the average value of the given array.
     *
     * Complexity: this method iterates over the entire array, hence it requires
     * time proportional to the size of the array.
     *
     * @data  array whose average is to be determined.
     * @return the average of the given array.
     * Precondition: data contains at least one element.
     */
	public static double average(int[] numbers) {
		double sum = 0;
		for (int x : numbers) {
			sum += x;
		}
		return sum / numbers.length;
	}

	/**
     * Returns the index of a user inputed number in the given array. Returns -1 if not in the array.
     *
     * Complexity: this method iterates over the entire array, hence it requires
     * time proportional to the size of the array.
     *
     * @data  the number of which the user wants to find the index of and array whose index of user number is to be determined.
     * @return the index of the user inputed number in the given array.
     * Precondition: data contains at least one element.
     */
	public static int find(int find, int[] numbers) {
		int index = -1;
		for (int i = 0; i < numbers.length; i++) {
			if (find == numbers[i]) {
				index = i;
			}
		}
		return index;
	}

	/**
     * Returns the array shifted one place to the left.
     *
     * Complexity: this method iterates over the entire array, hence it requires
     * time proportional to the size of the array.
     *
     * @data  array that is going to be shifted to the left.
     * @return the left shifted array.
     * Precondition: data contains at least one element.
     */
	public static int[] shiftLeft(int numbers[]) {
		int temp = numbers[0];
		for (int j = 0; j < numbers.length - 1; j++) {
			numbers[j] = numbers[j + 1];
		}
		numbers[numbers.length - 1] = temp;
		return numbers;
	}

	/**
     * Returns the array shifted one place to the right.
     *
     * Complexity: this method iterates over the entire array, hence it requires
     * time proportional to the size of the array.
     *
     * @data  array that is going to be shifted to the right.
     * @return the right shifted array.
     * Precondition: data contains at least one element.
     */
	public static int[] shiftRight(int numbers[]) {
		int temp = numbers[numbers.length - 1];
		for (int index = numbers.length - 2; index >= 0; index--) {
			numbers[index + 1] = numbers[index];
		}
		numbers[0] = temp;
		return numbers;
	}
}
