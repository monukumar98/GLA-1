package Lec25;


public class Validate_Binary_Search_Tree_Optimized {
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

	public class BstPair {
		boolean isbst = true;
		long min = Long.MAX_VALUE;
		long max = Long.MIN_VALUE;
		

	}

	class Solution {
		public boolean isValidBST(TreeNode root) {
			return Valid(root).isbst;

		}

		public BstPair Valid(TreeNode root) {
			if (root == null) {
				return new BstPair();
			}
			BstPair lpbst = Valid(root.left);
			BstPair rpbst = Valid(root.right);
			BstPair spbst = new BstPair();
			spbst.min = Math.min(lpbst.min, Math.min(rpbst.min, root.val));
			spbst.max = Math.max(lpbst.max, Math.max(rpbst.max, root.val));
			if (lpbst.isbst && rpbst.isbst && (lpbst.max < root.val && rpbst.min > root.val)) {
				spbst.isbst = true;

				return spbst;
			}
			spbst.isbst = false;

			return spbst;

		}

	}
}
