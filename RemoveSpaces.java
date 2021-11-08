package gfg.school;
import java.util.Scanner;

public class RemoveSpaces {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		removeSpaces(s);
	}
	
	static void removeSpaces(String s) {
		StringBuffer sbf = new StringBuffer();
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != 32) {
				sbf.append(s.charAt(i));
			}
		}
		System.out.println(sbf);
	}

}
