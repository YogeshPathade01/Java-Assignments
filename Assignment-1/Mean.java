import java.util.Scanner;
public class Mean{
   public static void main(String[] args)
   {
     int a,b;
     int am,hm;
     Scanner sc =new Scanner(System.in); 
     System.out.println("enter two numbers:");
     a=sc.nextInt();
     b=sc.nextInt();

    am=((a/b)/2);
    hm=a*b/(a+b);

    System.out.println("Arithmatic mean:"+am);
    System.out.println("Harmonic mean:"+hm);
   }
}
     