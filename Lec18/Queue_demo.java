package Lec18;

import java.util.*;

public class Queue_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
//		System.out.println(list);
//		System.out.println(list.remove());
//		System.out.println(list);

		// create stack using LinkedList
		LinkedList<Integer> stack = new LinkedList<>();
		stack.addFirst(10);
		stack.addFirst(20);
		stack.addFirst(30);
		stack.addFirst(40);
		stack.addFirst(50);
		System.out.println(stack.remove());// fisrt se

//		Queue<Integer> qq = new LinkedList<>();

		// Create Queue using LinkedList

		// add last
		// remove first
		LinkedList<Integer> qq = new LinkedList<>();
		qq.add(10);// last me add krega
		qq.add(20);
		qq.add(30);
		qq.add(40);
		System.out.println(qq);
		System.out.println(qq.remove());// remove first 
		System.out.println(qq);

	}

}
