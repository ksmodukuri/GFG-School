package gfg.school;
import java.util.Scanner;

public class ToeplizMatrix {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		if(m != n) {
			System.out.println(0);
		} else {
			int prev = 0;
			boolean isToepliz = true;
			for(int i = 0;i < m; i++) {
				for(int j = 0; j < n; j++) {
					int in = sc.nextInt();
					if(i == j) {
						if(i != 0 && j!= 0) {
							if(in != prev) {
								isToepliz = false;
								break;
							}
						} else {
							prev = in;
						}
					}
				}
			}
			if(isToepliz) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
		sc.close();
	}

}
