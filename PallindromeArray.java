package gfg.school;
import java.util.Scanner;

public class PallindromeArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[][] arr = new int[size][size];
		boolean isPallindrome = true;
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				arr[i][j] = sc.nextInt();
			}
			isPallindrome = isPallindrome && checkArrayForPallindrome(arr[i], size);
		}
		sc.close();
		if(isPallindrome) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
	
	static boolean checkArrayForPallindrome(int[] arr, int size) {
		boolean isPallindrome = true;
		int i = 0;
		int j = size - 1;
		while(i != j) {
			if(arr[i] == arr[j]) {
				isPallindrome = true;
			} else {
				isPallindrome = false;
				break;
			}
			i++;
			j--;
		}
		return isPallindrome;
	}

}
