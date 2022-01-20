package Lec12;

import java.util.*;

public class Trinangle_LeetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int minimumTotalRec(List<List<Integer>> triangle, int cc, int cr) {
		if (cr == triangle.size() - 1) {
			return triangle.get(cr).get(cc);
		}
		int c1 = minimumTotalRec(triangle, cc, cr + 1);// next row me ith index
		int c2 = minimumTotalRec(triangle, cc + 1, cr + 1);// next row me ith+1 index

		return Math.min(c1, c2) + triangle.get(cr).get(cc);

	}

}
