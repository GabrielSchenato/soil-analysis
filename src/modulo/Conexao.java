/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author gabri
 */
public class Conexao {

    final static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    final static String DB_URL = "jdbc:mysql://localhost:3306/java?user=root&password=root&verifyServerCertificate=false&useSSL=false&requireSSL=false";

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName(JDBC_DRIVER);
            return DriverManager.getConnection(DB_URL);
        } catch (ClassNotFoundException e) {
            throw new SQLException(e.getMessage());
        }
    }

}
