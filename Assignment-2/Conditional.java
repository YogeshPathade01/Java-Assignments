import java.util.Scanner;
public class Conditional{
    public static void main(String args[])
    {
     int a;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the number:");
     a=sc.nextInt();
     String result=(a%2==0)? "even":"odd";
     System.out.println("number is:"+result);
     }
}