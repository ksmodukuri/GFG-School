package gfg.school;

import java.util.Scanner;

public class PerfectArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		int[] result = reverseArray(arr);
		boolean isPerfect = true;
		for(int i = 0; i < size; i++) {
			if(arr[i] != result[i]) {
				isPerfect = false;
			}
		}
		if(isPerfect) {
			System.out.println("The Array is perfect");
		} else {
			System.out.println("The Array is not perfect");
		}
	}
	
	static int[] reverseArray(int[] arr) {
		int[] result = new int[arr.length];
		int j = 0;
		for(int i = arr.length -1; i >= 0; i--) {
			result[j] = arr[i];
			j++;
		}
		return result;
	}

}
