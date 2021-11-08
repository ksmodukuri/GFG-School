package gfg.school;
import java.util.Scanner;

public class CheckStringForSameCharacters {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		checkString(s);
	}
	
	static void checkString(String s) {
		char prevChar = s.charAt(0);
		boolean allFine = true;
		for(int i = 0; i < s.length(); i++) {
			if(prevChar != s.charAt(i)) {
				allFine = false;
				break;
			};
			prevChar = s.charAt(i);
		}
		if(allFine) {
			System.out.println("String is correct");
		} else {
			System.out.println("String is not correct");
		}
	}

}
