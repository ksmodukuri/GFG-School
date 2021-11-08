package gfg.school;
import java.util.Scanner;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		checkArmstrong(number);
	}
	
	static void checkArmstrong(int number) {
		int temp = number;
		int armStrong = 0;
		while(number > 0) {
			int remainder = number % 10;
			number  = number / 10;
			armStrong += remainder * remainder * remainder;
		}
		if(armStrong == temp) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
