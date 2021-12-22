package collection;

import java.util.Iterator;

public interface CollectionADT <T>extends Iterable<T> {
	   public boolean add(T element); // Adds the element to the collection
	   public boolean remove(T element); // Removes the element, returns true if successful
	   public boolean contains(T element); // Returns true if the element is in the collection
	   public int size(); // Returns the number of elements in the collection
	   public Iterator<T> iterator(); // Returns an iterator over all the elements
	   public String toString(); // Returns a string representation of the collection
	   
	   
	   
	   
	 }



