import java.util.Scanner;

public class MaxNumber2{
        
      public static void main(String[] args){
   
   
      int a,b,c;
      System.out.println("enter numbers:");
      Scanner sc=new Scanner(System.in);
      a=sc.nextInt();
      b=sc.nextInt();
      c=sc.nextInt();

      b=a>b?a:b;
      b=c>b?c:b;

      System.out.println("max number is:"+b);
   }
}
      