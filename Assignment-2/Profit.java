import java.util.Scanner;
public class Profit{
   public static void main(String[] args)
   {
     int c_price,s_price;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter prices:");
     c_price=sc.nextInt();
     s_price=sc.nextInt();
    if(c_price>s_price)
      System.out.println("loss");
    else
      System.out.println("profit");
    }
}