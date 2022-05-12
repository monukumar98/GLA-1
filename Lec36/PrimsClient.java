package Lec36;

public class PrimsClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prims_Algo pa = new Prims_Algo(7);
		pa.addEdge(1, 2, 20);
		pa.addEdge(2, 3, 5);
		pa.addEdge(1, 4, 60);
		pa.addEdge(4, 5, 5);
		pa.addEdge(3, 4, 10);
		pa.addEdge(5, 6, 14);
		pa.addEdge(5, 7, 18);
		pa.addEdge(6, 7, 13);
		pa.PrimsAlgo();
	}

}
