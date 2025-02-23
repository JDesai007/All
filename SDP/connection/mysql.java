import java.sql.*;
public class mysql implements Database
{
   private Connection con;
   private PreparedStatement ps;
   private ResultSet rs;
   private Statement st;
   public void connect()
   {
	   try
	   {
	     Class.forName("com.mysql.jdbc.Driver");
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hetvi_5","root","");
		 System.out.println("connect");
	   }
	   catch(Exception er)
	   {
		   //System.out.println("class not found");
		   er.printStackTrace();
	   }
   }
}
