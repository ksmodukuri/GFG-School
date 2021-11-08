package gfg.school;
import java.util.Scanner;

public class EvenOddSum {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int oddSum = 0;
		int evenSum = 0;
		for(int i = 0; i < size; i++) {
			if(i % 2 == 0) {
				evenSum += sc.nextInt();
			} else {
				oddSum += sc.nextInt();
			}
		}
		sc.close();
		System.out.println("Odd Sum " + oddSum);
		System.out.println("Even Sum " + evenSum);
	}

}
