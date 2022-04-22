package models;

import java.util.ArrayList;

public class Employee extends Person {
	protected Employee(int id, String name, int age, String address) {
		super(id, name, age, address);

	}
	public ArrayList<Object> viewGroups() {
		return null;
	}
	
	public ArrayList<Object> viewPlan() {
		return null;
	}
	
	public void addNote() {
		
	}
	
	public ArrayList<Object> viewChild() {
		return null;
	}
	
	public String viewNote() {
		return null;
	}
}
