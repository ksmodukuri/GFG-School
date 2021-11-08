package gfg.school;
import java.util.Scanner;

public class ValueEqualToIndex {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		valueEqualToIndex(arr, size);
	}
	
	static void valueEqualToIndex(int[] arr, int size) {
		for(int i = 0; i < size; i++) {
			if(i + 1 == arr[i]) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
