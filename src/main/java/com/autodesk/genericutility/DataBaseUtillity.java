package com.autodesk.genericutility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

/**
 * 
 * @author milan
 *
 */

public class DataBaseUtillity {
	Connection conn;
	
    public void connectionToDatabase()  {
    	Driver driver;
		try {
			driver = new Driver();
			DriverManager.registerDriver(driver);
	    	DriverManager.getConnection(IpathConstant.DataBase_url,IpathConstant.DB_username,IpathConstant.DB_password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
    public void closeDataBase() {
    	try {
			conn.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
    
    }
    public void insertData(String querry) throws SQLException{
    	
    	int result = conn.createStatement().executeUpdate(querry);
    	boolean flag=false;
    	if(result==1) {
    		System.out.println("data is insert");
    		
    	}else {
    		System.out.println("data not insert");
    		
    	}
    	
    }
 
}
