package com.basicjava;
import java.util.Calendar;

public class DateTimeSecond {
public static void main(String[] args) {
	Calendar c=Calendar.getInstance();
	System.out.println("current date");
	int date=c.get(Calendar.DATE);
	int month=c.get(Calendar.MONTH);
	++month;
	int year=c.get(Calendar.YEAR);
	System.out.println(date+":"+month+":"+year);
	
	int hour=c.get(Calendar.HOUR);
	int minute=c.get(Calendar.MINUTE);
	int second=c.get(Calendar.SECOND);
	System.out.println("current time");
	System.out.println(hour+":"+minute+":"+second);
}
}
