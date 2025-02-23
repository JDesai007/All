/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorypattern;

/**
 *
 * @author Jaydip
 */
public class MongoDBConnection implements DatabaseConnection { //Implements the DatabaseConnection Interface
   
    @Override
    public void connect() {
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       System.out.println("MongoDB: Connected to MongoDB Database.");
      
    }

    @Override
    public void disconnect() {
       
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
         System.out.println("MongoDB: Disconnected to MongoDB Database.");
    
    }
}