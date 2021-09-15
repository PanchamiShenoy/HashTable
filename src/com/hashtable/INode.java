package com.hashtable;

public interface INode<K> {

	K getKey();

	public void setkey(K key);

	public void setNext(INode<K> next);

	public INode<K> getNext();

}