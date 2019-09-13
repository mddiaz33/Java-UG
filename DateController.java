import java.util.*;
import java.io.*;

public class DateController
{
   public static void main(String[] args)
   {
      try
      {
         Scanner kbd = new Scanner(System.in);
        IncDate myDate; 
        
        System.out.print("Enter Date:");
        String str = kbd.nextLine();
        if (str.matches("\\d{2}/\\d{2}/\\d{4}")) {
         String[] a = str.split("/"); 
         int[] b = new int[3];
         
         for (int i = 0; i < 3; i++) {
          String num = a[i];
          b[i] = Integer.parseInt(num);
        }
         IncDate  myDate = new incDate(d[0], d[1],d[2]);
        
        }
        
        
      
      
      }
         catch (Exception e)
        {
           System.out.println("Error occurred: " + e.getMessage());
        }
   
   }

}