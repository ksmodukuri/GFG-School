package gfg.school;
import java.util.Scanner;

public class ReverseDigits {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		reverseNumber(number);
		sc.close();
	}
	
	static void reverseNumber(int number) {
		int reverse = 0;
		while(number > 0) {
			int remainder = number % 10;
			number = number / 10;
			reverse = reverse * 10 + remainder;
		}
		System.out.println("reverse " + reverse);
	}

}
