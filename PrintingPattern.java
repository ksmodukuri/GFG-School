package gfg.school;
import java.util.Scanner;

public class PrintingPattern {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}
	
	static void printPattern(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = n; j > 0; j--) {
				int x = j;
				for(int k = 0; k < (n-i); k++) {
					System.out.print(x + " ");
				}
			}
			System.out.print("$");
		}
	}

}
