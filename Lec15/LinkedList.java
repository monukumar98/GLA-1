package Lec15;

public class LinkedList {

	private class Node {

		int data;
		Node next;

		public Node(int item) {
			// TODO Auto-generated constructor stub
			this.data = item;
		}

		public Node() {
			// TODO Auto-generated constructor stub
		}

	}

	private Node head;
	private int size;
	private Node tail;

// Addtion
	public void addFirst(int item) {
		Node nn = new Node(item);

		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			nn.next = this.head;
			this.head = nn;
			this.size++;

		}

	}

	public void addLAst(int item) {
		if (this.size == 0) {
			addFirst(item);

		} else {
			Node nn = new Node(item);
			this.tail.next = nn;
			this.tail = nn;
			this.size++;
		}

	}

	public void addatindex(int k, int item) throws Exception {
		if (k < 0 || k > this.size) {
			throw new Exception("Pgl hai kya sahi index bata");
		}

		if (k == 0) {
			addFirst(item);
		} else if (k == this.size) {
			addLAst(item);
		} else {

			Node nn = new Node(item);
			Node sln = GetNode(k - 1);
			nn.next = sln.next;
			sln.next = nn;
			this.size++;

		}

	}

	// get

	public int getFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("Linked list is empty");
		}

		return this.head.data;
	}

	public int getLAst() throws Exception {
		if (this.size == 0) {
			throw new Exception("Linked list is empty");
		}

		return this.tail.data;
	}

	public int getanyIndex(int k) throws Exception {
		if (this.size == 0) {
			throw new Exception("Linked list is empty");
		}

		return this.GetNode(k).data;
	}

	private Node GetNode(int k) throws Exception {// 0 to size-1
		if (k < 0 || k >= this.size) {
			throw new Exception("Pgl hai kya sahi index bata");
		}
		Node temp = this.head;
		for (int i = 1; i <= k; i++) {
			temp = temp.next;
		}

		return temp;

	}

	// remove

	public int removeFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("Linked list is empty");
		}
		int rv = this.head.data;
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size--;

		} else {
			Node temp = this.head;
			this.head = this.head.next;
			temp.next = null;
			this.size--;

		}
		return rv;

	}

	public int removeLAst() throws Exception {
		if (this.size == 0) {
			throw new Exception("Linked list is empty");
		}

		if (this.size == 1) {
			return removeFirst();

		}

		int rv = this.tail.data;

		Node sln = GetNode(this.size - 2);
		sln.next = null;
		this.tail = sln;
		this.size--;
		return rv;

	}

	public int removeatindex(int k) throws Exception {
		if (this.size == 0) {
			throw new Exception("Linked list is empty");
		}
		if (k < 0 || k >= this.size) {
			throw new Exception("Pgl hai kya sahi index bata");
		}
		if (k == 0) {
			return removeFirst();
		} else if (k == this.size - 1) {
			return removeLAst();
		}
//		else {
//			Node k_1th = GetNode(k - 1);
//			Node kth = GetNode(k);
//			k_1th.next = kth.next;
//			kth.next = null;
//			this.size--;
//			return kth.data;
//
//		}

		
		 else {
				Node k_1th = GetNode(k - 1);
				Node kth=k_1th.next;
				k_1th.next = kth.next;
				kth.next = null;
				this.size--;
				return kth.data;

			}
	}

	public void display() {

		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println(".");

	}

}
