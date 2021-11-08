package gfg.school;
import java.util.Scanner;

public class RemoveCharactersFromString {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		removeCharacters(s);
	}
	
	static void removeCharacters(String s) {
		StringBuffer sbf = new StringBuffer();
		for(int i = 0; i < s.length(); i++) {
			if(!((s.charAt(i) >=65 && s.charAt(i) <= 90) || (s.charAt(i) >= 97 && s.charAt(i) <= 122))) {
				sbf.append(s.charAt(i));
			}
		}
		System.out.println("After removal of characters " + sbf);
	}

}
