package backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DBMethods {
	
	private Statement s = null;
	private Connection conn = null;
	private ResultSet rs = null;
	
	

	//############################################################################
	//Methods
	
	public int makeNewID(String needTable, String nameOFTheIDFiled) {
		Connect();
		String sqlp = "select "+ nameOFTheIDFiled + " from " + needTable +";";
		ArrayList<Integer> ids = new ArrayList<Integer>();
		try {
			s = conn.createStatement();
			rs = s.executeQuery(sqlp);
			while(rs.next()) {
				ids.add(rs.getInt(nameOFTheIDFiled));
			}
		}catch(SQLException e) {
			System.out.println("Problem");
		}
		
		int newID = 0;
		int size = ids.size();
		if(size == 0) {
			newID = 1;
		}else {
			newID = ids.get(size-1) + 1;
		}
		return newID;
	}
	
	
	
	
	public boolean existStuffInt(String tableName, String fieldName, int find) {
		ArrayList<Integer> ids = dataToArrayListInt(tableName, fieldName);
		int size = ids.size();
		for(int i = 0; i<size; i++) {
			if(ids.get(i) == find) {
				return true;
			}
		}
		return false;
	}
	
	public ArrayList<Integer> dataToArrayListInt(String tableName, String fieldName){
		ArrayList<Integer> ids = new ArrayList<Integer>();
		String sqlp = "select "+fieldName+" from "+tableName+";";
		try {
			s = conn.createStatement();
			rs = s.executeQuery(sqlp);
			while(rs.next()) {
				ids.add(rs.getInt(fieldName));
			}
		}catch(SQLException e) {
			System.out.println("Problem");
		}
		return ids;
	}
	
	
	public int signIn(String name, String pswd) {
		Connect();
		int pc = -1;
		String sqlp = "select count(*) pc from user where name ='"+name+"' and pass='"+pswd+"';";
		try {
			s = conn.createStatement();
			rs = s.executeQuery(sqlp);
			while(rs.next()) {
				pc = rs.getInt("pc");
			}
			rs.close();
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return pc;
	}
	
	
	
	public void CommandExecute(String str) {
		Connect();
		String sqlp = str;
		try {
			s = conn.createStatement();
			s.execute(sqlp);
		}catch(SQLException e) {
			System.out.println("Problem: " + e);
		}
		
	}
	
	
	
	//############################################################################
	//Basics Methods
	
	public void Connect(){
		try{
			String url = "jdbc:sqlite:C:/Users/Marci/Documents/Egyetem (BSC)/4. félév/Adatbázis rendszerk II/DatabaseGyak01/f1team.db";
			conn = DriverManager.getConnection(url);
			System.out.println(" OK!");
		}catch(SQLException e) {
			System.out.println("JDBC Connect: " + e.getMessage());
		}
		
	}
	
	public void Reg() {
		try {
			Class.forName("org.sqlite.JDBC");
			System.out.println("Sikeres driver regisztráció!");
		}catch(ClassNotFoundException e){
			System.out.println("hibás driver regisztráció!" +e.getMessage());
		}
	}
	
}
