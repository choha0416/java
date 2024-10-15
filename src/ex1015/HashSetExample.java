package ex1015;
import java.util.*;
public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set= new HashSet<String>();
		
		set.add("Java");
		set.add("Jdbc");
		set.add("servlet/jsp");
		set.add("Java");
		set.add("iBatis");
		
		int size = set.size();
		System.out.println("총 객체수: "+size);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t"+element);
		}
		
		set.remove("Jdbc");
		set.remove("iBatis");
		
		System.out.println("총 객체수: "+size);
		
		
		for(String element : set) {
			System.out.println("\t "+element);
		}
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비었음");
		}
	}

}
