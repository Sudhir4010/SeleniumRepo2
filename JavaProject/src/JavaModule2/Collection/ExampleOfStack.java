package JavaModule2.Collection;

import java.util.Stack;

public class ExampleOfStack {
	 public static void main(String[] args) {
		 Stack s=new Stack();
		 s.push(20);
		 s.push(30);
		 s.push(40);
		 s.push(50);
		 s.push(60);
		 
		 System.out.println(s);
		 System.out.println(s.peek());
		 System.out.println(s.isEmpty());
		
		 System.out.println(s.search(50));
		 s.push("sudhir");
		
		 System.out.println(s);
		 System.out.println(s.search("sudhir"));
		 
		 
		 
	}

}
