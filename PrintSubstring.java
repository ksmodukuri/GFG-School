package gfg.school;
import java.util.Scanner;

public class PrintSubstring {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int l = sc.nextInt();
		int r = sc.nextInt();
		sc.close();
		for(int i = l; i <= r; i++) {
			System.out.print(s.charAt(i));
		}
	}

}
