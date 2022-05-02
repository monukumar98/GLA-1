package Lec27;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Merge_k_Sorted_Lists {

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	class Solution {
		public ListNode mergeKLists(ListNode[] lists) {
			ListNode temp = new ListNode();
			ListNode ans = temp;
			PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {

				@Override
				public int compare(ListNode o1, ListNode o2) {
					// TODO Auto-generated method stub
					return o1.val-o2.val;
				}
			});
			for (int i = 0; i < lists.length; i++) {
				if (lists[i] != null) {
					pq.add(lists[i]);
				}

			}

			while (!pq.isEmpty()) {
				ListNode rv = pq.poll();
				temp.next = rv;
				temp = temp.next;
				if (rv.next != null) {
					pq.add(rv.next);
				}

			}
			return ans.next;

		}
	}

}
