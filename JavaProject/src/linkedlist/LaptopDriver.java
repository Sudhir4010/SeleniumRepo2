package linkedlist;

import java.util.HashSet;

public class LaptopDriver {
	public static void main(String[] args) {
		Laptop l1= new Laptop("Lenvo", "intel", 1);
		Laptop l2= new Laptop("Asus", "amd", 2);
		Laptop l3= new Laptop("hp", "octa", 3);
		Laptop l4= new Laptop("hp", "octa", 3);
		Laptop l5= new Laptop("Lenvo", "intel", 1);
		
		HashSet<Laptop> hs=new HashSet<Laptop>();
		hs.add(l1);
		hs.add(l2);
		hs.add(l3);
		hs.add(l4);
		hs.add(l5);
		
		System.out.println(hs);
	}

}
