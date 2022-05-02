package Lec28;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();
		set.add(7);
		set.add(78);
		set.add(97);
		set.add(3);
		set.add(44);
		set.add(-7);
		set.add(7);
		System.out.println(set);
//		System.out.println(set.contains(99));
//		System.out.println(set.remove(7));
		TreeSet<Integer> set1 = new TreeSet<>();
		set1.add(7);
		set1.add(78);
		set1.add(97);
		set1.add(3);
		set1.add(44);
		set1.add(-7);
		set1.add(7);
		System.out.println(set1);
		LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
		set2.add(7);
		set2.add(78);
		set2.add(97);
		set2.add(3);
		set2.add(44);
		set2.add(-7);
		set2.add(7);
		System.out.println(set2);
//		System.out.println(set.contains(99));
//		System.out.println(set.remove(7));
				
	

	}

}
