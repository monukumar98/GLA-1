package Lec27;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueue_Demo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(8);
		pq.add(4);
		pq.add(7);
		pq.add(1);
		pq.add(-80);
		pq.add(78);
		pq.add(3);
//		System.out.println(pq.peek());
//		System.out.println(pq);
//		System.out.println(pq.poll());
//		System.out.println(pq);

		PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder());
		pq1.add(8);
		pq1.add(4);
		pq1.add(7);
		pq1.add(1);
		pq1.add(-80);
		pq1.add(78);
		pq1.add(3);
		System.out.println(pq1.peek());
		System.out.println(pq1);
		System.out.println(pq1.poll());
		System.out.println(pq1);

	}

}
