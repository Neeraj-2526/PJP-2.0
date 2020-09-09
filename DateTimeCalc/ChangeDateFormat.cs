using System;

namespace DateTimeCalc
{
    class ChangeDateFormat
    {

        public DateTime changeFormat(){
            DateTime bd;
		string[] formats = { "dd/MM/yyyy", "dd/M/yyyy", "d/M/yyyy", "d/MM/yyyy",
                "dd/MM/yy", "dd/M/yy", "d/M/yy", "d/MM/yy"};
	    if(DateTime.TryParseExact(Console.ReadLine(), formats,
             System.Globalization.CultureInfo.InvariantCulture,
             System.Globalization.DateTimeStyles.None,
             out bd))
	    {
            return bd;
	    }
	    else
	    {
            // Invalid format or value.
		    Console.WriteLine("Wrong Format");
	    }
        return bd;
		
    }

    }
}
