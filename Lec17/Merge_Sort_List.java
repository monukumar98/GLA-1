package Lec17;

import Lec17.Merge_Two_Sorted_Lists.ListNode;

public class Merge_Sort_List {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	class Solution {
		public ListNode sortList(ListNode head) {
			if (head == null || head.next == null) {
				return head;
			}
			ListNode midnode = mid(head);// 1st linked list
			ListNode mid_next = midnode.next;//2nd linked list
			midnode.next = null;
			ListNode l1 = sortList(head);
			ListNode l2 = sortList(mid_next);
			return mergeTwoLists(l1, l2);

		}

		public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
			ListNode temp = new ListNode(2);
			ListNode ans = temp;
			while (list1 != null && list2 != null) {

				if (list1.val <= list2.val) {
					temp.next = list1;
					list1 = list1.next;
					temp = temp.next;
				} else {
					temp.next = list2;
					list2 = list2.next;
					temp = temp.next;
				}
			}

			if (list1 != null) {
				temp.next = list1;
			}
			if (list2 != null) {
				temp.next = list2;
			}

			return ans.next;

		}

		public ListNode mid(ListNode head) {
			ListNode slow = head;
			ListNode fast = head;
			while (fast.next != null && fast.next.next != null) {// 1st mid lena hai, 2nd mid se Stack overflow hojaayega Example 4-->2-->null 

				slow = slow.next;
				fast = fast.next.next;

			}
			return slow;
		}

	}

}
