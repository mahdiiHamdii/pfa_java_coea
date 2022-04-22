package models;

public class Group {
	int idGroup;
	String groupName;
	int idChild,idEmployee;
	public Group(int idGroup, String groupName, int idChild, int idEmployee) {
		super();
		this.idGroup = idGroup;
		this.groupName = groupName;
		this.idChild = idChild;
		this.idEmployee = idEmployee;
	}
	
}
