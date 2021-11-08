package gfg.school;
import java.util.Scanner;

public class MultiplyMatrices {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[][] arr = new int[size][size];  
		int[][] arr2 = new int[size][size]; 
		for(int i = 0; i < size; i++) {
			for(int j = 0; j <  size; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < size; i++) {
			for(int j = 0; j <  size; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		sc.close();
		multiplyMatrices(arr, arr2, size);
	}
	
	static void multiplyMatrices(int[][] arr, int[][] arr2, int size) {
		int[][] result = new int[size][size];
		int k = 0;
 		for(int i = 0; i < size; i++) {
 			int sum = 0;
 			k = 0;
 			System.out.println("i " + i);
			for(int j = 0; j < size; j++) {
				sum += arr[i][j] * arr2[j][k];
				if(j == size-1 && k != size-1) {
					j = -1;
					result[i][k] = sum;
					sum = 0;
					k++;
				} else if(j == size-1 && k == size -1) {
					result[i][k] = sum;
				}
			}
		}
 		
 		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.print("\n");
		}
 		
	}

}
