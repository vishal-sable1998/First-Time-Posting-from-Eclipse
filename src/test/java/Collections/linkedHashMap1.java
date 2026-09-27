package Collections;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class linkedHashMap1 {

	public static void main(String[] args) {
		LinkedHashMap l= new LinkedHashMap();
		l.put(1,"TEst");
		l.put(2, "Data");
		l.put(5,"Five");
		l.put(4,"Four");
		System.out.println(l);
		l.putFirst(10,"TEsn");
		l.putLast(3,"three");
		System.out.println(l);
		
		TreeMap t= new TreeMap(l);
		System.out.println(t);
		

	}

}
