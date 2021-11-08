package gfg.school;
import java.util.*;

public class SumOfElementsOfMatrix {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size1 = sc.nextInt();
		int size2 = sc.nextInt();
		int total = 0;
		for(int i = 0; i < size1; i++) {
			for(int j = 0; j < size2; j++) {
				total+=sc.nextInt();
			}
		}
		System.out.println("total " + total);
		sc.close();
		
	}

}
