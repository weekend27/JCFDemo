package overview;

import java.util.ArrayList;

public class GenericsTest {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void explicit() {
		//JDK 1.4 or before
		ArrayList list = new ArrayList<>();
		list.add(new String("Java"));
		list.add(new String("Clojure"));
		list.add(new String("Scala"));
		for (int i = 0; i < list.size(); i++) {
			String lang = (String) list.get(i);
			System.out.println(lang.toUpperCase());
		}
	}
	
	public static void implicit() {
		//JDK 1.5 or latter
		ArrayList<String> list = new ArrayList<>();
		list.add(new String("Java"));
		list.add(new String("Clojure"));
		list.add(new String("Scala"));
		for (int i = 0; i < list.size(); i++) {
			String lang = list.get(i);
			System.out.println(lang.toUpperCase());
		}
	}

	public static void main(String[] args) {
		explicit();
		implicit();
	}

}
