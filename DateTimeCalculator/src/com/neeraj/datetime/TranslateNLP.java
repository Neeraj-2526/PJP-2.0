package com.neeraj.datetime;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TranslateNLP {

	public void nlp() {
		
		//Fetch Current date
		LocalDate date=LocalDate.now();
		
		try (Scanner sc5 = new Scanner(System.in)) {
			System.out.print("Enter Phrase : ");  
			String str= sc5.nextLine();
			
			StringTokenizer tokens = new StringTokenizer(str);
		    int count=tokens.countTokens();
		    String str1="";
		    int num=0;
		    
		    if(count>1) {
			String arr[] = str.split(" ", 2);
			str1=arr[1];
			num=Integer.parseInt(arr[0]);}
			
			if(str.equals("Today")) {
				System.out.println(date);
			}
			else if(str.equals("Yesterday")) {
				System.out.println(date.minusDays(1));
			}
			else if(str.equals("Tomorrow")) {
				System.out.println(date.plusDays(1));
			}
			else if(str.equals("Day-before-yesterday")) {
				System.out.println(date.minusDays(2));
			}
			else if(str.equals("Day-after-tomorrow")) {
				System.out.println(date.plusDays(2));
			}
			else if(str.equals("Last week")) {
				System.out.println(date.minusWeeks(1));
			}
			else if(str.equals("Next week")) {
				System.out.println(date.plusWeeks(1));
			}
			else if(str.equals("Last month")) {
				System.out.println(date.minusMonths(1));
			}
			else if(str.equals("Next month")) {
				System.out.println(date.plusMonths(1));
			}
			else if(str.equals("Last year")) {
				System.out.println(date.minusYears(1));
			}
			else if(str.equals("Next year")) {
				System.out.println(date.plusYears(1));
			}
			else if(str.equals("Last year")) {
				System.out.println(date.minusYears(1));
			}
			else if(str1.equals("days from now")) {
				System.out.println(date.plusDays(num));
			}
			else if(str1.equals("weeks from now")) {
				System.out.println(date.plusWeeks(num));
			}
			else if(str1.equals("months from now")) {
				System.out.println(date.plusMonths(num));
			}
			else if(str1.equals("years from now")) {
				System.out.println(date.plusYears(num));
			}
			else if(str1.equals("days earlier")) {
				System.out.println(date.minusDays(num));
			}
			else if(str1.equals("weeks earlier")) {
				System.out.println(date.minusWeeks(num));
			}
			else if(str1.equals("months earlier")) {
				System.out.println(date.minusMonths(num));
			}
			else if(str1.equals("years earlier")) {
				System.out.println(date.minusYears(num));
			}
		}

	}

}
