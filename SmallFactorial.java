package gfg.school;
import java.util.Scanner;

public class SmallFactorial {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		int factorialNumber = factorial(number);
		System.out.println("The factorial of " + number + " is " + factorialNumber);
	}
	
	static int factorial(int number) {
		if(number > 1) {
			return number * factorial(number - 1);
		} 
		return 1;
	}

}
