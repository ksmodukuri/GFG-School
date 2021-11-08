package gfg.school;
import java.util.Scanner;

public class PrintLeftElement {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		int[] result = mergeSort(arr);
		int length = result.length;
		boolean removeMax = true;
		int i = 0;
		int j = length - 1;
		while(length != 1) {
			if(removeMax) {
				j--;
				length--;
				removeMax = !removeMax;
			} else {
				i++;
				length--;
				removeMax = !removeMax;
			}
		}
		if(length == 1) {
			if(removeMax) {
				System.out.println(result[j]);
			} else {
				System.out.println(result[i]);
			}
		}
	}
	
	static int[] mergeSort(int[] arr) {
		if(arr.length == 1) {
			return arr;
		}
		int mid = (int) Math.floor(arr.length / 2);
		int[] left = new int[mid];
		int[] right = new int[arr.length - mid];
		for(int i = 0; i < mid; i++) {
			left[i] = arr[i];
		}
		for(int i = mid; i < arr.length; i++) {
			right[i-mid] = arr[i];
		}
		return merge(mergeSort(left), mergeSort(right));
	}
	
	static int[] merge(int[] left, int[] right) {
		int i = 0;
		int j = 0;
		int k = 0;
		int leftLength = left.length;
		int rightLength = right.length;
		int[] result = new int[leftLength + rightLength];
		while(i < leftLength && j < rightLength) {
			if(left[i] < right[j]) {
				result[k] = left[i];
				i++;
			} else if(right[j] < left[i]) {
				result[k] = right[j];
				j++;
			} else {
				result[k] = left[i];
				i++;
				j++;
			}
			k++;
		}
		if(i != leftLength) {
			for(int x = i; x < leftLength; x++) {
				result[k] = left[x];
				k++;
			}
		}
		if(j != rightLength) {
			for(int x = j; x < rightLength; x++) {
				result[k] = right[x];
				k++;
			}
		}
		return result;
	}

}
