package backend;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class DBMethods {
	
	private Statement s = null;
	private Connection conn = null;
	private ResultSet rs = null;
	private FileManager fm = new FileManager();
	
	//############################################################################
	//CompareDriver Methods
	
	public int intReturnFromDB(String tableName, String fieldName, String idName, int id){
		int result = 0;
		String sqlp = "select "+fieldName+" from "+tableName+" where "+idName+" = "+ id+";";
		try {
			s = conn.createStatement();
			rs = s.executeQuery(sqlp);
			while(rs.next()) {
				result = rs.getInt(fieldName);
			}
		}catch(SQLException e) {
			System.out.println(e);
		}
		return result;
	}
	
	
	public int countRows(String tableName, String fieldName, String idName, int id){
		int result = 0;
		String sqlp = "select count("+fieldName+") as sum from "+tableName+" where "+idName+" = "+ id+";";
		try {
			s = conn.createStatement();
			rs = s.executeQuery(sqlp);
			while(rs.next()) {
				result = rs.getInt("sum");
			}
		}catch(SQLException e) {
			System.out.println(e);
		}
		return result;
	}
	

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
	
	
	public ArrayList<String> dataToArrayListString(String tableName, String fieldName){
		ArrayList<String> ids = new ArrayList<String>();
		String sqlp = "select "+fieldName+" from "+tableName+";";
		try {
			s = conn.createStatement();
			rs = s.executeQuery(sqlp);
			while(rs.next()) {
				ids.add(rs.getString(fieldName));
			}
		}catch(SQLException e) {
			System.out.println("Problem");
		}
		return ids;
	}
	
	public boolean existStuffString(String tableName, String fieldName, String find) {
		ArrayList<String> ids = dataToArrayListString(tableName, fieldName);
		int size = ids.size();
		for(int i = 0; i<size; i++) {
			if(ids.get(i).equals(find)) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	public PartTM ReadAllPart() {
		Object partTm[] = {"Jel","Pid","Name","Part IN","Price","Location", "link"};
		PartTM ptm = new PartTM(partTm, 0);
		String name="", partin="", location="", link="";
		int id=0, price=0;
		String sqlp = "select pid, partname, partin, price, location, link from part";
		Connect();
		try {
			s = conn.createStatement();
			rs = s.executeQuery(sqlp);
			while(rs.next()) {
				name = rs.getString("partname");
				partin = rs.getString("partin");
				location = rs.getString("location");
				link = rs.getString("link");
				id = rs.getInt("pid");
				price = rs.getInt("price");
				
				ptm.addRow(new Object[] {false, id, name, partin, price, location, link});
				
			}
			rs.close();
		}catch(SQLException e) {
			System.out.println("asd");
		}
		disConnect();
		return ptm;
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
	
	

	public void PrintToFileLapTime(String x, String path) {
		String track, compound, sector1, sector2, sector3 = null;
		int lid, did, sid = 0;
		String sqlp = "select lid, track, did, compound, sector1, sector2, sector3, sid from laptime";
		try {
			Connect();
			s = conn.createStatement();
			rs = s.executeQuery(sqlp);
			while(rs.next()) {
				track = rs.getString("track");
				compound = rs.getString("compound");
				sector1 = rs.getString("sector1");
				sector2 = rs.getString("sector2");
				sector3 = rs.getString("sector3");
				lid = rs.getInt("lid");
				did = rs.getInt("did");
				sid = rs.getInt("sid");
				fm.InsertLapTimes(lid, track, did, compound, sector1, sector2, sector3, sid, x, path);
			}
			rs.close();
		}catch(SQLException e) {
			System.out.println("asd");
		}
		disConnect();
	}
	

	
	
	public void PrintToFileUsers(String x, String path) {
		String name, pass, position, birthday = null;
		int uid, salary, dayoff, canedit = 0;
		String sqlp = "select uid, name, pass, salary, position, dayoff, birthday, canedit from user";
		try {
			Connect();
			s = conn.createStatement();
			rs = s.executeQuery(sqlp);
			while(rs.next()) {
				name = rs.getString("name");
				pass = rs.getString("pass");
				position = rs.getString("position");
				birthday = rs.getString("birthday");
				uid = rs.getInt("uid");
				salary = rs.getInt("salary");
				dayoff = rs.getInt("dayoff");
				canedit = rs.getInt("canedit");
				fm.InsertUser(uid, name, pass, salary, position, dayoff, birthday, canedit, x, path);
			}
			rs.close();
		}catch(SQLException e) {
			System.out.println("asd");
		}
		disConnect();
	}
	
	
	public void PrintToFileLapTimeDat(String x, String path) {
		String track, compound, sector1, sector2, sector3 = null;
		int lid, did, sid = 0;
		String sqlp = "select lid, track, did, compound, sector1, sector2, sector3, sid from laptime";
		try {
			Connect();
			s = conn.createStatement();
			rs = s.executeQuery(sqlp);
			while(rs.next()) {
				track = rs.getString("track");
				compound = rs.getString("compound");
				sector1 = rs.getString("sector1");
				sector2 = rs.getString("sector2");
				sector3 = rs.getString("sector3");
				lid = rs.getInt("lid");
				did = rs.getInt("did");
				sid = rs.getInt("sid");
				fm.InsertLapTimesDat(lid, track, did, compound, sector1, sector2, sector3, sid, x, path);
			}
			rs.close();
		}catch(SQLException e) {
			System.out.println("asd");
		}
		disConnect();
	}
	

	
	
	public void PrintToFileUsersDat(String x, String path) {
		String name, pass, position, birthday = null;
		int uid, salary, dayoff, canedit = 0;
		String sqlp = "select uid, name, pass, salary, position, dayoff, birthday, canedit from user";
		try {
			Connect();
			s = conn.createStatement();
			rs = s.executeQuery(sqlp);
			while(rs.next()) {
				name = rs.getString("name");
				pass = rs.getString("pass");
				position = rs.getString("position");
				birthday = rs.getString("birthday");
				uid = rs.getInt("uid");
				salary = rs.getInt("salary");
				dayoff = rs.getInt("dayoff");
				canedit = rs.getInt("canedit");
				fm.InsertUserDat(uid, name, pass, salary, position, dayoff, birthday, canedit, x, path);
			}
			rs.close();
		}catch(SQLException e) {
			System.out.println("asd");
		}
		disConnect();
	}
	

	
	
	
	
	
	
	public static void CustomNotification(String msg, int sign) {
		JOptionPane.showMessageDialog(null, msg, "Vigyázat!", sign);
	}
		

	
	
	
	
	//############################################################################
	//Basics Methods
	
	public void Connect(){
		try{
			String url = "jdbc:sqlite:DataBase/f1team.db";
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
	
	
	public void disConnect() {
		try {
			conn.close();
			System.out.println("Disconnected!");
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
}