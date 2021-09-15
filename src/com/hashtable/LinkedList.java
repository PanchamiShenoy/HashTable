package com.hashtable;

public class LinkedList<K, V> {

	MapNode<K, V> head;
	MapNode<K, V> tail;

	/**
	 * Adds a new node at the end of linked list.
	 * 
	 * @param newNode
	 */
	public void append(MapNode<K, V> newNode) {
		if (this.head == null) {
			this.head = newNode;
		}
		if (this.tail == null) {
			this.tail = newNode;
		} else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}

	/**
	 * method searches for the particular key in linked list.
	 * 
	 * @param
	 * @return
	 */
	public MapNode<K, V> search(K key) {
		MapNode<K, V> temp = head;
		while (temp != null) {
			if (temp.getKey().equals(key)) {
				return temp;
			}
			temp = (MapNode<K, V>) temp.getNext();
		}
		return null;

	}

	/**
	 * @return all the content of linked list in string format
	 */

	public String toString() {
		return "My node[ " + head + " ]";
	}

}