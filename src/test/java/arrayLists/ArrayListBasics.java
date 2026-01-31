package arrayLists;

import java.util.ArrayList;

public class ArrayListBasics {

	public static void main(String[] args) {
		ArrayList<Object> ar = new ArrayList<Object>();
		System.out.println(ar.size());
		ar.add(10);
		ar.add(11);
		System.out.println(ar.size());
		ar.add(1012);
		ar.add(12121);
		System.out.println(ar.size());
	}

}
