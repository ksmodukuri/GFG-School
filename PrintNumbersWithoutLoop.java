package gfg.school;
import java.util.Scanner;

public class PrintNumbersWithoutLoop {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		printNumbers(number, 1);
	}
	
	public static void printNumbers(int size, int number) {
		if(number <= size) {
			System.out.print(number + " ");
			printNumbers(size, ++number);
		}
	}

}
