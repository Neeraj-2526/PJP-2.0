using System;

namespace DateTimeCalc
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("1. Add and Subtract Dates \n2. Add/subtract 'n' from date\n3. Day of Week\n4. Week Number\n5. NLP Translate");
            System.Console.Write("Enter Your Choice: ");
            String ch=Console.ReadLine();
            int n=Int16.Parse(ch);
            switch(n)
            {
                case 1:
                    AddSubDates ad1=new AddSubDates();
                    ad1.asDates();
                    break;
                case 2:
                    AddSub addSub=new AddSub();
                    addSub.addSubOper();
                    break;
                case 3:
                    Weeks wee=new Weeks();
                    System.Console.WriteLine("Day of Week: {0}",wee.dayOfWeek());
                    
                    break;
                case 4:
                    Weeks wee1=new Weeks();
                    System.Console.WriteLine("Number of week: {0}",wee1.numberOfWeek());
                    
                    break;
                case 5:
                    Nlp nlp=new Nlp();
                    nlp.translate();
                    break;
                    
                default:
                    System.Console.WriteLine("Enter Valid Choice");
                    break;
                
            }
        }
    }
}
