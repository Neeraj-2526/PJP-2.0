using System;

namespace DateTimeCalc
{
    class AddSub
    {
        public int choosechoice()
        {
            Console.WriteLine("1. Days\n2. Months\n3. Weeks");
            System.Console.Write("Enter Your Choice: ");
            String ch1=Console.ReadLine();
            int n1=Int16.Parse(ch1);
            return n1;
        }
        public void addSubOper()
        {
            System.Console.Write("Enter Date: ");
            ChangeDateFormat ch1=new ChangeDateFormat();
            DateTime bd=ch1.changeFormat();

            Console.WriteLine("1. Add \n2. Subtract");
            System.Console.Write("Enter Your Choice: ");
            String ch=Console.ReadLine();
            int n=Int16.Parse(ch);
            switch(n)
            {
                case 1:
                    int choice1=choosechoice();
                    System.Console.Write("Enter 'n' you want to Add: ");
                    String nus=Console.ReadLine();
                    int nu=Int16.Parse(nus);
                    if(choice1 == 1){
                        System.Console.WriteLine(bd.AddDays(nu).ToString("dd.MM.yyyy"));
                    }
                    else if(choice1 == 2){
                        System.Console.WriteLine(bd.AddMonths(nu).ToString("dd.MM.yyyy"));
                    }
                    else{
                        System.Console.WriteLine(bd.AddDays(nu*7).ToString("dd.MM.yyyy"));
                    }
                    break;
                case 2:
                    int choice2=choosechoice();
                    System.Console.Write("Enter 'n' you want to Subtract: ");
                    String temp=Console.ReadLine();
                    int nu1=Int16.Parse(temp);
                    if(choice2 == 1){
                        System.Console.WriteLine(bd.AddDays(-nu1).ToString("dd.MM.yyyy"));
                    }
                    else if(choice2 == 2){
                        System.Console.WriteLine(bd.AddMonths(-nu1).ToString("dd.MM.yyyy"));
                    }
                    else{
                        System.Console.WriteLine(bd.AddDays(-nu1*7).ToString("dd.MM.yyyy"));
                    }
                    break;
                    
                default:
                    System.Console.WriteLine("Enter Valid Choice");
                    break;
                
            }
		
	}

    }
}
