package com.hashtable;

import java.util.ArrayList;

public class LinkedHashMap<K, V> {

	private final int bucketSize;
	ArrayList<LinkedList<K, V>> bucketList;

	LinkedHashMap() {
		bucketSize = 10;
		bucketList = new ArrayList<>(bucketSize);
		for (int i = 0; i < bucketSize; i++) {
			bucketList.add(null);
		}
	}

	/**
	 * method to return bucket index using hashcode
	 * 
	 * @param
	 * @return
	 */
	public int getBucketIndex(K key) {
		int hashCode = Math.abs(key.hashCode());
		int index = hashCode % bucketSize;
		return index;

	}

	/**
	 * method to add new or update key value pair
	 * 
	 * @param key
	 * @param value
	 */
	public void add(K key, V value) {
		int index = getBucketIndex(key);
		LinkedList<K, V> myLinkedList = bucketList.get(index);
		if (myLinkedList == null) {
			myLinkedList = new LinkedList<>();
			bucketList.set(index, myLinkedList);
		}
		MapNode<K, V> myMapNode = myLinkedList.search(key);
		if (myMapNode == null) {
			myMapNode = new MapNode<>(key, value);
			myLinkedList.append(myMapNode);
		}
		myMapNode.setValue(value);
	}

	/*
	 * method to delete the specified key
	 */
	public void deleteWord(K key) {
		int index = getBucketIndex(key);
		LinkedList<K, V> myLinkedList = bucketList.get(index);
		if (myLinkedList == null) {
			return;
		}
		MapNode<K, V> myMapNode = myLinkedList.search(key);
		if (myMapNode == null) {
			return;
		}

		else {
			myLinkedList.pop(myMapNode);
			System.out.println("Deleted successfully");
		}
	}

	/**
	 * method to return value associated with key
	 * 
	 * @param
	 * @return
	 */
	public V get(K key) {
		int index = getBucketIndex(key);
		LinkedList<K, V> myLinkedList = bucketList.get(index);
		if (myLinkedList == null) {
			return null;
		}
		MapNode<K, V> myMapNode = myLinkedList.search(key);
		if (myMapNode == null) {
			return null;
		}
		return myMapNode.getValue();
	}

	public String toString() {
		return "MyLinkedHashMap List{" + bucketList + '}';
	}

}