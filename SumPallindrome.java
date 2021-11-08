package gfg.school;

import java.util.Scanner;

public class SumPallindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		int total = sumOfDigits(number);
		checkPallindrome(total);
	}
	
	static void checkPallindrome(int number) {
		int reverse = 0;
		int temp = number;
		while (number > 0) {
			int remainder = number % 10;
			number = number / 10;
			reverse = reverse * 10 + remainder;
		}
		if(reverse == temp) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	} 

	static int sumOfDigits(int number) {
		int total = 0;
		while (number > 0) {
			int remainder = number % 10;
			number = number / 10;
			total += remainder;
		}
		return total;
	}

}
