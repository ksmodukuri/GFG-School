package gfg.school;
import java.util.Scanner;

public class SumOfOddAndEven {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		sumOfOddAndEven(n);
	}
	
	static void sumOfOddAndEven(int n) {
		int oddSum = 0;
		int evenSum = 0;
		for(int i = 1; i <= n; i++) {
			if(i % 2 == 0) {
				oddSum += i;
			} else {
				evenSum += i;
			}
		}
		System.out.println(oddSum + " " + evenSum);
	}

}
