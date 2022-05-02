package Lec28;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class HashMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Raj", 89);
		map.put("Amit", 79);
		map.put("Amisha", 58);
		map.put("Rahul", 49);
		map.put("Rajesh", 89);
		map.put("Priya", 67);
		map.put("Priya", 90);

		// 1st print

		Set<String> key = map.keySet();
		for (String k : key) {
			System.out.println(k + " " + map.get(k));
		}
		System.out.println("***********************");
		// 2nd ways
		ArrayList<String> ll = new ArrayList<>(map.keySet());
		for (String k : ll) {
			System.out.println(k + " " + map.get(k));
		}
		System.out.println("***********************");
		// 3nd ways

		for (String k : map.keySet()) {
			System.out.println(k + " " + map.get(k));
		}

//		System.out.println(map);
//		// get
//		System.out.println(map.get("Amisha"));
//		// containsKey
//		
//		System.out.println(map.containsKey("Rohit"));
//		System.out.println(map.containsKey("Rahul"));
//		System.out.println(map.containsKey("Shivani"));
//		// remove
//		System.out.println(map.remove("Raj"));
//		System.out.println(map);
//	     map.put(null, null);
//		System.out.println(map);

		TreeMap<String, Integer> map1 = new TreeMap<>();
		map1.put("Raj", 89);
		map1.put("Amit", 79);
		map1.put("Amisha", 58);
		map1.put("Rahul", 49);
		map1.put("Rajesh", 89);
		map1.put("Priya", 67);
		map1.put("Priya", 90);
//		System.out.println(map1);

		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
		map2.put("Raj", 89);
		map2.put("Amit", 79);
		map2.put("Amisha", 58);
		map2.put("Priya", 67);
		map2.put("Rahul", 49);
		map2.put("Rajesh", 89);

		map2.put("Priya", 90);
//		System.out.println(map2);
	}

}
