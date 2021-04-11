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
 * @author milap
 */
public class FinalProject {

    public static Connection connec;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        javax.swing.JFrame proj = new ConnectToDB();
        proj.show();
    }
    
}
