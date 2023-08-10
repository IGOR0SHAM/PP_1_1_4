package jm.task.core.jdbc.util;

import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/users";
    private static final String USERNAME = "sham";
    private static final String PASS = "root10";

    public static Connection getConnection() {
        Connection connection = null;
        try{
            Driver driver = new Driver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(URL, USERNAME, PASS);
        } catch(SQLException e) {
            System.err.println("Dont load driver SQL");
        }
        return connection;
    }
}