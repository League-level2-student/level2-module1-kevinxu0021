package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings
		// Don't forget to import the ArrayList class
		ArrayList<String> string = new ArrayList<String>();

		// 2. Add five Strings to your list
		string.add("a");
		string.add("b");
		string.add("c");
		string.add("d");
		string.add("e");

		// 3. Print all the Strings using a standard for-loop
		for (int i = 0; i < string.size(); i++) {
			System.out.println(string.get(i));
		}

		System.out.println("\n");
		// 4. Print all the Strings using a for-each loop
		for (String s : string) {
			System.out.println(s);
		}

		System.out.println("\n");
		// 5. Print only the even numbered elements in the list.
		for (int i = 0; i < string.size(); i++) {
			if (i % 2 == 1) {
				System.out.println(string.get(i));
			}
		}

		System.out.println("\n");
		// 6. Print all the Strings in reverse order.
		for (int i = string.size() - 1; i >= 0; i--) {
			System.out.println(string.get(i));
		}

		System.out.println("\n");
		// 7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < string.size(); i++) {
			if (string.get(i).contains("e")) {
				System.out.println(string.get(i));
			}
		}
	}
}
