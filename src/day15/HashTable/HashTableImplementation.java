package day15.HashTable;

public class HashTableImplementation<K, V> {
	Node head;
	Node tail;

	/**
	 * create method add to adding the value of the pair (K,V)key and value
	 * 
	 * @param key-key     represents K
	 * @param value-value represents V
	 */
	public void add(K key, V value) {
		Node<K, V> myNode = searchNode(key);
		if (myNode == null) {
			myNode = new Node<K, V>(key, value);
			this.append(myNode);
		} else {
			myNode.setValue(value);
		}
	}

	/**
	 * create method append to add the value in the linked list
	 * 
	 * @param myNode-value to append
	 */
	public void append(Node<K, V> myNode) {
		if (this.head == null)
			this.head = myNode;
		if (this.tail == null)
			this.tail = myNode;
		else {
			this.tail.setNext(myNode);
			this.tail = myNode;
		}
	}

	/**
	 * Purpose: Method to searching Node in the Linked List.
	 * 
	 * @return -return to the currentNode
	 */
	public Node<K, V> searchNode(K data) {
		Node<K, V> currentNode = head;
		int position = 0;
		while (currentNode != null) {
			position++;
			if (currentNode.getKey().equals(data)) {
				return currentNode;
			}
			currentNode = currentNode.getNext();
		}
		return currentNode;
	}

	/**
	 * 
	 * @param word- Searching for the word and get the value from the linked list
	 * @return
	 */
	public V get(K word) {
		Node<K, V> myMapNode = searchNode(word);
		if (myMapNode == null) {
			return null;
		} else {
			return myMapNode.getValue();
		}

	}

	/**
	 * Remove avoidable word from the phrase By using K word it will find the
	 * particular word from the hashtable and from remove method will it
	 * 
	 * @param word- remove word
	 */
	public void remove(K word) {
		Node currentNode = head;
		Node previousNode = null;
		while (currentNode != null && currentNode.getKey().equals(word)) {
			head = currentNode.getNext();
			return;
		}
		while (currentNode != null && !(currentNode.getKey().equals(word))) {
			previousNode = currentNode;
			currentNode = currentNode.getNext();
		}
		if (currentNode != null) {
			previousNode.next = currentNode.next;
		}
		if (currentNode == null)
			System.out.println("Word not found!");
	}

	/*
	 * Print the linked list
	 */
	@Override
	public String toString() {
		return "MyLinkedListNodes{" + head + "} ";
	}
}
