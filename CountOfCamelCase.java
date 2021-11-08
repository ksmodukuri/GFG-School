package gfg.school;
import java.util.Scanner;

public class CountOfCamelCase {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) >= 65 && s.charAt(i) <= 90) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
