package gfg.school;
import java.util.Scanner;

public class LongestNames {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		String[] str = new String[size];
		for(int i = 0; i < size; i++) {
			str[i] = sc.next();
		}
		sc.close();
		int max = 0;
		int index = 0;
		for(int i = 0; i < size; i++) {
			if(max < str[i].length()) {
				max = str[i].length();
				index = i;
			}
		}
		System.out.println(str[index]);
	}

}
