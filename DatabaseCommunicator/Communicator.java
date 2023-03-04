package databasecommunicator;

import java.sql.*;

import com.mysql.cj.xdevapi.Statement;

public class Communicator {
	static final String DB_URL = "jdbc:mysql://localhost:3306/conf";
	static final String USER = "root";
	static final String PASS = "Abscular09@";
	
	public static void Run(String acc_name, String acc_email, String acc_pass, String app) 
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(DB_URL,USER,PASS);
			java.sql.Statement stmt = con.createStatement();
			String sql = "insert into conf (acc_name,acc_email,acc_pass,app) values ('"+acc_name+"','"+acc_email+"','"+acc_pass+"','"+app+"')";
			int result = stmt.executeUpdate(sql);
			if(result>0) 
			{
				System.out.println("Record/s inserted!");
			}
			else 
			{
				System.out.println("Something went wrong!");
			}
		}
		catch(Exception ex) 
		{
			ex.printStackTrace();
		}
	}
}
