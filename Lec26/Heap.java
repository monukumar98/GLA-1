package Lec26;

import java.util.ArrayList;

public class Heap {

	private ArrayList<Integer> list = new ArrayList<>();

	public void add(int item) {
		this.list.add(item);
		upheapfiy(this.list.size() - 1);

	}

	private void upheapfiy(int ci) {
		// TODO Auto-generated method stub

		int pi = (ci - 1) / 2;

		if (this.list.get(pi) > this.list.get(ci)) {
			swap(ci, pi);
			upheapfiy(pi);

		}

	}

	public int remove() {
		swap(0, this.list.size() - 1);
		int rv = this.list.remove(this.list.size() - 1);
		downheapify(0);

		return rv;

	}

	private void downheapify(int pi) {
		// TODO Auto-generated method stub
		int c1 = 2 * pi + 1;
		int c2 = 2 * pi + 2;
		int mini = pi;
		if (c1 < this.list.size() && this.list.get(c1) < this.list.get(mini)) {
			mini = c1;
		}
		if (c2 < this.list.size() && this.list.get(c2) < this.list.get(mini)) {
			mini = c2;
		}
		if (mini != pi) {
			swap(pi, mini);
			downheapify(mini);
		}

	}

	public int getmin() {
		return this.list.get(0);
	}
	public void Display() {
		System.out.println(list);
	}

	private void swap(int i, int j) {
		int ith = this.list.get(i);
		int jth = this.list.get(j);
		this.list.set(i, jth);
		this.list.set(j, ith);

	}

}
