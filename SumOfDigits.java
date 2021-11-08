package gfg.school;
import java.util.Scanner;

public class SumOfDigits {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int total = 0;
		while(x != 0) {
			int remainder = x % 10;
			x = x / 10;
			total += remainder;
		}
		System.out.println("the sum of the digits is " + total);
		sc.close();
	}

}
