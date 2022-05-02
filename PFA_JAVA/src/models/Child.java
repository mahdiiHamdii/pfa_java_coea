package models;

public class Child extends Person {
	String note;
	protected Child(int id, String name, int age, String address,String note) {
		super(id, name, age, address);
		this.note=note;

	}
}
