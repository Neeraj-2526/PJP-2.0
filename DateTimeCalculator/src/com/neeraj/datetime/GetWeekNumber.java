package com.neeraj.datetime;

import java.time.LocalDate;
import java.util.*;

public class GetWeekNumber {

	public void getweek() {
		
		List<String> l=new ArrayList<String>(Arrays.asList("SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"));
		
		try (Scanner sc4 = new Scanner(System.in)) {
			System.out.print("Enter Date in format yyyy-mm-dd : ");  
			String str= sc4.next();
			LocalDate date=LocalDate.parse(str);
			int rem= date.getYear();
			String str1=rem+"-01"+"-01";
			LocalDate date1=LocalDate.parse(str1);
			int nw=l.indexOf(date1.getDayOfWeek().toString());
			int doy=date.getDayOfYear();
			int ans=(doy+nw)%7;
			
			if(ans==0) {
				System.out.println("Week Number of "+str+ " is "+(doy+nw)/7);
			}
			else {
				System.out.println("Week Number of "+str+ " is "+(((doy+nw)/7)+1));
			}
		}

	}

}
