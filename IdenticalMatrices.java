package gfg.school;
import java.util.Scanner;

public class IdenticalMatrices {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[][] arr = new int[size][size];
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int count = 0;
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				if(arr[i][j] == sc.nextInt()) {
					count++;
				}
			}
		}
		sc.close();
		if(count != (size*size)) {
			System.out.println("0");
		} else {
			System.out.println("1");
		}
	}
}
