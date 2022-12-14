package com.autodesk.genericutility;

import java.util.Date;
import java.util.Random;

/**
 * 
 * @author Milan
 *
 */
public class JavaUtility {
/**
 * It will return Random Number Generated By System
 * @param 
 * @return int Random Number
 */
		public int getRandomNumber(int boundry) {
			
			Random ran=new Random();
			int ranNum=ran.nextInt(boundry);
			
			
			return ranNum;
		}
		
		/*
		 * public Date getTodayDate(int date,int month,int year) { Calendar
		 * cal=Calendar.getInstance(); Date time=cal.getTime();
		 * System.out.println(time);
		 * 
		 * return time; }
		 */
		
		/**
		 * This Method Return Current Time and Date In IST Formate
		 * @return String 
		 */
		public String getCurrentDate() {
			Date d=new Date();
			String datetext=d.toString().replace(" ","_");
			return datetext.toString().replace(":", "_");
		}
		/**
		 * This Method Return Date Format as per GST
		 * @return String
		 */
		
		public String  getSysDateWithFormate() {
				Date d=new Date();
				String dateAndTime=d.toString();
				
				String YYYY=dateAndTime.split(" ")[5];
				String DD=dateAndTime.split(" ")[2];
				int MM=d.getMonth()+1;
				String format=YYYY+"-"+MM+"-"+DD;
			return format;
		}		
	

}
