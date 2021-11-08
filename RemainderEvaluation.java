package gfg.school;
import java.util.Scanner;

public class RemainderEvaluation {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int remainder = number1 % number2;
		System.out.print("Remainder " + remainder);
		
		sc.close();
		
	}

}
