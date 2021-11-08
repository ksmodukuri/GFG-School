package gfg.school;
import java.util.Scanner;

public class FindMedian {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		int[] result = MergeSort.mergeSort(arr);
		int median = result.length / 2;
		System.out.println("Median " + result[median]);
		
	}

}
