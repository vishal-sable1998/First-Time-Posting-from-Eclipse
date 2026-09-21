package Collections;
import java.util.ArrayList;

public class ArrayLi {
	public static void main(String[] args) {
		
		ArrayList li= new ArrayList();
		li.add("Test");
		li.add(452);
		li.add(true);
		li.addFirst("Rama");
		System.out.println(li);
		ArrayList li1= new ArrayList();
		li1.add("Ramesh");
		li1.add(9594);
		li1.add("Rahate");
		System.out.println(li1);
		boolean tes=li.addAll(li1);
		System.out.println(tes);
		System.out.println(li.removeAll(li1));;

	}

}
