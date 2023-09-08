package lk.IJSE.hostel.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class dbConnection {
    private final String URL="jdbc:mysql://localhost:3306/hostel_management_system";
    private final static Properties properties=new Properties();
    private static dbConnection dbConnection;
    private Connection connection;

    static {
        properties.setProperty("user","root");
        properties.setProperty("password","1234");
    }
    private dbConnection() throws SQLException {
        connection = DriverManager.getConnection(URL, properties);
    }

    public static dbConnection getInstance() throws SQLException {
        if (dbConnection == null) {
            return dbConnection = new dbConnection();
        } else {
            return dbConnection;
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
