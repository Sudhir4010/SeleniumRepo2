package linkedlist;

import java.util.Objects;

public class Product {
	int id;
	String name;
	double price;
	
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id,name,price);
	}
	@Override
	public boolean equals(Object o) {
		Product p=(Product)o;
		return this.id==p.id && this.name==p.name && this.price==p.price;
	}
		
	}


