package gfg.school;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ReverseOfVowels {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		int i = 0;
		int j = s.length() - 1;
		StringBuffer sbf = new StringBuffer();
		StringBuffer sbf2 = new StringBuffer();
		List<Character> charList = new ArrayList<Character>();
		charList.add('a');
		charList.add('e');
		charList.add('i');
		charList.add('o');
		charList.add('u');
		while(i < s.length() && j >= 0 && i != j) {
			char fromStart = s.charAt(i);
			char fromEnd = s.charAt(j);
			if(!charList.contains(fromStart)) {
				sbf.append(fromStart);
				i++;
			} else if(charList.contains(fromStart)){
				if(charList.contains(fromEnd)) {
					sbf.append(fromEnd);
					sbf2.insert(0, fromStart);
					i++;
					j--;
					continue;
				}
			}
			if(!charList.contains(fromEnd)) {
				if(sbf2.isEmpty()) {
					sbf2.append(fromEnd);
				} else {
					sbf2.insert(0, fromEnd);
				}
				j--;
			} else if(charList.contains(fromEnd)){
				if(charList.contains(fromStart)) {
					sbf.append(fromEnd);
					sbf2.insert(0, fromStart);
					i++;
					j--;
				}
			}
		}
		sbf.append(s.charAt(i));
		sbf.append(sbf2);
	}

}
