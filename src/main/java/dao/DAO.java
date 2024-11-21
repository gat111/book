package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {


    // 接続情報を直接埋め込む
    private static final String JDBC_URL = "jdbc:postgresql://dpg-csvhc1rv2p9s73d18ktg-a/book_j7p0";
    private static final String DB_USER = "book_j7p0_user";
    private static final String DB_PASSWORD = "dwzHlPprv31xNJPljuyh7qVzh2rTE5Mk";

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
