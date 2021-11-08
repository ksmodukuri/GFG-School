package gfg.school;
import java.util.Scanner;

public class SumOfAP {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int d = sc.nextInt();
		sc.close();
		sumOfAp(n, a, d);
	}
	
	static void sumOfAp(int n, int a, int d) {
		int sum = (n/2) * (2 * a + (n-1) * d);
		System.out.println("Sum of the AP " + sum);
	}

}
