package overview;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
	
	public static void oldIterator() {
		// visit a list with iterator
		ArrayList<String> list = new ArrayList<>();
		list.add(new String("Java"));
		list.add(new String("Clojure"));
		list.add(new String("Scala"));
		Iterator<String> it = list.iterator();		// get iterator
		while (it.hasNext()) {
			String lang = it.next();		// access elements
			System.out.println(lang.toUpperCase());
		}
	}
	
	public static void newIterator() {
		// visit a list with enhanced for-loop
		ArrayList<String> list = new ArrayList<>();
		list.add(new String("Java"));
		list.add(new String("Clojure"));
		list.add(new String("Scala"));
		for (String lang : list) {
			System.out.println(lang.toUpperCase());
		}
	}

	public static void main(String[] args) {
		oldIterator();
		newIterator();
	}

}
