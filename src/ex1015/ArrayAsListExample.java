package ex1015;

import java.util.*;

public class ArrayAsListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = Arrays.asList("홍길덩","신용권","김자바");
		for(String name: list1) {
			System.out.println(name);
		}
		
		List<Integer> list2 = Arrays.asList(1,2,3);
		for(int value: list2) {
			System.out.println(value);
		}
		
	}

}
