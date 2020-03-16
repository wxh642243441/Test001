package com.tedu.day02;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo001 {
	private static SimpleDateFormat simpleDateFormat  = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
	public static void main(String[] args) {
/*		Date date = new Date();
		String string = simpleDateFormat.format(date);
		System.out.println(string);
		*/
		Calendar calendar =Calendar.getInstance();
//		Date date = calendar.getTime();
//		System.out.println(date);
//		Date date2 =new Date(0);
//		calendar.setTime(date2);
//		System.out.println(date2);
		System.out.println(format(calendar.getTime()));
		calendar.add(calendar.MONTH,3);
		calendar.set(calendar.DATE, 1);
		calendar.add(calendar.DATE, -3);
		System.out.println(format(calendar.getTime()));
	}
	private static  String format(Date time) {
		
		return simpleDateFormat.format(time);
	}
}
