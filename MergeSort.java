package gfg.school;

public class MergeSort {
	
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
