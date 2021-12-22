package collection;

import java.util.Arrays;

public class CollectionArraylListTester {

	public static void main(String[] args) {

		System.out.println("Written by Michelle Almendarez");

		CollectionADT<Integer> c1 = new CollectionArray<Integer>();
		System.out.println("c1 is a new CollectionArray");
		System.out.println("c1 : " + c1 + "\n");
		c1.add(2);
		c1.add(-3);
		System.out.println("This is after adding 2 and -3");
		System.out.println("c1: " + c1);
		
		Integer[] a = { 2,-3,5,-7,11,-13,17,-19};
		Integer[] b = { -2,3,-5,7,-11,13,-17,19};
		for(int i =0; i < a.length; i++){
			c1.add(a[i]);
		}
		System.out.println("After adding " + Arrays.toString(a));
		System.out.println("c1: " + c1);
		System.out.println("Result of contains on " + Arrays.toString(a));
		for(int i =0; i < a.length; i++){
			System.out.println(" " + c1.contains(a[i]));
			
		}
		System.out.println();
		//lab
//		String[] array1 = { "yo", "guys", "this ", "is", "Fun" };
//		CollectionADT<String> collection1 = new CollectionArray<String>();
//		fill(collection1, array1);
//		System.out.println(collection1);
//		String[] array2 = { "yo", "guys", "this", "is", "like", "way", "fun" };
//		containsArray(collection1, array2);
//		CollectionArray<Integer> collection2 = new CollectionArray<Integer>();
//		collection2.add((Integer) 4);

	}
//lab
	public static void fill(CollectionADT<String> list, String[] array) {
		for (int k = 0; k < array.length; k++) {
			list.add(array[k]);
		}
	}
//lab
	public static void containsArray(CollectionADT<String> list, String[] array) {
		for (int k = 0; k < array.length; k++) {
			System.out.println("List contains\"" + array[k] + "\"?"
					+ list.contains(array[k]));
		}
	}

}
