package Lec33;

import java.util.HashSet;

public class Graph_Qps_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph_Qps g = new Graph_Qps(9);
		g.addedge(1, 4, 5);
		g.addedge(1, 2, 10);
		g.addedge(2, 3, 7);
		g.addedge(3, 4, 2);
		// g.addedge(4, 5, 4);
		g.addedge(5, 6, 3);
		g.addedge(5, 7, 2);
		g.addedge(6, 7, 7);
		g.addedge(8, 9, 3);
//		System.out.println(g.haspath(1, 6, new HashSet<>()));
//		g.PrintAllpath(1, 6, new HashSet<>(), "");
		System.out.println(g.BFS(1, 6));
		System.out.println(g.DFS(1, 6));
		g.BFT();

	}

}
