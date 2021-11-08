package gfg.school;
import java.util.Scanner;

public class FloydsTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		int j = 1;
		int row = 1;
		for(int i = 1; i <= a; i++) {
			row = 1;
			while(row <= i) {
				System.out.print(j + " ");
				row++;
				j++;
			}
			System.out.print("\n");
		}
	}
}
