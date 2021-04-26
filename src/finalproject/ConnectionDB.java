/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Lyudmila
 */
public class ConnectionDB {
            
    private static ConnectionDB db_conn;
    private static String url, login, pass;
    
    public static String db_name;
    public static Connection connection;
    
     public static ConnectionDB getConnectionDB() {
        if (db_conn == null) {
            db_conn = new ConnectionDB();
        }
        return db_conn;
    }
    
    public void setConnection(String u, String l, String p, String db) throws SQLException {
        url = u;
        login = l;
        pass = p;
        db_name = db;
        connection = DriverManager.getConnection(url, login, pass);
    }
    
}
