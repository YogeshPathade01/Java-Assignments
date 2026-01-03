import java.util.Scanner;
public class Character{
   public static void main(String[] args)
   {
    char a,b,c;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the character:");
    a=sc.next().charAt(0);
   
   
    b=++a;
    System.out.println("next charcter is:"+b);
    --a;
    
    c=--a;
    System.out.println("previous character is:"+c);
   }
}