package Lec13;

import java.util.Stack;

public class Stack_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<>();
		// add O(1)
		s.push(10);
		s.push(20);
		s.push(30);
		
		
		// peek 
		
		System.out.println(s.peek());
		
		// remove 
		System.out.println(s.pop());
		System.out.println(s.peek());
		
		System.out.println(s.size());
		System.out.println(s.isEmpty());
		
		System.out.println(s);

	}

}
