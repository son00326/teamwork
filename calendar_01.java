package com.javalec.base;

import java.util.Calendar;

public class calendar_01 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance(); // 함수 받아오기(calendar)
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;
		int day = calendar.get(Calendar.DATE);
		int hour = calendar.get(Calendar.HOUR);
		int min = calendar.get(Calendar.MINUTE);
		int sec = calendar.get(Calendar.SECOND);
		
		
		String str_1 = null;
		
        int date = calendar.get(Calendar.DAY_OF_WEEK);
        String[] str = {"일","월","화","수","목","금","토"} ;
		for(int i = 0; i < 7;i++) {
			if(i == date) {
				str_1 = str[i-1];
			}
		}
		System.out.println(year + "-" + month + "-" + day+ ":" + hour+ ":" + min+ ":" + sec + ":" + str_1);

	}

}
