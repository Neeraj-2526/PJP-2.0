package com.neeraj.datetime;

import java.time.LocalDate;
import java.util.*;

public class GetDayOfWeek {

	public void getday() {
		
		try (Scanner sc3 = new Scanner(System.in)) {
			System.out.print("Enter Date in format yyyy-mm-dd : ");  
			String str= sc3.next();
			LocalDate date=LocalDate.parse(str);
			
			System.out.println(date.getDayOfWeek());
		}

	}

}
