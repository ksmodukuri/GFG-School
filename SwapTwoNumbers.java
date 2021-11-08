package gfg.school;
import java.util.Scanner;

public class SwapTwoNumbers {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		swap(a, b);
		sc.close();
		
	}
	
	static void swap(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a " + a);
		System.out.println("b " + b);
	}

}
