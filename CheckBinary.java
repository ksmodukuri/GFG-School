package gfg.school;
import java.util.Scanner;

public class CheckBinary {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		checkBinary(s);
	}
	
	static void checkBinary(String s) {
		boolean binaryFound = true;
		int i = 0;
		int j = s.length() - 1;
		while(i != j && i < s.length() && j >= 0) {
			char fromStart = s.charAt(i);
			char fromEnd = s.charAt(j);
			if(fromStart != '0' && fromStart != '1') {
				binaryFound = false;
				break;
			}
			if(fromEnd != '0' && fromEnd != '1') {
				binaryFound = false;
				break;
			}
			i++;
			j--;
		}
		if(i == j && (s.charAt(i) != '0' && s.charAt(i) != '1')) {
			binaryFound = false;
		}
		if(binaryFound) {
			System.out.println("Binary");
		} else {
			System.out.println("Not Binary");
		}
	}

}
