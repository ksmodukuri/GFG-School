package gfg.school;
import java.util.Scanner;

public class APSeries {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int second = sc.nextInt();
		int nth = sc.nextInt();
		sc.close();
		
		int d = second - first;
		
		int element = first + (nth - 1) * d;
		System.out.println(nth + "th element is " + element);
	}

}
