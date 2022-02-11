package Lec20;

import java.util.*;

public class RightView {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}

	}

	class Solution {
		int maxdept = -1;

		public List<Integer> rightSideView(TreeNode root) {
			List<Integer> ll = new ArrayList<>();
			rightview(root, 0, ll);
			return ll;
		}

		public void rightview(TreeNode root, int curr, List<Integer> ll) {
			if (root == null) {
				return;
			}

			if (maxdept < curr) {
				ll.add(root.val);
				maxdept = curr;
			}

			rightview(root.right, curr + 1, ll);
			rightview(root.left, curr + 1, ll);
		}
	}
}
