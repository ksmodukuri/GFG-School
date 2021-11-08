package gfg.school;
import java.util.Scanner;

public class Pallindrome {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		checkPallindrome(number);
	}
	
	static void checkPallindrome(int number) {
		int temp = number;
		int pallindrome = 0;
		while(number > 0) {
			int remainder = number % 10;
			number /= 10;
			pallindrome = (pallindrome * 10) + remainder;
		}
		System.out.println("pallindrome " + pallindrome);
		if(pallindrome == temp) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
