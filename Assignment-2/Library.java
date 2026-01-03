import java.util.Scanner;
public class Library{
    public static void main(String[] args)
    {
       int days,fine;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter days");
       days=sc.nextInt();
    
       if(days<5)
            fine=days*2;
       else if(days<=10)
            fine=days*5;
       else
            fine=days*10;
 
      System.out.println("Fine:"+fine);
    }
}
    