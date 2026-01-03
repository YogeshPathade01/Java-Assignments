import java.util.Scanner;
public class Divisible{
   public static void main(String[] args)
   {
     int n;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter n:");
     n=sc.nextInt();

     if(n%5==0 && n%7==0)
     {
       System.out.println("divisible by both");
      
      }
     else
     {
         System.out.println("not divisible by both");
     }
   }
} 	