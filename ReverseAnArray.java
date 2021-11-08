package gfg.school;
import java.util.*;

public class ReverseAnArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i = 0; i < size; i++) {
			int element = sc.nextInt();
			arr[i] = element;
		}
		System.out.println("Printing an array before reversal");
		
		// printing the entered array
		for(int i = 0; i < size; i++) {
			System.out.print(arr[i] +" ");
		}
		
		System.out.println("Printing an array after reversal");
		//Reverse of an Array
		for(int i = size - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		
		sc.close();
		
	}

}
