package day15.HashTable;

/**
 * Ability to find frequency of words in a sentence like “To be or not to be”
 * Use LinkedList to do the Hash Table Operation To do this we create MyMapNode
 * with Key Value Pair and create LinkedList of MyMapNode
 */
public class HashTable {

	/**
	 * Main method for manipulation of HashTable
	 * 
	 * @param args - Default Java param (Not used)
	 */
	public static void main(String[] args) {
		HashTableImplementation<String, Integer> hashImpl = new HashTableImplementation<String, Integer>();
		String message = "To be or not to be";

		/*
		 * Split the words when a white space comes up and Convert all the words in
		 * lowercase
		 */
		String[] messageArray = message.toLowerCase().split(" ");

		for (String word : messageArray) {
			/*
			 * Search for the word in the linked list
			 */
			Integer value = hashImpl.get(word);
			/*
			 * If not found, frequency of the word StayWith 1
			 */
			if (value == null)
				value = 1;
			else
				/*
				 * If found, frequency of the word increases by 1
				 */
				value = value + 1;
			hashImpl.add(word, value);
		}
		System.out.println(hashImpl);
	}
}
