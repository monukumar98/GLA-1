package Lec18;

public class BinaryTree_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Binary_Tree bt = new Binary_Tree();
		bt.display();
		System.out.println(bt.find(70));
		System.out.println(bt.min());
		System.out.println(bt.CountNode());
		System.out.println(bt.ht());
		bt.PreOrder();
		bt.PostOrder();
		bt.InOrder();

	}
// 10 true 20 true 30 false true 50 false false true 60 false false true 70 true 90 false false true 110 false false
}
