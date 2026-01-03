import java.util.Scanner;
public class MinNumber{
   public static void main(String[] args)
   {
      int a,b,c;
      System.out.println("enter numbers:");
      Scanner sc=new Scanner(System.in);
      a=sc.nextInt();
      b=sc.nextInt();
      c=sc.nextInt();
   
      b=a>b?b:a;
      b=c>b?b:c;
      System.out.println("min number is:"+b);
     }
}