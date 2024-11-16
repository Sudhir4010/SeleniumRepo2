package priorityqueue;

import java.util.ArrayDeque;

public class InsertArrayDeque {
	public static void main(String[] args) {
	ArrayDeque ad=new ArrayDeque();
	ad.offer(60);
	ad.offer(20);
	ad.offer(12);
	ad.offer("hello");
	ad.offer('k');
	ad.offer(12);
	ad.offer(9);
	ad.removeFirst();
	
	System.out.println(ad.getFirst());
	System.out.println(ad.getLast());
	
	System.out.println(ad.peekLast());
	
	System.out.println(ad);
	ad.clear();
	System.out.println(ad.peekFirst());
	
	
	    
	}

}
