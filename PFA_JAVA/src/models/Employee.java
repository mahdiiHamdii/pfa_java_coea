package models;

import java.util.ArrayList;

public class Employee extends Person {
	String note;
	protected Employee(int id, String name, int age, String address,String note) {
		super(id, name, age, address);
		this.note=note;
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
