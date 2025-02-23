/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorypattern;

/**
 *
 * @author Jaydip
 */
public class DatabaseFactory {
    public static DatabaseConnection getDatabaseConnection(String dbType) {
    
         switch (dbType) {
            case "mysql":
                return new MySQLConnction();
            case "postgresql":
                return new PostgreSQLConnection();
            case "mongodb":
                return new MongoDBConnection();
            default:
                throw new IllegalArgumentException("Unsupported database type: " + dbType);
        }
    }
}
