package com.hashtable;

public class LinkedHashMaptest {

	public static void main(String[] args) {
		String s = "“Paranoids are not paranoid because they are paranoid but because "
				+ "they keep putting themselves deliberately into paranoid avoidable situations";
		LinkedHashMap<String, Integer> LinkedHashMap = new LinkedHashMap<>();
		String words[] = s.toLowerCase().split(" ");
		for (String str : words) {
			Integer value = LinkedHashMap.get(str);
			if (value == null) {
				value = 1;

			} else {
				value = value + 1;
			}
			LinkedHashMap.add(str, value);
		}
		System.out.println(LinkedHashMap);
		LinkedHashMap.deleteWord("avoidable");
		System.out.println(LinkedHashMap);

	}
}