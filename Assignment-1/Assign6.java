import java.util.Scanner;
public class Assign6{
   public static void main(String[] args)
  {
   int l,b,h,area,volume;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter length,breadth,height:");
   l=sc.nextInt();
   b=sc.nextInt();
   h=sc.nextInt();
  
  area=2*(l*b+l*h+b*h);
  volume=l*b*h;

  System.out.println("Area:"+area);
  System.out.println("Volume:"+volume);
  }
}