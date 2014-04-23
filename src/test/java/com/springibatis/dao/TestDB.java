package com.springibatis.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDB {
	public void getConnectionSqlServer() {

		String driverName = "com.microsoft.jdbc.sqlserver.SQLServerDriver";
		String dbURL = "jdbc:sqlserver://localhost:1433;databasename=test"; // 1433�Ƕ˿ڣ�"USCSecondhandMarketDB"�����ݿ�����
		String userName = "sa"; // �û���
		String userPwd = "123456"; // ����

		Connection dbConn = null;
		try {

			Class.forName(driverName).newInstance();
		} catch (Exception ex) {
			System.out.println("��������ʧ��");
			ex.printStackTrace();
		}
		try {
			dbConn = DriverManager.getConnection(dbURL, userName, userPwd);
			System.out.println("�ɹ��������ݿ⣡");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (dbConn != null)
					dbConn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		TestDB getConn = new TestDB();
		getConn.getConnectionSqlServer();

	}
}