import java.util.Scanner;
public class MaxNumber{
   public static void main(String[] args)
   { 
       int a,b,c;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter value numbers:");
       a=sc.nextInt();
       b=sc.nextInt();
       c=sc.nextInt();

       if(c>a && c>b)
       { 
          System.out.println("max is  :"+c);
       }
       else if(b>a && b>c)
       {
          System.out.println("max is :"+b);
        }
       else
       {
           System.out.println("max is :"+a);
        }
   }
}