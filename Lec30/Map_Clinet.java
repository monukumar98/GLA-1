package Lec30;

public class Map_Clinet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map = new HashMap();
		map.put("Ram", -99);
		map.put("Ram", 90);
		map.put("Rohan", 87);
		map.put("Pooja", 85);
		map.put("Kamal", 90);
		map.put("Amisha", 95);
		map.put("Karan", 89);
		map.put("Puneet", 79);
		System.out.println(map.size());
		System.out.println(map.get("Amisha"));
		System.out.println(map.get("Kamal"));
		System.out.println(map.get("Ram"));
		System.out.println(map.ContainsKey("Ram"));
		System.out.println(map);

	}

}
