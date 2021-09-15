package com.hashtable;

public class HashMap<K, V> {
	LinkedList<K, V> myLinkedList;

	HashMap() {
		myLinkedList = new LinkedList<>();
	}

	/**
	 * method to add new node to linkedlist
	 * 
	 * @param key
	 * @param value
	 */
	public void add(K key, V value) {
		MapNode<K, V> myMapNode = myLinkedList.search(key);
		if (myMapNode == null) {
			MapNode<K, V> newNode = new MapNode<>(key, value);
			myLinkedList.append(newNode);
		} else {
			myMapNode.setValue(value);
		}
	}

	/**
	 * method to get value related to given key
	 * 
	 * @param key
	 * @return
	 */
	public V get(K key) {
		MapNode<K, V> myMapNode = myLinkedList.search(key);
		if (myMapNode == null) {
			return null;
		}
		return myMapNode.getValue();
	}

	// @Override
	public String toString() {
		return "MyHashMap [myLinkedList=" + myLinkedList + "]";
	}
}