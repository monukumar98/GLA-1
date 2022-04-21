package Lec23;

public class Binary_Search_Tree {

	public class Node {

		int data;
		Node left;
		Node riight;

		public Node(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
		}
	}

	private Node root;

	public Binary_Search_Tree(int[] in) {
		// TODO Auto-generated constructor stub
		this.root = CreateTree(in, 0, in.length - 1);

	}

	private Node CreateTree(int[] in, int lo, int hi) {
		// TODO Auto-generated method stub
		if (hi < lo) {
			return null;
		}
		int mid = (lo + hi) / 2;
		Node nn = new Node(in[mid]);
		nn.left = CreateTree(in, lo, mid - 1);
		nn.riight = CreateTree(in, mid + 1, hi);

		return nn;
	}

	private void display(Node node) {
		if(node==null) {
			return;
		}
		System.out.print(node.data + " ");
		display(node.left);
		display(node.riight);

	}

	public void display() {
		display(root);
		System.out.println();
	}

}
