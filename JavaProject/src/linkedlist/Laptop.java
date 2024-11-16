package linkedlist;

import java.util.Objects;

public class Laptop {
	 String brnad;
	 String processor;
	 int id;
	public Laptop(String brnad, String processor, int id) {
		super();
		this.brnad = brnad;
		this.processor = processor;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Laptop [brnad=" + brnad + ", processor=" + processor + ", id=" + id + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(brnad, id, processor);
	}
	@Override
	public boolean equals(Object obj) {
		Laptop l = (Laptop) obj;
		return this.brnad==l.brnad && this.id==l.id && this.processor==l.processor;
	}
	 

}
