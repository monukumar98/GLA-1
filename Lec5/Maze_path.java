package Lec5;
public class Maze_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 3;
		int col = 3;
		mazepath(0, 0, row, col, "");

	}

	public static void mazepath(int cr, int cc, int er, int ec, String ans) {
		if (cr == er - 1 && cc == ec - 1) {
			System.out.println(ans);
			return;
		}

		if (cr >= er || cc >= ec) {
			return;
		}

		mazepath(cr, cc + 1, er, ec, ans + "H");// Hor
		mazepath(cr + 1, cc, er, ec, ans + "V");// Ver

	}

}
