package linkedlist;

import java.util.HashSet;

public class ProductDriver {
	  public static void main(String[] args) {
		Product p1=new Product(1,"Laptop",45000);
		Product p2=new Product(2,"phone",55000);
		Product p3=new Product(2,"phone",55000);
		
		HashSet<Product> hs=new HashSet<Product>();
		hs.add(p1);
		hs.add(p2);
		hs.add(p3);
		
		System.out.println(hs);
	}

}
