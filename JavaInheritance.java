package gfg.school;
import java.util.Scanner;

public class JavaInheritance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		cls2 cls = new cls2();
		cls.task(a,b);
		sc.close();
		
	}
}

class cls1 {

	int add(int a, int b) {
		return a + b;
	}
}

class cls2 extends cls1 {
	int mul(int a, int b) {
		return a * b;
	}

	void task(int a, int b) {
		System.out.println(add(mul(a, a) ,mul(b,b)));
	}
}
