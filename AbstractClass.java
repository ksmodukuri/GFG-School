package gfg.school;
import java.util.Scanner;

public class AbstractClass {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		B bClass = new B();
		bClass.m1(a, b);
	}

}


abstract class A {
	int product;
	
	abstract void m1 (int a, int b);
	
	void m2 () {
		System.out.println(product);
	}
}

class B extends A {

	@Override
	void m1(int a, int b) {
		this.product = a * b;
		m2();
	}
	
}