package gfg.school;

import java.util.Scanner;

public class CubeRoot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		sc.close();
		int result = 0;
		try {
			if (x == 0) {
				System.out.println("Cube root " + 0);
			} else {
				result = cubeRoot(0, x, x);
			}
		} catch (Exception e) {
			System.out.println("Perfect Cube root doesn't exists");
		}
		if (result == 0) {
			System.out.println("Perfect Cube root doesn't exists");
		} else {
			System.out.println("Cube root " + result);
		}
	}

	static int cubeRoot(int left, int right, int x) {
		int mid = (left + right) / 2;
		if ((left - right) == 1) {
			return 0;
		} else if ((right - left) == 1) {
			return 0;
		}
		if (mid * mid * mid == x) {
			return mid;
		} else if (mid * mid * mid < x) {
			left = mid;
		} else {
			right = mid;
		}
		return cubeRoot(left, right, x);
	}

}
