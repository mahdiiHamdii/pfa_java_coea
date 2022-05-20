package models;
// This class is just used to group certain entities // 
abstract class Person {
	protected int id;
	protected String name;
	protected int age;
	protected String address;
	protected Person(int id, String name, int age, String address) {		
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	
	
	
}
