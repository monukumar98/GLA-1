package Lec34;

public class Graph_Client_Qps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph_Qps g = new Graph_Qps(9);
		g.addedge(1, 4, 5);
		g.addedge(1, 2, 10);
		g.addedge(2, 3, 7);
		g.addedge(3, 4, 2);
		//g.addedge(4, 5, 4);
		g.addedge(5, 6, 3);
		g.addedge(5, 7, 2);
		g.addedge(6, 7, 7);
		 g.addedge(8, 9, 3);
		//System.out.println(g.isConected());
		System.out.println(g.GetAllComponent());

	}

}
