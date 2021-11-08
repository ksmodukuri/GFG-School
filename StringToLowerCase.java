package gfg.school;
import java.util.Scanner;

public class StringToLowerCase {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		s.toUpperCase();
		StringBuffer sbf = new StringBuffer();
		for(int i = 0; i < s.length(); i++) {
			char ch = (char) ((char)s.charAt(i) + 32);
			System.out.println(ch);
			sbf.append(ch);
		}
		sc.close();
		
	}

}
