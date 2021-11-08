package gfg.school;
import java.util.Scanner;

public class DeletionOfCharaters {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		for(int i = 0; i < s.length(); i++) {
			if(i % 2 == 0)
			System.out.print(s.charAt(i) + " ");
			
		}
	}

}
