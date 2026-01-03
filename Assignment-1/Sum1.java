import java.util.Scanner;
public class Sum1{
    public static void main(String[] args)
    {
      int n,sum=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter number:");
      n=sc.nextInt();
      int i=1;
      while(i<=n)
      {
        sum +=i;
      }
      System.out.println("sum:"+sum);
     }
 }
 