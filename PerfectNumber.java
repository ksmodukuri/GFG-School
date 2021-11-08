package gfg.school;
import java.util.Scanner;


public class PerfectNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		isPerfectNumber(number);
	}
	
	static void isPerfectNumber(int n) {
		int temp = n;
		int result = 0;
		while(n != 0) {
			int remainder = n % 10;
			int fact = calculateFactorial(remainder);
			n = n / 10;
			result += fact;
		}
		if(result == temp) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
	
	static int calculateFactorial(int n) {
		if(n == 1) {
			return 1;
		}
		
		return n * calculateFactorial(n-1);
	}

}
