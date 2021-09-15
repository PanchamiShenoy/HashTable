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
	 * this method searches for the particular key in linked list.
	 * 
	 * @param
	 * @return
	 */
	public MapNode<K, V> search(K key) {
		MapNode<K, V> temp = head;
		while (temp != null && temp.getNext() != null) {
			if (temp.getKey().equals(key)) {
				return temp;
			}
			temp = (MapNode<K, V>) temp.getNext();
		}
		return null;

	}

	/**
	 * method to print all the nodes
	 * 
	 * @return
	 */
	public String printAllNodes() {
		return "My node[ " + head + " ]";
	}

}