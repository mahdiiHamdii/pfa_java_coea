package models;

import java.util.ArrayList;

public class Employee extends Person {
	protected Employee(int id, String name, int age, String address) {
		super(id, name, age, address);

	}
	public ArrayList<Object> viewGroups() {
		return null;
	}
}
