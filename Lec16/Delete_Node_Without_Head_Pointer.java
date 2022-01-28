package Lec16;

public class Delete_Node_Without_Head_Pointer {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	class Solution {
		public void deleteNode(ListNode node) {
			node.val=node.next.val;
	        node.next=node.next.next;
		}
	}

}
