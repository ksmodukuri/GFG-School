package gfg.school;
import java.util.Scanner;

public class ReplaceZeroWithFive {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		replaceZeroWithFive(number);
	}
	
	static void replaceZeroWithFive(int number) {
		int n = 0;
		int index = 0;
		while(number > 0) {
			int remainder = number % 10;
			number /= 10;
			if(remainder == 0) {
				remainder = 5;
			}
			n = (int) (n + (remainder * Math.pow(10, index)));
			index++;
		}
		System.out.println(n);
	}
 
}
