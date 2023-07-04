package com.basicjava.copy;

import java.util.Calendar;

public class CalendarDateAndTime {
	public static void main(String[] args) {
		Calendar c1=Calendar.getInstance();
		System.out.println("Current Date");
		
		int dd=c1.get(Calendar.DATE);
		int mm=c1.get(Calendar.MONTH);
		
		++mm;
		
		int yy=c1.get(Calendar.YEAR);
		System.out.println(dd+ "-"+mm+"-"+yy);
		
		System.out.println("current time");
		
		int h=c1.get(Calendar.HOUR);
		int m=c1.get(Calendar.MINUTE);
		int s=c1.get(Calendar.SECOND);
		
		System.out.println(h+":"+m+":"+s);
	}

}
