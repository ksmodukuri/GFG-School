package gfg.school;
import java.util.Scanner;

public class CombinationLogic {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		sc.close();
		int result = not(a) * b + c * d + e * not(f);
		
		System.out.println("Result " + result);
	}
	
	static int not(int x) {
		if(x == 1) {
			return 0;
		}
		return 1;
	}

}
