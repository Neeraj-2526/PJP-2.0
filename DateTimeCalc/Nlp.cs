using System;
using System.Text.RegularExpressions;
using System.Collections.Generic;
using System.Linq;

namespace DateTimeCalc
{
    class Nlp
    {
        public void translate()
        {
            System.Console.Write("Enter Phrase: ");
            String input=Console.ReadLine().ToLower();
            string inputstr =  Regex.Replace(input, @"[^0-9a-zA-Z]+", " ");
            DateTime cur=DateTime.Now;

		    List<string> str = inputstr.Select(c => c.ToString()).ToList();
            int check;
            var isNumeric = int.TryParse(str[0].ToString(), out check);
            String che="";
            int tempnumber=0;
            if(isNumeric){
                tempnumber=Int16.Parse(str[0]);
                str.RemoveAt(0);
                che=String.Join("",str);
            }
            
            if(inputstr.Equals("today")){
                Console.WriteLine(cur);
            }
            else if(inputstr.Equals("yesterday")){
                Console.WriteLine(cur.AddDays(-1));
            }
            else if(inputstr.Equals("tomorrow")){
                Console.WriteLine(cur.AddDays(1));
            }
            else if(inputstr.Equals("last week")){
                Console.WriteLine(cur.AddDays(-7));
            }
            else if(inputstr.Equals("next week")){
                Console.WriteLine(cur.AddDays(7));
            }
            else if(inputstr.Equals("last month")){
                Console.WriteLine(cur.AddMonths(-1));
            }
            else if(inputstr.Equals("last year")){
                Console.WriteLine(cur.AddYears(-1));
            }
            else if(inputstr.Equals("next month")){
                Console.WriteLine(cur.AddMonths(1));
            }
            else if(inputstr.Equals("next year")){
                Console.WriteLine(cur.AddYears(1));
            }
            else if(inputstr.Equals("day before yesterday")){
                Console.WriteLine(cur.AddDays(-2));
            }
            else if(inputstr.Equals("day after tomorrow")){
                Console.WriteLine(cur.AddDays(2));
            }
            else if(che.Equals(" days from now")){
                Console.WriteLine(cur.AddDays(tempnumber));
            }
            else if(che.Equals(" weeks from now")){
                Console.WriteLine(cur.AddDays(tempnumber*7));
            }
            else if(che.Equals(" years from now")){
                Console.WriteLine(cur.AddYears(tempnumber));
            }
            else if(che.Equals(" months from now")){
                Console.WriteLine(cur.AddMonths(tempnumber));
            }
            else if(che.Equals(" days earlier")){
                Console.WriteLine(cur.AddDays(-tempnumber));
            }
            else if(che.Equals(" weeks earlier")){
                Console.WriteLine(cur.AddDays(-tempnumber*7));
            }
            else if(che.Equals(" months earlier")){
                Console.WriteLine(cur.AddMonths(-tempnumber));
            }
            else if(che.Equals(" years earlier")){
                Console.WriteLine(cur.AddYears(-tempnumber));
            }
            
        }
    }
}
