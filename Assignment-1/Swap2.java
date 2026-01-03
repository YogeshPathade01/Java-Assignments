import java.util.Scanner;
public class Swap2{
   public static void main(String[] args)
   {
     int a,b;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter a,b:");
     a=sc.nextInt();
     b=sc.nextInt();

     a=a*b;
     b=a/b;
     a=a/b;
    System.out.println("a:"+a);
    System.out.println("b:"+b);
    }
}