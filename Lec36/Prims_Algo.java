package Lec36;

import java.util.*;

public class Prims_Algo {

	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Prims_Algo(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();

		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void addEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);

	}

	public void PrimsAlgo() {
		PriorityQueue<PrimsPair> pq = new PriorityQueue<>(new Comparator<PrimsPair>() {

			@Override
			public int compare(PrimsPair o1, PrimsPair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}
		});
		HashSet<Integer> visitd = new HashSet<>();
		PrimsPair pp = new PrimsPair(1, 1, 0);
		pq.add(pp);
		while (!pq.isEmpty()) {
			PrimsPair rp = pq.poll();

			if (visitd.contains(rp.vtx)) {
				continue;
			}

			visitd.add(rp.vtx);
			System.out.println(rp);

			for (int key : map.get(rp.vtx).keySet()) {
				if (!visitd.contains(key)) {
					PrimsPair np = new PrimsPair(key, rp.vtx, map.get(rp.vtx).get(key));
					pq.add(np);
				}
			}

		}

	}

	public class PrimsPair {
		int vtx;
		int acqvtx;
		int cost;

		public PrimsPair(int vtx, int acqvtx, int cost) {
			// TODO Auto-generated constructor stub
			this.vtx = vtx;
			this.acqvtx = acqvtx;
			this.cost = cost;
		}
		@Override
		public String toString() {
			return this.vtx +" "+this.acqvtx+" @ "+this.cost;
		}

	}

}
