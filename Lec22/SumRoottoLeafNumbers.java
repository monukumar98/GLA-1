package Lec22;

public class SumRoottoLeafNumbers {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	class Solution {
		public int sumNumbers(TreeNode root) {
			return SN(root, 0);
		}

		private int SN(TreeNode root, int curr) {
			// TODO Auto-generated method stub
			if(root==null) {
				return 0;
			}
			if(root.left==null && root.right==null) {
				return curr*10+root.val;
			}
			
			int left = SN(root.left, curr*10+root.val);
			int right= SN(root.right, curr*10+root.val);
			return left+right;
		}
	}
}
