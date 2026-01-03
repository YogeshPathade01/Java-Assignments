import java util.Scanner
public class Distance{
   public static void main(String[] args)
   {
     int x1,x2,y1,y2;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter  x1,x2,y1,y2");
     x1=sc.nextInt();
     x2=sc.nextInt();
     y1=sc.nextInt();
     y2=sc.nextInt();

    double distance=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
   
    System.out.pritnln("Distance:"distance);
    }
}