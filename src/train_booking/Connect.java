package train_booking;

import java.sql.*;

public class Connect {

	String url = "jdbc:mysql://localhost:3306/Railway";
	String user = "root";
	String password = "";
	
	
	public Connection con= null;
	public Statement stt = null;
	public PreparedStatement ps = null;
	ResultSet rs = null ;
	
	public Connect()
	{
	try
	{
	Class.forName("com.mysql.jdbc.Driver").newInstance();
	con=DriverManager.getConnection(url, user, password);
	
	stt = con.createStatement();
	
	}
	catch(Exception e1)
	{
	System.out.println("Connection failed:"+e1);
	}
	}
}
