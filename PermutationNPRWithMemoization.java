package gfg.school;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class PermutationNPRWithMemoization {
	
	private static Map<Integer, Integer> map;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		map = new HashMap<Integer, Integer>();
		int n = sc.nextInt();
		int r = sc.nextInt();
		if(n==r) {
			System.out.println(1);
		} else {
			calculatePermutation(n, r);
		}
		sc.close();
	}
	
	static void calculatePermutation(int n, int r) {
		map.put(1,1);
		int num = calculateFactorial(n);
		int dem = calculateFactorial(n-r);
		int per = num/dem;
		System.out.println("Permutation "+ per);
	}
	
	static int calculateFactorial(int n) {
		if(map.containsKey(n)) {
			return map.get(n);
		}
		map.put(n, n*calculateFactorial(n-1));
		return map.get(n);
	}
	
	

}
