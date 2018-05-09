package com.javaline.custom;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class MyOracleConnectionTest {
	@SuppressWarnings("unused")
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL ="jdbc:oracle:thin:@localhost:1521:xe";
	private static final String ID ="test";
	private static final String PASS ="test";
	
	@Test
	public void testConnection() throws Exception{
		try(Connection conn = DriverManager.getConnection(URL,ID,PASS)){
			System.out.println(conn);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
			
}