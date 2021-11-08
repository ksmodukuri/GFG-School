package gfg.school;
import java.util.Scanner;

public class NumberOfDiagonalsOfConvexPolygon {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
		numberOfDiagonals(x);
	}
	
	static void numberOfDiagonals(int x) {
		int number = x * (x-3) / 2;
		System.out.println("Number of diagonals " + number);
	}

}
