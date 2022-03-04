package day15.HashTable;

public class Node<K, V> {
	K key;
	V value;
	Node<K, V> next;

	/**
	 * create constructor name as Node and passing key and value here
	 * 
	 * @param key
	 * @param value
	 */
	public Node(K key, V value) {
		this.key = key;
		this.value = value;
		next = null;
	}

	/**
	 * here we use getter and setter method A setter updates the value of a
	 * variable, while a getter reads the value of a variable. get key is having the
	 * return type and key set key is setting the key value
	 */

	/*
	 * get method
	 */
	public K getKey() {
		return key;
	}

	/*
	 * set method
	 */
	public void setKey(K key) {
		this.key = key;
	}

	/*
	 * get method
	 */
	public V getValue() {
		return this.value;
	}

	/*
	 * set method
	 */
	public void setValue(V value) {
		this.value = value;
	}

	/*
	 * get method
	 */
	public Node<K, V> getNext() {
		return next;
	}

	/*
	 * set method
	 */
	public void setNext(Node<K, V> next) {
		this.next = (Node<K, V>) next;
	}

	/*
	 * toString method for to return a string representation of an object.
	 */
	@Override
	public String toString() {

		/**
		 * StringBuilder class can boost performance when concatenating many strings
		 * together in a loop
		 */
		StringBuilder nodeString = new StringBuilder();
		nodeString.append(" \n Node{" + "K=").append(key).append(" V=").append(value).append("}");
		if (next != null)
			nodeString.append("->").append(next);
		return nodeString.toString();
	}
}