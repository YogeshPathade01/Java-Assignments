import java.util.Scanner;
public class MidCheck{
    public static void main(String[] args)
    {
     int a,b,c,mid;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter numbers:");
     a=sc.nextInt();
     b=sc.nextInt();
     c=sc.nextInt();
   
     if((a>b && a<c) || (a>c && a<b))
     {
        System.out.println(a+"is between"+b+" and "+c);
     }
     else if(b>c && b<a || (b>a && b<c))
     {
        System.out.println(b+"is between"+a+" and "+c);
     }
     else
     {
        System.out.println(c+"is between"+a+" and "+b);

     }
    }
}