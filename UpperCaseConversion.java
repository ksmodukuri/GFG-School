package gfg.school;
import java.util.Scanner;

public class UpperCaseConversion {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		convertCase(s);
	}
	
	static void convertCase(String s) {
		StringBuffer sbf = new StringBuffer();
		char previousChar = '0';
		for(int i = 0; i <  s.length(); i++) {
			char ch = s.charAt(i);
			if(i == 0) {
				ch = (char) (ch - 32);
			} else {
				if(previousChar == 32) {
					ch = (char) (ch - 32);
				}
			}
			sbf.append(ch);
			previousChar = ch;
		}
		System.out.println(sbf);
	}

}
