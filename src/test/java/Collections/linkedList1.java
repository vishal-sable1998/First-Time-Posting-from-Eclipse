package Collections;

import java.util.LinkedList;

public class linkedList1 {

	public static void main(String[] args) {
		LinkedList li= new LinkedList();
		li.addFirst("Test");
		li.addLast("Data");
		li.add(7840);
		li.add(true);
		System.out.println(li.getFirst());
		System.out.println(li.getLast());

	}

}
