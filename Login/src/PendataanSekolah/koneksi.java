
package PendataanSekolah;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/dbdatasekolah";
    private static final String USER = "root";
    private static final String PASS = "";

    public static Connection getkoneksi() throws SQLException {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected to database.");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Failed to connect to database.");
            e.printStackTrace();
        } return conn;
    }
}