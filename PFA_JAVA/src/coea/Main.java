package coea;

import services.DbConnector;

public class Main {

	public static void main(String[] args) {		
		DbConnector x =new DbConnector();
		x.seConnecter();
		String sql="INSERT INTO  coea.child(idchild,name,age,address)" + "VALUES('"+2+"','"+"sayf"+"','"+"20"+"','"+"ksar hlel"+"')";
		x.executerUpdate(sql);
	}

}
