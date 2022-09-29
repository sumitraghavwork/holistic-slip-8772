package com.masai.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {

	private static Connection conn = null;

	public DBUtil() {

	}

	public static Connection provideConnection() {

		try {

			if (conn == null || conn.isClosed() == true) {

				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				String url = "jdbc:mysql://localhost:3306/tender";

				conn = DriverManager.getConnection(url, "root", "root");

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return conn;
	}

	public static void closeConnection(PreparedStatement ps) {

		try {
			if (ps != null)
				ps.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public static void closeConnection(ResultSet rs) {

		try {
			if (rs != null)
				rs.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public static void closeConnection(Connection con) {

		try {
			if (con != null)
				con.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
