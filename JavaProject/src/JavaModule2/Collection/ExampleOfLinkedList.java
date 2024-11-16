package JavaModule2.Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class ExampleOfLinkedList {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("Himanshu");
		l.add(50);
		l.add(null);
		l.add("Sudhir");
		System.out.println(l);
		l.add(2, 40);
		System.out.println(l);
		System.out.println(l.get(3));
		
		Iterator i=l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
