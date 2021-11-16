package Lec4;

import java.util.ArrayList;

public class Arrays_List_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

		}
		list.add(1, 90);
		System.out.println(list);
		// System.out.println(list.remove(0));
		System.out.println("...................");

		System.out.println(list);
		System.out.println("........................");

		// update
		list.set(1, -10);

		System.out.println("...................");

		System.out.println(list);
		System.out.println("........................");

	}

}
