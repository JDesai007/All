import java.sql.*;
public class sqlite implements Database
{
   private Connection con;
   private PreparedStatement ps;
   private ResultSet rs;
   private Statement st;
   public void connect()
   {
	   try
	   {
	    Class.forName("org.sqlite.JDBC");
		 con=DriverManager.getConnection("jdbc:sqlite:D://MCA/SEM2/SDP/connection/studinfo");
		 System.out.println("connect");
	   }
	   catch(Exception er)
	   {
		   //System.out.println("class not found");
		   er.printStackTrace();
	   }
   }
} 