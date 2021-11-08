package gfg.school;
import java.util.Scanner;

public class FindElementOfSeries {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pos = sc.nextInt();
		int element = pos * (pos + 1) / 2;
		System.out.println(element);
		sc.close();
	}

}
