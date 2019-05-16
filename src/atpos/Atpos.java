/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atpos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author na.morenoe
 */
public class Atpos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection connection = null;
        Statement statement = null;
        ResultSet result = null;
        String query = "SELECT * FROM APP.PRODUCTO";
        try {
            connection = DriverManager.getConnection("jdbc:derby://localhost:1527/Atpos");
            statement = connection.createStatement();
            result = statement.executeQuery(query);
            while(result.next())
            {
                int id = result.getInt("ID");
                String nombre = result.getString("NOMBRE");
                double precioUnidad = result.getDouble("PRECIOUNIDAD");
                int cantidad = result.getInt("CANTIDAD");
                System.out.println(id + "\t  " + nombre + "\t  " + precioUnidad +"\t  " +cantidad );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
