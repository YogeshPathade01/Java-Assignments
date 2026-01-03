import java.util.Scanner;
public class Divisible1{
   public static void main(String[] args)
   {
     int n;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter n:");
     n=sc.nextInt();

     if(n%5==0 || n%7==0)
     {
       System.out.println("divisible by 5 or 7");
      
      }
     else
     {
         System.out.println("not divisible by both");
     }
   }
} 	