package gfg.school;
import java.util.Scanner;

public class SumOfDiagonal {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[][] arr = new int[size][size];
		int totalDiag1 = 0;
		int totalDiag2 = 0;
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();
		int j = 0;
		for(int i = 0; i < size; i++) {
			totalDiag1 += arr[i][i];
			totalDiag2 += arr[j][size-1-j];
			j++;
		}
		
		int diff = totalDiag1 - totalDiag2;
		if(diff < 0) {
			diff *= -1;
		}
		System.out.println("Difference " + diff);
	}

}
