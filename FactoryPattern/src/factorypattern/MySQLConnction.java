/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorypattern;
/**
 *
 * @author Jaydip
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jaydip
 */
public class MySQLConnction implements DatabaseConnection { //Implements the DatabaseConnection Interface
   
    String url="jdbc:mysql://localhost:3306/jaydip";
    String username="root";
    String password="";
    
    String query="select * from dept";
    Connection con; 
    Statement st;
   
   
    @Override
    public void connect() {
       try
        {     
            con= DriverManager.getConnection(url,username,password);
            
            st=con.createStatement();
           
            java.sql.ResultSet rs=st.executeQuery(query) ;
            System.out.println("MySQL: Connected to MySQL Database."); 
            
            while(rs.next()){ 
            //Display values
                System.out.println("--------------------------------------------------");
                System.out.println("Dept_ID: " + rs.getInt("dept_id"));
                System.out.println("Dept_name: " + rs.getString("dept_name"));
                System.out.println("Dept_Location: " + rs.getString("dept_location"));
                System.out.println("--------------------------------------------------");
              
         }
        }
        catch(Exception e)
        {
           e.printStackTrace();
        }
    }

    @Override
    public void disconnect() {
       
        try {
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            
                 
            con.close();
            System.out.println("MySQL: Disconnected to MySQL Database.");    
        } catch (SQLException ex) {
            
            Logger.getLogger(MySQLConnction.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

   
}
