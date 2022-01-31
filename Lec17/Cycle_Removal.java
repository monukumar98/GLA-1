package Lec17;

public class Cycle_Removal {

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

	public void Create_Cycle() throws Exception {
		this.tail.next = GetNode(2);
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

	public Node MeetingPoint() {
		Node slow = this.head;
		Node fast = this.head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return slow;
			}

		}
		return null;
	}

	public void removecycle() {
		Node meet = MeetingPoint();
		if (meet == null) {
			return;
		}
		Node start = this.head;
		while (start != null) {
			Node temp = meet;
			while (temp.next != meet) {

				if (temp.next == start) {
					temp.next = null;
					return;

				}
				temp = temp.next;

			}
			start = start.next;

		}

	}

	public void removecycle2() {
		Node meet = MeetingPoint();
		if (meet == null) {
			return;
		}
		Node temp = meet;
		int count = 1;
		while (temp.next != meet) {
			count++;
			temp = temp.next;
		}
		Node fast = this.head;
		for (int i = 1; i <= count; i++) {
			fast = fast.next;
		}
		Node slow = this.head;
		// Fast N steps ahead from Slow
		while (slow.next != fast.next) {
			fast = fast.next;
			slow = slow.next;
		}
	 fast.next=null;

	}

	public void display() {

		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println(".");

	}
	public void FloyedCycleRemovel() {
		Node meet = MeetingPoint();
		if (meet == null) {
			return;
		}
		Node fast =meet;
		
		Node slow = this.head;
		// Fast N steps ahead from Slow
		while (slow.next != fast.next) {
			fast = fast.next;
			slow = slow.next;
		}
		fast.next=null;
		
	}

	public static void main(String[] args) throws Exception {
		Cycle_Removal cr = new Cycle_Removal();
		cr.addLAst(1);
		cr.addLAst(2);
		cr.addLAst(3);
		cr.addLAst(4);
		cr.addLAst(5);
		cr.addLAst(6);
		cr.addLAst(7);
		cr.addLAst(8);
		cr.Create_Cycle();
		cr.removecycle2();
		cr.display();

	}

}
