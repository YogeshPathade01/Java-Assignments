import java.util.Scanner;
public class Currency{
    public static void main(String[] args)
    {
     int amount;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the amount:");
     amount=sc.nextInt();
    int first=amount/10;
    int second=amount%10;
    int third=second/5;
    int fourth=second%5;
    int fifth=fourth/1;
    int six=fourth%1;

   System.out.println("number of 1o notes:"+first);
   System.out.println("number of 5 notes:"+third);
   System.out.println("number of 1 notes:"+fifth);
   }
}
     