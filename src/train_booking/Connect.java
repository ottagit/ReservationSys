package train_booking;

import java.sql.*;

public class Connect {

	public Connection con;
	public Connect()
	{
	try
	{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	con=DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=Railway.mdb;DriverID=22");
	}
	catch(Exception e1)
	{
	System.out.println("Connection failed:"+e1);
	}
	}
}
