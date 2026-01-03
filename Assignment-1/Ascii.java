import java.util.Scanner;
public class Ascii{
   public static void main(String[] args)
   {
     char a;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the character:");
     a=sc.next().charAt(0);
     System.out.println("ASCII value of character:"+ (int)a);
   }
}
     