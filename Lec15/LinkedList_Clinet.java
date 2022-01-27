package Lec15;

public class LinkedList_Clinet {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList ll = new  LinkedList();
		ll.addFirst(1);
		ll.addFirst(2);
		ll.addFirst(3);
		//ll.display();
		ll.addLAst(4);
		ll.addFirst(5);
		ll.addLAst(7);
		//ll.display();
		ll.addatindex(1,  90);
		ll.display();
//		System.out.println(ll.getFirst());
//		System.out.println(ll.getLAst());
//		System.out.println(ll.getanyIndex(3));
//		System.out.println(ll.removeFirst());
//		ll.display();
//		System.out.println(ll.removeLAst());
//		ll.display();
		System.out.println(ll.removeatindex(6));
		ll.display();
		
	}

}
