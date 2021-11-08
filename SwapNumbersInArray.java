package gfg.school;

import java.util.Scanner;

public class SwapNumbersInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int place = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		swapNumbers(arr, place);
	}

	static void swapNumbers(int[] arr, int place) {
		int a = arr[place-1];
		int b = arr[arr.length - place];
		a = a + b;
		b = a - b;
		a = a - b;
		arr[place-1] = a;
		arr[arr.length - place] = b;
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
