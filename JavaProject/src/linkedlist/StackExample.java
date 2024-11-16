package linkedlist;


import java.util.Stack;

public class StackExample {
 public static void main(String[] args) {
	 Stack<Object> s=new Stack<Object>();
	 s.push(10);
	 s.push(20);
	 s.push(30);
	 s.push(40);
	 
      System.out.println(s);
	 s.pop();
	 
	 System.out.println(s);
	 s.pop();
	// System.out.println(s);
	 
	 System.out.println(s.peek());
	 System.out.println(s.isEmpty());
	 System.out.println(s.search(40));
	
	 
	 
	// for(Object o:s) {
		// System.out.println(o);
	 }
			 
	  
		 
  }

	 


