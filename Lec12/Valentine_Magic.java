package Lec12;

import java.util.Arrays;

public class Valentine_Magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] boy = { 2, 11, 3 };
		int girls[] = { 5, 7, 3, 2 };
		Arrays.sort(boy);
		Arrays.sort(girls);
		System.out.println(ValentineMagic(boy, girls, 0, 0));

	}

	public static int ValentineMagic(int boys[], int girls[], int i, int j) {

		if (i == boys.length) {
			return 0;
		}
		if (j == girls.length) {
			return 10000000;
		}

		int gs = Math.abs(boys[i] - girls[j]) + ValentineMagic(boys, girls, i + 1, j + 1);
		int gr = ValentineMagic(boys, girls, i, j + 1);
		return Math.min(gs, gr);

	}

}
