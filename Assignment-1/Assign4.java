import java.util.Scanner;
public class Assign4
{
    public static void main(String[] args)
    {
     int u,a,t,v,s;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter vel,acceleration,time:");
     u=sc.nextInt();
     a=sc.nextInt();
     t=sc.nextInt();
 
     v=u+a*t;
     s=u+a*t*2;

     System.out.println("velocity:"+v);
     System.out.println("distance:"+s);
     }
}
      