package Lec31;

public class Trie_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trie t = new Trie();
		t.insert("Apple");
		t.insert("Raj");
		t.insert("Ram");
		t.insert("Rajesh");
		t.insert("Man");
		t.insert("Mango");
		System.out.println(t.search("Raja"));
		System.out.println(t.search("Apple"));
		System.out.println(t.startsWith("Ra"));
		

	}

}
