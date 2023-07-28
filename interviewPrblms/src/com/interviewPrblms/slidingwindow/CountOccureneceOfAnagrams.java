package com.interviewPrblms.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class CountOccureneceOfAnagrams {

	public static void countOccurence(String s1, String s2) {
		Map<Character, Integer> map1 = new HashMap<>();
		for (int i = 0; i < s1.length(); i++) {
			if (map1.containsKey(s1.charAt(i))) {
				Integer value = map1.get(s1.charAt(i));
				map1.replace(s1.charAt(i), value++);
			} else {
				map1.put(s1.charAt(i), 1);
			}
		}
		System.out.println(map1);

		int srt = 0;
		int end = 0;
		int count=0;
		Map<Character, Integer> map2;
		map2 = new HashMap<>(map1);
		while (end < s2.length()) {
			Character c = s2.charAt(end);
			if (end - srt + 1 < s1.length()) {
				if (map2.containsKey(c)) {
					Integer val = map2.get(c);
					map2.replace(c, --val);

				}
				end++;
				continue;
			}
			System.out.println(map2);
			if (end - srt + 1 == s1.length()) {
				Character cc = s2.charAt(end);
				if (map2.containsKey(cc)) {
					Integer val = map2.get(cc);
					map2.replace(cc, --val);
				}
				boolean flag = true;
				for (Map.Entry<Character, Integer> val : map2.entrySet()) {
					if (val.getValue() > 0) {
						flag = false;
						break;
					}
				}
				if(flag) {
					count++;
				}
				end++;
				srt++;
				map2=map1;

			}

		}
		System.out.println(count);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "for";
		String s2 = "xforaorfor";
		countOccurence(s1, s2);

	}

}
