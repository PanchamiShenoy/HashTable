package com.hashtable;

public class MapNode<K, V> implements INode<K> {
	private K key;
	private V value;
	private MapNode<K, V> next;

	MapNode(K key, V value) {
		this.key = key;
		this.value = value;
		next = null;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public K getKey() {

		return this.key;
	}

	@Override
	public void setkey(K key) {
		this.key = key;

	}

	@Override
	public void setNext(INode<K> next) {
		this.next = (MapNode<K, V>) next;

	}

	@Override
	public INode<K> getNext() {

		return this.next;
	}

	/**
	 * Prints the nodes using StringBuilder
	 */
	public String toString() {
		StringBuilder myMapNodeString = new StringBuilder();
		myMapNodeString.append("MyMapNode{" + "key= ").append(key).append(", Value = ").append(value).append('}');
		if (next != null) {
			myMapNodeString.append("->").append(next);
		}
		return myMapNodeString.toString();
	}

}
