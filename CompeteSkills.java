package gfg.school;
import java.util.Scanner;

public class CompeteSkills {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = 3;
		int[] skills1 = new int[size];
		int[] skills2 = new int[size];
		for(int i = 0; i < size; i++) {
			skills1[i] = sc.nextInt();
		}
		for(int i = 0; i < size; i++) {
			skills2[i] = sc.nextInt();
		}
		sc.close();
		competeSkills(skills1, skills2);
	}
	
	static void competeSkills(int[] skills1, int[] skills2) {
		int pointsA = 0;
		int pointsB = 0;
		for(int i = 0; i < skills1.length; i++) {
			if(skills1[i] > skills2[i]) {
				pointsA++;
			} else if(skills1[i] < skills2[i]) {
				pointsB++;
			}
		}
		System.out.println(pointsA + " " + pointsB);
	}

}
