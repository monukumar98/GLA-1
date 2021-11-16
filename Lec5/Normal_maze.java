package Lec5;

public class Normal_maze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] maze = new boolean[3][3];
		maze_path2(maze, 0, 0);

	}

	public static void maze_path2(boolean[][] maze, int cr, int cc) {
		if (cr == maze.length-1 && cc == maze[0].length-1) {
			maze[cr][cc]=true;
			display(maze);
			 maze[cr][cc]=false;
			
			return;

		}
		if (cr < 0 || cr >= maze.length || cc < 0 || cc >= maze[0].length || maze[cr][cc]==true) {
			return;
		}

		int[] r = { 0, 1, 0, -1 };
		int[] c = { 1, 0, -1, 0 };
          maze[cr][cc]=true;//visted 
		for (int i = 0; i < c.length; i++) {
			maze_path2(maze, cr + r[i], cc + c[i]);

		}
		 maze[cr][cc]=false;
		 

	}

	public static void display(boolean[][] maze) {
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[0].length; j++) {
				System.out.print(maze[i][j] + " ");
			}
			System.out.println();

		}
		System.out.println();
	}

}
