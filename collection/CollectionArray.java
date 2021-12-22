package collection;
import java.util.*;
public class CollectionArray<T>implements CollectionADT<T> {

private ArrayList<T> arraylist;
	private T[] array;
	private int size;
	public CollectionArray(){
		arraylist = new ArrayList<T>();
		array = (T[])new Object[1];//correct
		//array = new T[1]; does not work
	}
	public boolean add(T element) {
		if(size == array.length)resize();
		array[size] = element;
		size ++;
		//return arraylist.add(element);
		return true;
	}

	
	private void resize() {
		//newarray has twice the length
		T[] newarray = (T[])new Object[2*array.length];
		//copy the elements with for loop
		for (int i =0; i< size; i++){
			newarray[i] = array[i];
		}
		array = newarray;
				
	}
	public boolean contains(T element) {
		for(int i = 0; i < size; i++){
			if (element.equals(array[i])){
				return true;
			}
		}
		return false;
		//lab
		//return arraylist.contains(element);
	}


	public Iterator<T> iterator() {
		
		return arraylist.iterator();
	}


	public boolean remove(T element) {
		
		return arraylist.remove(element);
	}

	
	public int size() {
	
		return arraylist.size();
	}
	//lab
//	public String toString(){
//		String toreturn = "";
//		for(int k =0;k < arraylist.size();k++ ){
//			toreturn += arraylist.get(k) + "";
//			
//		}
//		
//		return toreturn;
		
		//This is O(n^2) because 
		//1 + 2 + 3 +.... + n is about n^2/ 2
		//almost any tostring you write in class will be a O(n^2)
		//because when you make a copy of the string creates more work
		//with for loop
		public String toString(){
			//String result = this.getClass() + " [";
			String result = "[";
			for (int i = 0; i < size; i++){
				result += " " + array[i];
			}
		return result + " ] ";
		}
	
		
		
		
		
		
	}

