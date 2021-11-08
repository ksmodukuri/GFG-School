package gfg.school;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindSingle {
	
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		for(int i = 0; i < size; i++) {
			int entered = sc.nextInt();
			if(map.containsKey(entered)) {
				int val = (int)map.get(entered);
				map.put(entered, ++val);
			}
		}
		sc.close();
		for(int key: map.keySet()) {
			if(map.get(key) == 1) {
				System.out.println(key);
				break;
			}
		}
		
	}

}
