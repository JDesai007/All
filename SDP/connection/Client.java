//javac -cp .;mysql-connector-java-5.1.49-bin.jar;postgresql-42.7.1.jar;sqlite-jdbc-3.40.0.0.jar Client.java
import java.util.*;
import java.sql.*;
class Client
{
    public static void main(String args[])
	{
	    Database db;
		ResultSet rs;
		int opt;
		Scanner sc=new Scanner(System.in);
	 
		do
		{
		    System.out.println("1.Mysql");
            System.out.println("2.PostgresSql");
            System.out.println("3.Sqlite");
            System.out.println("Enter your choice ");
            opt = Integer.parseInt(sc.nextLine());
            db = DatabaseFactory.getDb(opt);
            db.connect();
			/*System.out.println("Enter Student Id ");
            int id = Integer.parseInt(sc.nextLine());
            System.out.println("Enter Student Name ");
            String name = sc.nextLine();
            db.insert(id,name);
			System.out.println("Enter student id which you want to fetch ");
            int sid = Integer.parseInt(sc.nextLine());
			try
			{
			    rs=db.select(sid);
				//rs.beforeFirst();
				while(rs.next())
				{
			     System.out.println("Student Id " + rs.getInt("sid") + " Student Name " + rs.getString("snm"));
				}
			}
			catch(java.sql.SQLException sq)
			{
				sq.printStackTrace();
			}*/
						
		}while(opt!=4);
	 
	
		
	}
}