//Class that performs date calculations

public class IncDate extends Date
{
   //copy constructor
   public IncDate(Date o)
   {
      super(o.month,o.day, o.year);
   }
   //constructor
   public IncDate(int m, int d, int y)
   {
      super(m,d,y);
   }
   public void addDays(int numDays)
   {
   //add days one at a time...
      for(int i = 0; i < numDays; i++)
         {
            //Do you need to add a leap day...
            if( month == 2 &&( day == 28) && ((day == 28 &&(year % 4 == 0 && year % 100 != 0|| year % 400 == 0 ))))
                  day++;
                                 
            //Do you need to add a new month..
            else if (((day == 31) && ((month == 1 )||( month == 3 )||(month == 5)||
                                        (month == 7 )||( month == 8 )||(month ==10)))
                   ||((day == 30) && ((month == 4 )||( month == 6 )||
                                        (month == 9 )||( month ==11 )))
                   ||((month == 2)&&  ((day  == 28)||( day   == 29))))
                           
               {
                     month++;
                     day = 1; 
               }
             //Do you need to add a new year..
            else if(day == 31 && month == 12)
               {
                  year++;
                  month = 1; 
                  day = 1; 
               
               }
            //No? okay, just add a day!  
            else{
               day++; 
            
                }
            
            }        
      
   }

}