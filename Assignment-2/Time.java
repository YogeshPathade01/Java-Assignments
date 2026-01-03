import java.util.Scanner;
public class Time{
    public static void main(String[] args)
   {
     int h,m,s;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter time");
     h=sc.nextInt();
     m=sc.nextInt();
     s=sc.nextInt();
 
     if(h>=0 && h<=23)
     {
       if(m>=0 && m<=59)
       {
         if(s>=0 && s<=59)
         {
            System.out.println("valid time");
          }
          else
          {
             System.out.println("second are invalid");
          }
         }
        else
        {
          System.out.println(" invalid time ");
         }
       }
       else
         { 
          System.out.println("invalid time");
      }
     }
}
      