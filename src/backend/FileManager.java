package backend;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintStream;

public class FileManager {
	
	
	//############################ .csv / .txt Methods ############################
	
	public static void InsertLapTimes(int lid, String track, int did, String compound, String sector1, String sector2, 
			String sector3, int sid, String x, String path) {
		try {
			PrintStream out = new PrintStream(new FileOutputStream (path, true));
			out.println(lid+x+track+x+did+x+compound+x+sector1+x+sector2+x+sector3+x+sid);
			out.close();
		}catch(IOException e) {
			System.out.println(e);
		}
	}
	
	public static void InsertUser(int uid, String name, String pass, int salary, String position, int dayoff, String birthday, int canedit, 
			String x, String path) {
		try {
			PrintStream out = new PrintStream(new FileOutputStream (path, true));
			out.println(uid+x+name+x+pass+x+salary+x+position+x+dayoff+x+birthday+x+canedit);
			out.close();
		}catch(IOException e) {
			System.out.println(e);
		}
	}

	
	//############################ .dat Methods ############################
	public static void InsertLapTimesDat(int lid, String track, int did, String compound, String sector1, String sector2, 
			String sector3, int sid, String x, String path) {
		
		try {
			FileOutputStream FileOs = new FileOutputStream(path);
			ObjectOutputStream os = new ObjectOutputStream(FileOs);
			os.writeInt(lid);
			os.writeUTF(track);
			os.writeInt(did);
			os.writeUTF(compound);
			os.writeUTF(sector1);
			os.writeUTF(sector2);
			os.writeUTF(sector3);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void InsertUserDat(int uid, String name, String pass, int salary, String position, int dayoff, String birthday, int canedit, 
			String x, String path) {
		try {
			FileOutputStream FileOs = new FileOutputStream(path);
			ObjectOutputStream os = new ObjectOutputStream(FileOs);
			os.writeInt(uid);
			os.writeUTF(name);
			os.writeUTF(pass);
			os.writeInt(salary);
			os.writeUTF(position);
			os.writeInt(dayoff);
			os.writeUTF(birthday);
			os.writeInt(canedit);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	

}
