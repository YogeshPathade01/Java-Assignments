import java.util.Scanner;
public class Pos_or_Nev{
   public static void main(String[] args)
   {
     int n;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter no:");
     n=sc.nextInt();

    if(n>0)
       System.out.println("positive");
    else
       System.out.println("Negative");
    }
}