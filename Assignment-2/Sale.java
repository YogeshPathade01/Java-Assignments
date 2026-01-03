import java.util.Scanner;
public class Sale{
  public static void main(String[] args)
  {
     double qty1,rate1,qty2,rate2,qty3,rate3;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter quantity and rate one by one:");
     qty1=sc.nextDouble();
     rate1=sc.nextDouble();
     qty2=sc.nextDouble();
     rate2=sc.nextDouble();
     qty3=sc.nextDouble();
     rate3=sc.nextDouble();

     double amount=(qty1*rate1)+(qty2*rate2)+(qty3*rate3);
     double discount;
   
     if(amount>10000)
         discount=amount*0.20;
     else if(amount>5000)
         discount=amount*0.15;
     else
         discount=amount*0.08;

     System.out.println("Total amount:"+amount);
     System.out.println("Discount:"+discount);
    }
}
   