package Backend;

import javax.xml.transform.Result;
import java.io.Serializable;
import java.sql.*;

public class Database implements Serializable {
    public static Database instance;

    private static final String DB_TYPE = "mysql";
    private static final String DB_HOST = "localhost";
    private static final String DB_PORT = "3306";
    private static final String DB_NAME = "pbo_pra14";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "";

    private Database() {}

    public static synchronized Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public static int insertQueryGetId(String query) throws SQLException {
        Connection conn = getConnection();
        int num = 0;
        int result = -1;
        try {
            Statement stmt = conn.createStatement();
            num = stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                result = rs.getInt(1);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
            result = -1;
        }
        return result;
    }

    public static boolean executeQuery(String query) throws SQLException {
        Connection conn = getConnection();
        boolean result = false;
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(query);
            result = true;
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static ResultSet selectQuery(String query) throws SQLException {
        Connection conn = getConnection();
        ResultSet rs = null;
        try {
            Statement stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:"+DB_TYPE+"://"+DB_HOST+":"+DB_PORT+"/"+DB_NAME,DB_USER,DB_PASS);
    }

}
