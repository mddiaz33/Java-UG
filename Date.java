import java.io.*;
public class Date implements Serializable
{
   protected int year;
   protected int month; 
   protected int day;
   
   public Date(Date o)
   {
      year = o.year;
      month = o.month;
      day = o.day;
      
   }
   public Date(int m, int d, int y)
   {
      month = m;
      day = d; 
      year = y;
      
   }
   
    public int getYear()
    {
        return year;
    }
    
    public int getMonth()
    {
        return month;
    }
    
    public int getDay()
    {
        return day;
    }
    
    // return this date as a String
    public String toString()
    {
        return (month + "/" + day + "/" + year);
    }
    }