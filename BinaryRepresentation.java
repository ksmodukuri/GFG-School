package gfg.school;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class BinaryRepresentation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long number = sc.nextLong();
		sc.close();
		System.out.println(binaryRep(number, 0));
		binaryRep(number);
	}

	// Long approach....
	static Long binaryRep(long number, int count) {
		long temp = number;
		long rep = 0;
		while (number != 1 && number != 0) {
			++count;
			number = number / 2;
		}
		rep = (long) Math.pow(10, count);
		long currentNumber = (long) Math.pow(2, count);
		long diff = temp - currentNumber;
		while (diff != 1 && diff != 0 && diff > 0) {
			int addCount = 0;
			while (diff != 1 && diff != 0) {
				addCount++;
				diff = diff / 2;
			}
			rep = (long) (rep + Math.pow(10, addCount));
			currentNumber += Math.pow(2, addCount);
			diff = temp - currentNumber;
		}
		if(diff == 1) {
			rep += 1;
		}
		return rep;
	}
	
	// Better approach
	static void binaryRep(long number) {
		List<Long> arr = new ArrayList<Long>();
		while(number > 1) {
			arr.add(number);
			number /= 2;
		}
		arr.add(number);
		for(int i = arr.size() - 1; i >= 0; i--) {
			System.out.print(arr.get(i)%2);
		}
	}
	

}
