package Lec29;

import java.util.*;

public class Group_Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println(groupAnagrams(str));

	}

	public static List<List<String>> groupAnagrams(String[] strs) {

		HashMap<String, List<String>> map = new HashMap<>();
		for (int i = 0; i < strs.length; i++) {
			int[] frq = new int[26];
			for (int j = 0; j < strs[i].length(); j++) {
				char ch = strs[i].charAt(j);
				frq[ch - 'a'] = frq[ch - 'a'] + 1;

			}
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < frq.length; j++) {
				sb.append(frq[j]+" ");
			}
			String s = sb.toString();

			if (!map.containsKey(s)) {
				map.put(s, new ArrayList<>());
			}
			map.get(s).add(strs[i]);

		}

		List<List<String>> list = new ArrayList<>();
		//System.out.println(map);
		list.addAll(map.values());
		return list;

	}

}
