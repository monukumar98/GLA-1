package Lec34;

import java.util.*;

public class Graph_Qps {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Graph_Qps(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());

		}
	}

	public void addedge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	public void DFT() {
		Stack<Integer> st = new Stack<>();

		HashSet<Integer> visited = new HashSet<>();
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}

			st.push(src);
			while (!st.isEmpty()) {
				// remove
				int rv = st.pop();
				// Ignore
				if (visited.contains(rv)) {
					continue;
				}

				// visited Mark
				visited.add(rv);

				System.out.print(rv + " ");
				// add nbrs
				for (int key : map.get(rv).keySet()) {
					if (visited.contains(key) == false) {
						st.push(key);
					}
				}

			}

		}
	}

	public boolean isConected() {
		Stack<Integer> st = new Stack<>();
		int count = 0;
		HashSet<Integer> visited = new HashSet<>();
		for (int src : map.keySet()) {
		
			if (visited.contains(src)) {
				continue;
			}
			count++;
			//System.out.println(src);
			st.push(src);
			while (!st.isEmpty()) {
				// remove
				
				int rv = st.pop();
				
				// Ignore
				if (visited.contains(rv)) {
					continue;
				}

				// visited Mark
				visited.add(rv);

			
				// add nbrs
				for (int key : map.get(rv).keySet()) {
					if (visited.contains(key) == false) {
						st.push(key);
					}
				}
				

			}
			

		}
	
		return count == 1;
	}
	
	public ArrayList<ArrayList<Integer>> GetAllComponent(){
		Stack<Integer> st = new Stack<>();
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		HashSet<Integer> visited = new HashSet<>();
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
            ArrayList<Integer> ll = new ArrayList<>();
			st.push(src);
			while (!st.isEmpty()) {
				// remove
				int rv = st.pop();
				// Ignore
				if (visited.contains(rv)) {
					continue;
				}

				// visited Mark
				visited.add(rv);

				ll.add(rv);
				// add nbrs
				for (int key : map.get(rv).keySet()) {
					if (visited.contains(key) == false) {
						st.push(key);
					}
				}

			}
			
			ans.add(ll);

		}
		return ans;
	}

}
