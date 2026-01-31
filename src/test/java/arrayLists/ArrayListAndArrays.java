package arrayLists;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListAndArrays {

	public static void main(String[] args) {

		// https://www.youtube.com/watch?v=NbYgm0r7u6o

		String[] friendsArray = { "zero", "one", "two", "three" };

		/*
		 * System.out.println(friendsArray[10]);
		 * 
		 * Error: Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
		 * Index 10 out of bounds for length 4 at
		 * arrayLists.ArrayListAndArrays.main(ArrayListAndArrays.java:11)
		 * 
		 */

		ArrayList<String> FriendsArrayList = new ArrayList<>(Arrays.asList("0", "1", "2", "3"));

	}

}
