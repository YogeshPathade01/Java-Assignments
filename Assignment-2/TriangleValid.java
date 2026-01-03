import java.util.Scanner;
public class TriangleValid{
   public static void main(String[] args)
   {
      int a,b,c;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter sides:");
      a=sc.nextInt();
      b=sc.nextInt();
      c=sc.nextInt();

      if(a+b>c && a+c>b && b+c>a)
         System.out.println("triangle is valid");
      else
         System.out.println("triangle is not valid");
    }
}
     