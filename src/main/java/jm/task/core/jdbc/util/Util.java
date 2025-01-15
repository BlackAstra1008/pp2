package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    String url = "jdbc:mysql://localhost:3306/firstdb";
    String user = "root";
    String password = "qwerty";
    public Connection getConnection() {
        Connection connection = null;
        try {

            connection = DriverManager.getConnection(url, user, password);

        } catch (SQLException e) {
            e.getMessage();
            System.out.println("Connection Failed");
        }

        return connection;
    }
}
