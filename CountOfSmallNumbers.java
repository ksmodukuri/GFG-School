package gfg.school;
import java.util.Scanner;

public class CountOfSmallNumbers {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		sc.close();
		int count = 0;
		for(int i = 0; i < size; i++) {
			if(arr[i] > x) {
				break;
			} else {
				count++;
			}
		}
		System.out.println("Count " + count);
	}

}
