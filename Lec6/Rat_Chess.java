package Lec6;

import java.util.Scanner;

public class Rat_Chess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char [][] maze = new char [n][m];
		for (int i = 0; i < maze.length; i++) {
			
			String str = sc.next();
			for (int j = 0; j < str.length(); j++) {
				maze[i][j]=str.charAt(j);
				
			}
			
		}
		
		

	}

}
