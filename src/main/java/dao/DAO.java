package dao;

import java.sql.Connection;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DAO {
	static DataSource ds;

	public Connection getConnection() throws Exception {
		if (ds==null) {
			InitialContext ic=new InitialContext();
			ds=(DataSource)ic.lookup("java:/comp/env/jdbc/book");
		}
		return ds.getConnection();
	}
}

//import java.io.InputStream;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.util.Properties;
//
//public class DAO {
//    private static String JDBC_URL;
//    private static String DB_USER;
//    private static String DB_PASSWORD;
//
//    // 初期化ブロック
//    static {
//        try (InputStream input = DAO.class.getClassLoader().getResourceAsStream("db.properties")) {
//            if (input == null) {
//                throw new RuntimeException("Failed to load database properties: File not found");
//            }
//
//            Properties prop = new Properties();
//            prop.load(input);
//
//            JDBC_URL = prop.getProperty("jdbc.url");
//            DB_USER = prop.getProperty("jdbc.user");
//            DB_PASSWORD = prop.getProperty("jdbc.password");
//        } catch (Exception e) {
//            throw new RuntimeException("Failed to load database properties", e);
//        }
//    }
//
//    public Connection getConnection() throws Exception {
//        return DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD);
//    }
//}


//package dao;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//
//public class DAO {
//
//
//    // 接続情報を直接埋め込む
//    private static final String JDBC_URL = "jdbc:postgresql://dpg-csvhc1rv2p9s73d18ktg-a/book_j7p0";
//    private static final String DB_USER = "book_j7p0_user";
//    private static final String DB_PASSWORD = "dwzHlPprv31xNJPljuyh7qVzh2rTE5Mk";
//
//    public Connection getConnection() throws Exception {
//        return DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD);
//    }
//}




