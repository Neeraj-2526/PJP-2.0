using System;

namespace DateTimeCalc
{
    class AddSubDates
    {
        public void asDates()
        {
            System.Console.Write("Enter 1st Date: ");
            ChangeDateFormat ch1=new ChangeDateFormat();
            DateTime date1=ch1.changeFormat();

            System.Console.Write("Enter 2nd Date: ");
            ChangeDateFormat ch2=new ChangeDateFormat();
            DateTime date2=ch2.changeFormat();

            TimeSpan diff1=date1.Subtract(date2);
            String d=diff1.TotalDays.ToString();
            int dif=int.Parse(d);
            int year=dif/365;
            int months=(dif-year*365)/30;
            int days=dif-year*365-months*30;
            Console.WriteLine("Difference between dates: {0} Days {1} Months {2} Year",days,months,year);
            
        }
    }
}
