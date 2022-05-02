package Lec30;

import java.util.ArrayList;

public class HashMap {

	public class Node {
		String key;
		int value;
		Node next;

		public Node(String key, int value) {
			// TODO Auto-generated constructor stub
			this.key = key;
			this.value = value;
		}

	}

	private ArrayList<Node> buckarray;
	private int size = 0;

	public HashMap(int cap) {
		// TODO Auto-generated constructor stub
		this.buckarray = new ArrayList<>();
		for (int i = 0; i < cap; i++) {
			this.buckarray.add(null);
		}

	}

	public HashMap() {
		// TODO Auto-generated constructor stub
		this(4);

	}

	public void put(String key, int value) {
		int bn = hashfun(key);
		Node temp = this.buckarray.get(bn);
		while (temp != null) {

			if (temp.key.equals(key)) {
				temp.value = value;
				return;
			}
			temp = temp.next;

		}

		Node nn = new Node(key, value);
		temp = this.buckarray.get(bn);
		nn.next = temp;
		this.buckarray.set(bn, nn);
		this.size++;

		double thf = 2.0;
		double loadfactor = ((1.0 * this.size) / this.buckarray.size());
		if (loadfactor > thf) {
			rehashing();
		}

	}

	private void rehashing() {
		// TODO Auto-generated method stub
		ArrayList<Node> nba = new ArrayList<>();
		for (int i = 0; i < 2 * this.buckarray.size(); i++) {
			nba.add(null);

		}
		ArrayList<Node> oba = this.buckarray;
		this.buckarray = nba;
		this.size = 0;
		for (Node temp : oba) {

			while (temp != null) {
				put(temp.key, temp.value);
				temp = temp.next;

			}

		}

	}

	public Integer get(String key) {

		int bn = hashfun(key);
		Node temp = this.buckarray.get(bn);
		while (temp != null) {
			System.out.println(temp.key);
			if (temp.key.equals(key)) {

				return temp.value;
			}
			temp = temp.next;

		}
		return null;
	}

	public boolean ContainsKey(String key) {
		int bn = hashfun(key);
		Node temp = this.buckarray.get(bn);
		while (temp != null) {

			if (temp.key.equals(key)) {

				return true;
			}
			temp = temp.next;

		}
		return false;

	}

	public Integer remove(String key) {
		int bn = hashfun(key);
		Node temp = this.buckarray.get(bn);
		Node Prev = null;
		while (temp != null) {

			if (temp.key.equals(key)) {
				break;
			}
			Prev = temp;
			temp = temp.next;

		}

		if (temp == null) {
			return null;
		}
		if (Prev == null) {
			this.buckarray.set(bn, temp.next);
			temp.next = null;
		} else {
			Prev.next = temp.next;
			temp.next = null;
		}
		this.size--;
		return temp.value;

	}

	public int hashfun(String key) {

		int fn = key.hashCode() % this.buckarray.size();
		if (fn < 0) {
			fn = fn + this.buckarray.size();
		}
		return fn;
	}

	public int size() {
		return this.size;
	}

	public String toString() {
		String str = "{";
		for (Node temp : this.buckarray) {
			while (temp != null) {
				str = str + temp.key + "," + temp.value + ", ";
				temp = temp.next;
			}

		}
		return str + "}";

	}
}
