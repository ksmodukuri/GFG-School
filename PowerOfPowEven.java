package gfg.school;
import java.util.*;

public class PowerOfPowEven {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int sum = 0;
		int limit = sc.nextInt();
		sc.close();
		for(int i = 0; i < limit; i++) {
			n = n + 2;
			sum += n * n;
		}
		System.out.println("Sum " + sum);
	}

}
