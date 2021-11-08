package gfg.school;

import java.util.Scanner;

public class PowerOfPowOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 1;
		int sum = 0;
		int limit = sc.nextInt();
		sc.close();
		for(int i = 0; i < limit; i++) {
			sum += n * n;
			n = n + 2;
		}
		System.out.println("Sum " + sum);
	}
}
