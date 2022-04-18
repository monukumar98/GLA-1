package Lec21;

public class BalancedBinaryTree_Optimize {
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

	
	public class BalancePair{
		boolean isbal=true;
		int ht =-1;
		
	}
	
	
	class Solution {
		public boolean isBalanced(TreeNode root) {
			return isbalnced(root).isbal;

			
		}
		public BalancePair isbalnced(TreeNode root) {
			if(root==null) {
				return new BalancePair();
			}
			
			BalancePair lbp= isbalnced(root.left);
			BalancePair rbp= isbalnced(root.right);
			BalancePair sbp = new BalancePair();
			sbp.ht=Math.max(lbp.ht, rbp.ht)+1;
			boolean sb= Math.abs(lbp.ht- rbp.ht)<=1;
			sbp.isbal=lbp.isbal && rbp.isbal && sb;
			return sbp;
			
			
			
		}
	}
}
