package Lec28;

import java.util.ArrayList;
import java.util.HashMap;

public class Intersection_of_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 3, 7, 2, 4, 6,  1, 2 };
		int[] arr2 = { 3, 7, 11, 1, 3, 3, 2 };
		intersection(arr1, arr2);

	}

	public static int[] intersection(int[] nums1, int[] nums2) {

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums1.length; i++) {
			if (map.containsKey(nums1[i])) {
				map.put(nums1[i], map.get(nums1[i]) + 1);
			} else {
				map.put(nums1[i], 1);
			}

		}
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(map.containsKey(8));
		for (int i = 0; i < nums2.length; i++) {
			if(map.containsKey(nums2[i])  && map.get(nums2[i])>0) {
				list.add(nums2[i]);
				map.put(nums2[i], map.get(nums2[i])-1);
			}
			
		}
		
		int [] arr = new int [list.size()];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=list.get(i);
		}
		return arr;

	}
}
