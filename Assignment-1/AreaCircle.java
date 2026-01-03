import java.util.Scanner;
public class AreaCircle{
    public static void main(String[] args)
    {
      float r,area,circumference;
      float p=3.14f;
      
      Scanner sc=new Scanner(System.in);
      System.out.println("enter your radius:");

      r=sc.nextFloat();
     
      area=p*r*r;
      circumference=2*p*r;

      System.out.println("Area of circle:"+area);
      System.out.println("Circumference of circle:"+circumference);
     }
 }
      
