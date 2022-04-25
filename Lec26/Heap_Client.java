package Lec26;

public class Heap_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heap hp = new Heap();
		hp.add(2); 
		hp.add(3);
		hp.add(5);
		hp.add(6);
		hp.add(1);
		hp.add(7);
		hp.add(8);
		hp.add(10);
		hp.add(-2);
		hp.add(21);
		hp.add(23);
		hp.Display();
		System.out.println(hp.getmin());
		System.out.println(hp.remove());
		hp.Display();

	}

}
