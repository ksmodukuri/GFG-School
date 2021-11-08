package gfg.school;
import java.util.Scanner;

public class CirclesTouchEachOther {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int r1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int r2 = sc.nextInt();
		sc.close();
		distanceBtwPoints(x1, y1, r1, x2, y2, r2);
		
	}
	
	static void distanceBtwPoints(int x1, int y1, int r1, int x2, int y2, int r2) {
		int differenceX = x2 - x1;
		int differenceY = y2 - y1;
		int distance = (int) Math.sqrt((Math.pow(differenceX, 2) + Math.pow(differenceY, 2)));
		if(distance <= r1 + r2) {
			System.out.println("Circles touch each other");
		} else {
			System.out.println("Circles donot touch each other");
		}
	}

}
