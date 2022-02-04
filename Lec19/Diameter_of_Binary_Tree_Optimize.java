package Lec19;

public class Diameter_of_Binary_Tree_Optimize {
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

	public class Diapair {
		int d = 0;
		int h = -1;
	}

	class Solution {
		public int diameterOfBinaryTree(TreeNode root) {
			return diameterOfBt(root).d;
		}

		public Diapair diameterOfBt(TreeNode root) {
			if (root == null) {
				return new Diapair();
			}

			Diapair ldp = diameterOfBt(root.left);
			Diapair rdp = diameterOfBt(root.right);
			Diapair sdp = new Diapair();
			sdp.h = Math.max(ldp.h, rdp.h) + 1;
			int sd = ldp.h + rdp.h + 2;

			sdp.d = Math.max(sd, Math.max(ldp.d, rdp.d));
			return sdp;

		}

	}
}
