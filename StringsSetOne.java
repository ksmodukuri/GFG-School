package gfg.school;
import java.util.Scanner;

public class StringsSetOne {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		sc.close();
		StringBuffer sbf = new StringBuffer();
		sbf.append(s1);
		sbf.append(s2);
		for(int i = sbf.length() - 1; i >= 0; i--) {
			System.out.print(sbf.charAt(i));
		}
		
	}

}
