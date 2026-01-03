import java.util.Scanner;
public class MaxNumber1{
   public static void main(String[] args)
   { 
       int a,b,c;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter value numbers:");
       a=sc.nextInt();
       b=sc.nextInt();
       c=sc.nextInt();

       if(c>b)
         b=c;
       if(a>b)
         b=a;
       System.out.println("max is :"+b); 
          
   }
}