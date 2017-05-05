package com.string.gfg;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class isomorphic_26_09_15 {

	public static void main(String[] args) {

		String str1 = "abcab", str2 = "xyzxyz";
		fun(str1, str2);

	}

	static void fun(String str1, String str2) {
		if(str1.length()!=str2.length())
		{System.out.println("not isomorphic");
			return;
		}
		int count = 0;
		LinkedHashMap<Character, Integer> map1 = new LinkedHashMap<Character, Integer>();
		LinkedHashMap<Character, Integer> map2 = new LinkedHashMap<Character, Integer>();
		for (char x : str1.toCharArray()) {
			if (map1.get(x) == null)
				map1.put(x, 1);
			else {
				count = map1.get(x);
				map1.put(x, ++count);

			}
		}
			for (char y : str2.toCharArray()) {
				if (map2.get(y) == null)
					map2.put(y, 1);
				else {
					count = map2.get(y);
					map2.put(y, ++count);

				}

			}
			Integer[] count1 = map1.values().toArray(new Integer[map1.values().size()]);
			Integer[] count2 = map2.values().toArray(new Integer[map2.values().size()]);
//			Arrays.sort(count1);
//			Arrays.sort(count2);
			if(Arrays.equals(count1, count2))
				System.out.println("true they are isomorphic");
			else
				System.out.println("they are not isomorphic");
			
		}

	
}
