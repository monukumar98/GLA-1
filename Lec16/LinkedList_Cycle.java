package Lec16;

public class LinkedList_Cycle {

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

	public void Create_Cycle() {
		this.tail.next = this.head;
	}

	public void display() {

		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println(".");

	}

	public boolean floyedCycle() {

		Node SLow = this.head;
		Node Fast = this.head;
		while (Fast != null && Fast.next != null) {
			SLow = SLow.next;
			Fast = Fast.next.next;

			if (SLow == Fast) {
				return true;
			}

		}
		return false;
	}

	public static void main(String[] args) {
		LinkedList_Cycle lc = new LinkedList_Cycle();
		lc.addLAst(1);
		lc.addLAst(2);
		lc.addLAst(3);
		lc.addLAst(4);
		lc.addLAst(5);
		lc.addLAst(6);
		lc.addLAst(7);
		lc.addLAst(8);
		lc.Create_Cycle();
		lc.floyedCycle();
		System.out.println(lc.floyedCycle());
		//lc.display();

	}

}
