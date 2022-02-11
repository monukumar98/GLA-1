package Lec20;

public class Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal {
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
		public TreeNode buildTree(int[] preorder, int[] inorder) {

			return CreateTree(preorder, inorder, 0, inorder.length - 1, 0, preorder.length - 1);

		}

		private TreeNode CreateTree(int[] preorder, int[] inorder, int ilo, int ihi, int plo, int phi) {
			// TODO Auto-generated method stub

			if (ilo > ihi || plo > phi) {
				return null;
			}
			TreeNode node = new TreeNode(preorder[plo]);
			int i = Search(inorder, preorder[plo], ilo, ihi);
			int nel = i - ilo;
			node.left = CreateTree(preorder, inorder, ilo, i - 1, plo + 1, plo + nel);
			node.right = CreateTree(preorder, inorder, i + 1, ihi, plo + nel + 1, phi);
			return node;

		}

		private int Search(int[] inorder, int item, int ilo, int ihi) {
			// TODO Auto-generated method stub
			for (int j = ilo; j <= ihi; j++) {
				if (inorder[j] == item) {
					return j;
				}

			}
			return -1;

		}

	}
}
