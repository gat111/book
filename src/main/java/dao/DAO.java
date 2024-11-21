package dao;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DAO {
    private static String JDBC_URL;
    private static String DB_USER;
    private static String DB_PASSWORD;

    static {
        try (InputStream input = DAO.class.getClassLoader().getResourceAsStream("db.properties")) {
            Properties prop = new Properties();
            prop.load(input);

            JDBC_URL = prop.getProperty("jdbc.url");
            DB_USER = prop.getProperty("jdbc.user");
            DB_PASSWORD = prop.getProperty("jdbc.password");
        } catch (Exception e) {
            throw new RuntimeException("Failed to load database properties", e);
        }
    }

    public Connection getConnection() throws Exception {
        return DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD);
    }
}


//package dao;
//
//import javax.naming.InitialContext;
//import javax.sql.DataSource;
//import java.sql.Connection;
//
//public class DAO {
//	static DataSource ds;
//
//	public Connection getConnection() throws Exception {
//		if (ds==null) {
//			InitialContext ic=new InitialContext();
//			ds=(DataSource)ic.lookup("java:/comp/env/jdbc/book");
//		}
//		return ds.getConnection();
//	}
//}
//
