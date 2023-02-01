package com.meddetails;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseUtil {
	
	   private static final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	   private static final String DRIVER_NAME="oracle.jdbc.driver.OracleDriver";
	   private static final String USERNAME="system";
	   private static final String PASSWORD="sastra";
	   
	   //Create a connection
	   public static Connection getConnection(){
		   Connection con = null;
		   
		   try {
			Class.forName(DRIVER_NAME);
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
		   return con;
			
	   }
	   //Close the connection
	   public static void closeConnection(Connection con){
		   
		   if(con!=null){
			   try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   }
	   }
	   //Close the statement
	   public static void closeStatement(PreparedStatement ps){
		   
		   if(ps!=null){
				
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	   }
	   

}

