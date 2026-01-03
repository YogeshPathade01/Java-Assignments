import java.util.Scanner;
public class AreaCylinder
{
    public static void main(String[] args){
      float r,h,p=3.14f;
      float area,volume;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter radius and height:");
    r=sc.nextFloat();
    h=sc.nextFloat();
    area=2*p*r*r;
    volume=p*r*2*h;

   System.out.println("Area of cylinder:"+area);
   System.out.println("Volume of cylinder:"+volume);
   }
}
    
       
    