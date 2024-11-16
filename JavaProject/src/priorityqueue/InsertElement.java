package priorityqueue;

import java.security.cert.PolicyQualifierInfo;
import java.util.PriorityQueue;

public class InsertElement {
  public static void main(String[] args) {
	PriorityQueue p=new PriorityQueue();
	p.offer(40);
	p.offer(20); 
	p.offer(10);
	p.offer(23);
	//p.offer(null);
	//p.offer(20);
	//p.offer("Himanshu");
	
	
	
	System.out.println(p);
//	System.out.println(p.poll());
//	System.out.println(p.poll());
//	System.out.println(p.poll());
//	System.out.println(p);
	
}
}
