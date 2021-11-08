package gfg.school;
import java.util.*;

public class MinimumMaximumOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		findMaxAndMin(arr);
	}
	
	static void findMaxAndMin(int[] arr) {
		int min = 0;
		int max = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		System.out.println("Max " + max);
		System.out.println("Min " + min);
	}
	
}
