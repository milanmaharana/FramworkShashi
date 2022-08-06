package com.autodesk.genericutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

/**
 * 
 * @author Milan
 *
 */
public class PropertyUtility {

/**
 *  This method is use for getting value of key from property files	
 * @param path
 * @param key
 * @return This Method return Properties File Key-Values
 * @throws Exception
 */
	public String getPropertiesFileData(String key) throws Exception {
		FileInputStream fis=new FileInputStream(IpathConstant.proporty_FilePath);
		Properties prop=new Properties();
		prop.load(fis);
		
		return prop.getProperty(key);
	}
}
