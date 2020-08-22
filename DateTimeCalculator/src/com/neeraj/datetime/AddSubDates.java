package com.neeraj.datetime;

import java.time.LocalDate;
import java.util.*;

public class AddSubDates {

	public void AddSub() {
		
		try (Scanner sc1 = new Scanner(System.in)) {
			System.out.print("Enter Date in format yyyy-mm-dd : ");  
			String str= sc1.next();
			LocalDate date=LocalDate.parse(str);
			
			System.out.println("\n1. Add Days \n2. Subtract Days \n3. Add Months \n4. Subtract Months \n5. Add Weeks \n6. Subtract Weeks \n7. Exit");
			
			System.out.print("\nSelect choice: ");
			int num = sc1.nextInt();
			
			while(num!=7) {
			switch(num){
				case 1:
					 System.out.print("Enter Number of days want to Add: ");
					 Scanner m = new Scanner(System.in);
				     int num1 = m.nextInt();
				     LocalDate date1=date.plusDays(num1);
					 System.out.println("Date after adding "+num1+" days: "+ date1);
					 break;
				case 2:
				 	System.out.print("Enter Number of days want to Subtract: ");
				 	Scanner m1 = new Scanner(System.in);
				 	int num2 = m1.nextInt();
				 	LocalDate date2=date.minusDays(num2);
					System.out.println("Date after Subtracting "+num2+" days: "+ date2);
					break;
				case 3:
				 	System.out.print("Enter Number of months want to Add: ");
				 	Scanner m2 = new Scanner(System.in);
				 	int num3 = m2.nextInt();
				    LocalDate date3=date.plusMonths(num3);
					System.out.println("Date after Adding "+num3+" months: "+ date3);
					break;
				case 4:
				 	System.out.print("Enter Number of months want to Add: ");
				 	Scanner m3 = new Scanner(System.in);
				 	int num4 = m3.nextInt();
				 	LocalDate date4=date.minusMonths(num4);
					System.out.println("Date after Subtracting "+num4+" months: "+ date4);
					break;
				case 5:
				 	System.out.print("Enter Number of months want to Add: ");
				 	Scanner m4 = new Scanner(System.in);
				 	int num5 = m4.nextInt();
				 	LocalDate date5=date.plusWeeks(num5);
					System.out.println("Date after adding "+num5+" weeks: "+ date5);
					break;
				case 6:
				 	System.out.print("Enter Number of months want to Add: ");
				 	Scanner m5 = new Scanner(System.in);
				 	int num6 = m5.nextInt();
				 	LocalDate date6=date.minusWeeks(num6);
					System.out.println("Date after Subtracting "+num6+" weeks: "+ date6);
					break;
				default:
					return;
					
			}
			System.out.println("\n1. Add Days \n2. Subtract Days \n3. Add Months \n4. Subtract Months \n5. Add Weeks \n6. Subtract Weeks \n7. Exit");
      
			System.out.print("\nSelect choice: ");
			num = sc1.nextInt();
			}
		}
        
	}

}
