package Lec27;

import java.util.PriorityQueue;

public class Kth_Largest_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 2, 1, 5, 6, 4 };
		System.out.println(findKthLargest(arr, 3));

	}

	public static int findKthLargest(int[] nums, int k) {
		
		PriorityQueue<Integer>  pq = new PriorityQueue<>();
		for (int i = 0; i <k; i++) {
			
			pq.add(nums[i]);
			
		}
		for (int i = k; i < nums.length; i++) {
			if(pq.peek()<nums[i]) {
				pq.poll();
				pq.add(nums[i]);
			}
			
		}
		return pq.peek();

	}

}
