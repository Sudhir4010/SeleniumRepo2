package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class InsertElement {
   public static void main(String[] args) {
	LinkedList l=new LinkedList();
	l.add(10);
	l.add(20);
	l.add(null);
	l.add(null);
	l.add("hello");
	
	System.out.println(l);
	System.out.println(l.get(2));
	
	Iterator i=l.iterator();
	
	while(i.hasNext()) {
		System.out.println(i.next());
	}

    }
}
