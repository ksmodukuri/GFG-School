package gfg.school;
import java.util.Scanner;

public class AutomorphicNumber {
	
	/**
	 * Automorphic number example 76.
	 * 76 * 76 = 5776.
	 * 
	 * 5776 ends with 76.
	 * 
	 *
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
		automorphic(x);
	}
	
	static void automorphic(int x) {
		int square = x * x;
		int i = 0;
		int result = 0;
		while(i < 2) {
			int remainder = square % 10;
			square = square / 10;
			result = (int) (result + remainder * Math.pow(10, i));
			i++;
		}
		if(result == x) {
			System.out.println("Automorphic");
		} else {
			System.out.println("Not Automorphic");
		}
	}

}
