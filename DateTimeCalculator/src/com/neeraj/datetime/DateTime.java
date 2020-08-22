package com.neeraj.datetime;

import java.util.Scanner;

public class DateTime {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("\n1. Add and Subtract Days \n2. Add and Subtract n factor \n3. Day of week \n4. Week Number \n5. Natural Language Phrases \n6. Exit");
			System.out.print("\nSelect choice: ");
			int num = sc.nextInt();

				switch(num){
					case 1:
						DateDifference dd=new DateDifference();
						dd.datediff();
						break;
					case 2:
						AddSubDates asd=new AddSubDates();
						asd.AddSub();
						break;
					case 3:
						GetDayOfWeek gdow=new GetDayOfWeek();
						gdow.getday();
					 	break;
					case 4:
					 	GetWeekNumber gwn=new GetWeekNumber();
					 	gwn.getweek();
						break;
					case 5:
					 	TranslateNLP nlp2=new TranslateNLP();
					 	nlp2.nlp();
						break;
					default:
						return;
						
				}
		}
	}

}
