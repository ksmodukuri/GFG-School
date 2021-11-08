package gfg.school;
import java.util.Scanner;

public class AdditionOfTwoMatrices {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[][] arr = new int[size][size];
		int[][] arr2 = new int[size][size];
		for(int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		sc.close();
		addMatrices(arr, arr2, size);
	}
	
	static void addMatrices(int[][] arr, int[][] arr2, int size) {
		int[][] result = new int[size][size];
		for(int i = 0; i < size; i++) {
			int k = 0;
			for(int j = 0; j < size; j++) {
				result[i][k] = arr[i][j] + arr2[i][k];
				k++;
			}
		}
		
		for(int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
}
