package Lec18;

import java.util.Scanner;

public class Binary_Tree {
	public class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
		}

		public Node() {
			// TODO Auto-generated constructor stub
		}
	}

	Scanner sc = new Scanner(System.in);
	private Node root;

	public Binary_Tree() {
		// TODO Auto-generated constructor stub
		this.root = Create_Tree(null);
	}

	private Node Create_Tree(Node parent) {
		// TODO Auto-generated method stub
		int item = sc.nextInt();
		Node nn = new Node(item);
		boolean hlc = sc.nextBoolean();
		if (hlc == true) {
			nn.left = Create_Tree(nn);
		}
		boolean hrc = sc.nextBoolean();

		if (hrc == true) {
			nn.right = Create_Tree(nn);
		}
		return nn;

	}

	public void display() {
		display(this.root);
	}

	private void display(Node node) {
		if (node == null) {
			return;
		}
		String str = "" + node.data;
		str = "<--" + str;
		if (node.left != null) {
			str = node.left.data + str;
		} else {
			str = "." + str;
		}

		str = str + "-->";
		if (node.right != null) {
			str = str + node.right.data;
		}

		else {
			str = str + ".";
		}
		System.out.println(str);
		display(node.left);
		display(node.right);

	}

	public boolean find(int item) {
		return find(this.root, item);

	}

	private boolean find(Node node, int item) {
		// TODO Auto-generated method stub
		if (node == null) {
			return false;
		}
		if (node.data == item) {
			return true;
		}
		boolean lf = find(node.left, item);
		boolean rf = find(node.right, item);

		return lf || rf;
	}

	public int min() {
		return min(this.root);

	}

	private int min(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return Integer.MAX_VALUE;
		}

		int selfmin = node.data;
		int left_min = min(node.left);
		int right_min = min(node.right);

		return Math.min(selfmin, Math.min(left_min, right_min));
	}

	public int CountNode() {
		return CountNode(this.root);
	}

	private int CountNode(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return 0;
		}

		int lc = CountNode(node.left);
		int rc = CountNode(node.right);
		return lc + rc + 1;

	}

	public int ht() {
		return ht(this.root);
	}

	private int ht(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return -1;
		}

		int lh = ht(node.left);
		int rh = ht(node.right);

		return Math.max(lh, rh) + 1;
	}

	public void PreOrder() {
		PreOrder(this.root);
		System.out.println();
	}

	private void PreOrder(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}

		System.out.print(node.data + " ");
		PreOrder(node.left);
		PreOrder(node.right);

	}

	public void PostOrder() {
		PostOrder(this.root);
		System.out.println();
	}

	private void PostOrder(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}

		PostOrder(node.left);
		PostOrder(node.right);
		System.out.print(node.data + " ");

	}

	public void InOrder() {
		InOrder(this.root);
		System.out.println();
	}

	private void InOrder(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}
		InOrder(node.left);
		System.out.print(node.data + " ");
		InOrder(node.right);

	}

}
