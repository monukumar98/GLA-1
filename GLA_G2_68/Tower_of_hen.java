package GLA_G2_68;

import java.util.ArrayList;
import java.util.List;

public class Tower_of_hen {
	static List<Integer> A = new ArrayList<>();
	static List<Integer> B = new ArrayList<>();
	static List<Integer> C = new ArrayList<>();
	public static void main(String[] args) {
//		TW(3, 'A', 'C', 'B');
		 A = new ArrayList<>();
		B = new ArrayList<>();
		C = new ArrayList<>();
		A.add(3);
		A.add(2);
		A.add(1);
		
		TW_AL(3, A, C, B);
	}

	public static void TW(int disk, char src, char dest, char help) {
		if(disk==0) {
			return;
		}
		TW(disk - 1, src, help, dest);
//		Move last disk from A to C
		System.out.println("Move disk "+disk+ " from "+src + " to "+dest);
		TW(disk-1, help, dest, src);
	}
	public static void TW_AL(int disk, List<Integer> src, List<Integer>  dest, List<Integer>  help) {
		if(disk==0) {
			return;
		}
		TW_AL(disk - 1, src, help, dest);
//		System.out.println("Move disk "+disk+ " from "+src + " to "+dest);
		
//		remove disk from src and shift to dest!!
		src.remove(src.size()-1);
		dest.add(disk);
//		
		System.out.println(A+"=="+B+"=="+C);
		TW_AL(disk-1, help, dest, src);
	}
}
