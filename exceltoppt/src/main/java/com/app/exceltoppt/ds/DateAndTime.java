package com.app.exceltoppt.ds;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTime{

    public static void main(String[] args)throws Exception{

		/*
		 * SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); String
		 * fechaStr = "2013-08-10 10:49:29.10000"; Date fechaNueva =
		 * format.parse(fechaStr);
		 * 
		 * String format2 = format.format(fechaNueva); SimpleDateFormat format1 = new
		 * SimpleDateFormat("MM-dd-yyyy HH:mm:ss"); Date parse = format1.parse(format2);
		 * System.out.println(format1.format(parse));
		 */
    	
    	SimpleDateFormat input = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    	String fechaStr = "2013-08-10 10:49:29.10000";
    	Date d = input.parse(fechaStr);

    	SimpleDateFormat output = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss");
    	System.out.println(output.format(d));  // will return date as string in format MM-dd-yyyy hh:mm:ss
}
}
