package gfg.school;

import java.util.Scanner;

public class SmallerAndLarger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		int[] res = checkSmallerLarger(arr, n, x);
		System.out.println(res[0] + " " + res[1]);
	}

	static int[] checkSmallerLarger(int[] arr, int n, int x) {
		if (arr[0] == arr[n - 1]) {
			if (x > arr[0]) {
				return new int[] { n, 0 };
			} else if (x == arr[0]) {
				return new int[] { n, n };
			} else {
				return new int[] { 0, n };
			}
		} else if (arr[0] > x) {
			return new int[] { 0, n };
		} else if (x > arr[n - 1]) {
			return new int[] { n, 0 };
		} else {
			int left = 0;
			int right = n;
			int mid = 0;
			int minusChange = 0;
			int plusChange = 0;
			boolean notFound = true;
			while (notFound) {
				System.out.println("Mid " + mid);
				if (arr[mid] == x) {
					if (mid - 1 >= 0 && arr[mid - 1] == x) {
						while (arr[mid - 1 - minusChange] == x) {
							minusChange++;
						}
					}
					if (mid + 1 < n && arr[mid + 1] == x) {
						while (arr[mid + 1 + plusChange] == x) {
							plusChange++;
						}
					}
					notFound = false;
				} else if (arr[mid] > x) {
					if (mid - 1 >= 0 && arr[mid - 1] < x) {
						notFound = false;
					} else if (mid != 0) {
						right = mid;
						mid = left + (right - left) / 2;
					} else {
						notFound = false;
					}
				} else {
					if (mid == (n - 1)) {
						notFound = false;
					} else {
						left = mid;
						mid = left + (right - left) / 2;
					}
				}
			}

			if (mid == n - 1 && arr[mid] > x) {
				return new int[] { mid, 1 };
			} else if (arr[mid] == x) {
				return new int[] { mid + 1 + plusChange, n - mid + minusChange };
			} else {
				return new int[] { mid, n - mid };
			}
		}
	}

}
