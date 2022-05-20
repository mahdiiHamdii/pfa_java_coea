package models;

import java.util.ArrayList;

import services.DbConnector;

public class Employee extends Person {
	String note;
	String key;
	DbConnector database;
	
	protected Employee(int id, String name, int age, String address,String key,String note) {
		super(id, name, age, address);
		this.note=note;
		this.key=key;
		database=new DbConnector();
		database.seConnecter();
	}
	
	public void addEmployee(){	
		String sql="INSERT INTO  coea.employee(name,age,address,key,note) VALUES('"+name+"','"+age+"','"+address+"','"+key+"','"+note+"')";
		database.executerUpdate(sql);
	}
	
	public void removeEmployee(DbConnector database,int id){		
		String sql="delete * from coea.employee where id ='"+id+"'";
		database.executerUpdate(sql);
	}
	
	public ArrayList<Object> viewGroups() {
		return null;
	}
	
	public ArrayList<Object> viewPlan() {
		return null;
	}
	
	public void addNoteToChild(Child child,String note) {
		String sql="INSERT INTO  coea.child(note) VALUES('"+note+"') where id='"+child.id+"'";
		database.executerUpdate(sql);
	}
	
	public ArrayList<Object> viewChild() {
		return null;
	}
	
	public String viewNote() {
		return null;
	}
}
