import java.util.Scanner;
public class CompareN{
   public static void main(String[] args)
   {
     int a,b;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter n:");
     a=sc.nextInt();
     b=sc.nextInt();
    
     if(a==b)
       System.out.println("same no");
     else if(a>b)
       System.out.println("a is big");
     else
       System.out.println("b is big");
    }
}