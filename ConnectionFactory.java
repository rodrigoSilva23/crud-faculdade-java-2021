/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudEbooks;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;


/**
 *
 * @author rodrigo
 */
public class ConnectionFactory implements DataBaseConstantes{
    public Connection getConnection() {
        try {
            return DriverManager.getConnection(URL2, USUARIO, SENHA);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
