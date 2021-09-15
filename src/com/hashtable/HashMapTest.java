package com.hashtable;

public class HashMapTest {

	public static void main(String[] args) {
		String sentance = "To be or not to be";
		HashMap<String, Integer> myHashMap = new HashMap<>();
		String words[] = sentance.toLowerCase().split(" ");
		for (String string : words) {
			Integer value = myHashMap.get(string);
			if (value == null) {
				value = 1;

			} else {
				value = value + 1;
			}
			myHashMap.add(string, value);

		}
		System.out.println(myHashMap);
	}

}
