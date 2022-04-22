package models;

public class Note {
	int noteId;
	String noteDescription;
	int idChild, idEmployee;
	public Note(int noteId, String noteDescription, int idChild, int idEmployee) {
		super();
		this.noteId = noteId;
		this.noteDescription = noteDescription;
		this.idChild = idChild;
		this.idEmployee = idEmployee;
	}
	
}
