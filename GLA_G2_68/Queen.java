package GLA_G2_68;

public class Queen {
	public static void main(String[] args) {
//		Queen_comb(0, 0, "", 5, 2);
//		Queen_comb_2D(0, 0, 0, "", 2, 2, 2);
		Queen_comb_2D_kill(0, 0, 0, "", 3, 3, 2, new boolean[3][3]);

	}

	public static void Queen_comb(int curr_Q, int col, String ans, int col_t, int tot_Q) {
//		+ve BC
		if (curr_Q == tot_Q) {
			System.out.println(ans);
			return;
		}
//		-ve
		if (col == col_t) {
			return;
		}
		// queen sits
		Queen_comb(curr_Q + 1, col + 1, ans + "q" + col + " ,", col_t, tot_Q);

		// queen doesnt sit
		Queen_comb(curr_Q, col + 1, ans, col_t, tot_Q);

	}

	public static void Queen_comb_2D(int curr_Q, int row, int col, String ans, int row_t, int col_t, int tot_Q) {

//		+ve BC
		if (curr_Q == tot_Q) {
			System.out.println(ans);
			return;
		}

//		to move in the next row!!
		if (col == col_t) {
			row++;
			col = 0;
		}

//		-ve!!
		if (row == row_t) {
			return;
		}

		// queen sits
		Queen_comb_2D(curr_Q + 1, row, col + 1, ans + "q{" + row + "," + col + "}, ", row_t, col_t, tot_Q);

		// queen doesnt sit
		Queen_comb_2D(curr_Q, row, col + 1, ans, row_t, col_t, tot_Q);

	}

	public static void Queen_comb_2D_kill(int curr_Q, int row, int col, String ans, int row_t, int col_t, int tot_Q,
			boolean[][] board) {

//		+ve BC
		if (curr_Q == tot_Q) {
			System.out.println(ans);
			return;
		}

//		to move in the next row!!
		if (col == col_t) {
			row++;
			col = 0;
		}

//		-ve!!
		if (row == row_t) {
			return;
		}
		if (safe(board, row, col)) {
			// when will the queen sit ?!?!?! when its safEEE
			board[row][col] = true;
			Queen_comb_2D_kill(curr_Q + 1, row, col + 1, ans + "q{" + row + "," + col + "}, ", row_t, col_t, tot_Q,
					board);
			board[row][col] = false; // Backtracking!!
		}
		// queen doesnt sit
		Queen_comb_2D_kill(curr_Q, row, col + 1, ans, row_t, col_t, tot_Q, board);

	}

	private static boolean safe(boolean[][] board, int row, int col) {
//		left!!
		for(int c = 0;c<col;c++) {
			if(board[row][c]) {
				return false;
			}
		}

//		Uppar?!!?
		for(int r = 0;r<row;r++) {
			if(board[r][col]) {
				return false;
			}
		}
//		Diagonal 1
		int r1 = row-1;
		int c1 = col-1;
		while(r1>=0&& c1>=0) {
			if(board[r1][c1]) {
				return false;
			}
			r1--;
			c1--;
		}
//		Diagonal 2
		int r2 = row-1;
		int c2 = col+1;
		while(r2>=0&& c2<board[0].length) {
			if(board[r2][c2]) {
				return false;
			}
			r2--;
			c2++;
		}
		return true;
	}
}
