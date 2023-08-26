/**
 * @ Nikunj Gupta 
 * This program is the main method for a program that asks a user for the size of an array
 * and then randomly generates the array. Then the program determines the
 * arrays minimum, maximum, minimumAt, maximumAt, average, find, shiftLeft, 
 * shiftRight and if the array equals another randomly generated array.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Unit11Lab {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // creates new Scanner

		System.out.print("Enter the size of the tested array: ");
		int size = input.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
		}

		System.out.println(Arrays.toString(arr));

		System.out.println("minimum: " + ArrayTools.min(arr));

		System.out.println("maximum: " + ArrayTools.max(arr));

		System.out.println("minimumAt: " + ArrayTools.minimumAt(arr));

		System.out.println("maximumAt: " + ArrayTools.maximumAt(arr));

		System.out.println("average: " + ArrayTools.average(arr));

		System.out.print("What number would you like to find? ");
		int find = input.nextInt();
		System.out.println("find " + find + ": " + ArrayTools.find(find, arr));

		int[] left = ArrayTools.shiftLeft(arr);
		System.out.println("after shiftLeft " + Arrays.toString(left));

		int[] right = ArrayTools.shiftRight(arr);
		System.out.println("after shiftRight " + Arrays.toString(right));

		int[] arr2 = new int[size];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = (int) (Math.random() * 10 + 1);
		}
		System.out.print("equals to " + Arrays.toString(arr2) + ": " + Arrays.equals(arr, arr2));
		
	}
}
