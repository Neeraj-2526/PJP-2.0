package com.neeraj.datetime;

import java.time.*;
import java.util.Scanner;

public class DateDifference {

	public void datediff() {
		
		try (Scanner sc2 = new Scanner(System.in)) {
			System.out.print("Enter First Date in format yyyy-mm-dd : ");  
			String str= sc2.next();
			LocalDate date=LocalDate.parse(str);
			
			System.out.print("Enter Second Date in format yyyy-mm-dd : ");  
			String str1= sc2.next();
			LocalDate date1=LocalDate.parse(str1);
			
			Period difference = Period .between(date,date1);
			System.out.printf("%d years, %d months"+ " and %d days ",difference.getYears(),difference.getMonths(),difference.getDays());
		} 
	} 

}
