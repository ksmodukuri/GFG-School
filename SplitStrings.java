package gfg.school;
import java.util.Scanner;

public class SplitStrings {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		splitStrings(s);
	}
	
	static void splitStrings(String s) {
		StringBuffer characterString = new StringBuffer();
		StringBuffer numberString = new StringBuffer();
		StringBuffer specialString = new StringBuffer();
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if((ch >= 65 && ch <= 91) || (ch >= 97 && ch <= 112)) {
				characterString.append(ch);
			} else if(ch >= 48 && ch <= 57) {
				numberString.append(ch);
			} else {
				specialString.append(ch);
			}
		}
		System.out.println(characterString);
		System.out.println(numberString);
		System.out.println(specialString);
	}

}
