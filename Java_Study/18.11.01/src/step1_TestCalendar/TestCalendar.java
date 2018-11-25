﻿package step1_TestCalendar;

import java.util.Calendar;

public class TestCalendar {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.println(today.get(Calendar.YEAR));
		System.out.println(today.get(Calendar.MONTH) + 1); //월은 0~11이므로, + 1
		System.out.println(today.get(Calendar.DATE));
		System.out.println(today.get(Calendar.AM_PM)); //오전0 , 오후1
		if(today.get(Calendar.AM_PM)==0) {
			System.out.println("오전");
		} else {
			System.out.println("오후");
		}
		System.out.println(today.get(Calendar.HOUR_OF_DAY));
		System.out.println(today.get(Calendar.MINUTE));
		System.out.println(today.get(Calendar.SECOND));
		
	}

}
