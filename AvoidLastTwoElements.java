package gfg.school;

import java.util.Scanner;

// This has quick sort
public class AvoidLastTwoElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		sort(0, n, arr);
		for (int i = 0; i < n-2; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void sort(int low, int high, int[] arr) {
		int j = partition(low, high, arr);
		if (low < j) {
			sort(low, j, arr);
		}
		if (j < high && (j+1) < arr.length) {
			sort(j+1, high, arr);
		}
	}

	public static int partition(int low, int high, int[] arr) {
		int i = low;
		int j = high;
		int pivot = arr[low];
		while (i < j) {
			do {
				i++;
			} while (i < arr.length && arr[i] < pivot);

			do {
				j--;
			} while (j >= 0 && arr[j] > pivot);

			if (i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[low];
		arr[low] = arr[j];
		arr[j] = temp;
		return j;
	}

}
