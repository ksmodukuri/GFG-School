package gfg.school;
import java.util.Scanner;

public class TwelveHourClockMultiplication {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		multiplyClocks(a, b);
	}
	
	static void multiplyClocks(int a, int b) {
		int result = a * b;
		if(result > 12) {
			result = result - 12;
		} 
		System.out.println("Time is " + result);
	}

}
