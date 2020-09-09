using System;

namespace DateTimeCalc
{
    class Weeks
    {
        public String dayOfWeek()
        {
            System.Console.Write("Enter Date: ");
            ChangeDateFormat ch1=new ChangeDateFormat();
            DateTime date=ch1.changeFormat();
            return date.DayOfWeek.ToString();

        }
        

        public int numberOfWeek()
        {
            System.Console.Write("Enter Date: ");
            ChangeDateFormat ch2=new ChangeDateFormat();
            DateTime date1=ch2.changeFormat();
            int py=date1.Year;
            DateTime firstday=new DateTime(py,1,1);
            int n=(int)date1.DayOfYear + (int)firstday.DayOfWeek-1;
            return n/7;
        }
    }
}
