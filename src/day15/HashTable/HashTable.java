package day15.HashTable;

/**
 * UC1-Ability to find frequency of words in a sentence like “To be or not to be”
 
 * UC2-Ability to find frequency of words in a large paragraph phrase 
 * “Paranoids are not paranoid because they are paranoid but because 
 * they keep putting themselves deliberately into paranoid avoidable situations”

 * UC3- Remove avoidable word from the phrase “Paranoids are not paranoid
 * because they are paranoid but because they keep putting themselves
 * deliberately into paranoid avoidable situations”
 */

/*
 * Procedure:
 * 1.Use LinkedList to do the Hash Table Operation
 * 2. Use hashcode to find index of the words in the para 
 * 3. Create LinkedList for each index and store the words and its frequency 
 * 4. Use LinkedList to do the Hash Table Operation 
 * 5. To do this create MyMapNode with Key Value Pair and create LinkedList of MyMapNode
 * 6. Use LinkedList to do the Hash Table Operation like here 
 *    the removal of word avoidable 
 */

public class HashTable {

	/**
	 * Main method for manipulation of HashTable
	 * 
	 * @param args - Default Java param (Not used)
	 */
	public static void main(String[] args) {
		HashTableImplementation<String, Integer> hashImpl = new HashTableImplementation<String, Integer>();

		/*
		 * Input data from the phrase
		 */
		String message = "Paranoids are not\r\n" + "paranoid because they are paranoid but\r\n"
				+ "because they keep putting themselves\r\n" + "deliberately into paranoid avoidable\r\n"
				+ "situations";

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

		/*
		 * Remove "avoidable" from the hashtable
		 */
		hashImpl.remove("avoidable");

		/*
		 * Display the hashtable
		 */
		System.out.println(hashImpl);

	}
}
