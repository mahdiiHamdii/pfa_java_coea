package models;

import services.DbConnector;

public class Child extends Person {
	String note;
	DbConnector database;	
	
	public Child(int id, String name, int age, String address,String note) {
		super(id, name, age,address);
		this.note=note;
		database=new DbConnector();
		database.seConnecter();
	}
	
	public void addChild(){	
		String sql="INSERT INTO  coea.child(name,age,address,note) VALUES('"+name+"','"+age+"','"+address+"','"+note+"')";
		database.executerUpdate(sql);
	}
	
}
