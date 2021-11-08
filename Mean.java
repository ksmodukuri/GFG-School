package gfg.school;
import java.util.Scanner;

public class Mean {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int total = 0;
		for (int i = 0; i < length; i++) {
			total += sc.nextInt();
		}
		sc.close();
		int mean = total / length;
		System.out.println(mean);
		
	}

}
