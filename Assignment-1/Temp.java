import java.util.Scanner;
public class Temp{
  public static void main(String[] args)
  {
    double celsius,kelvin; 
    double fah;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter fahrenheit:");
    fah=sc.nextFloat();
    
    celsius=(5/9*fah-32);
    kelvin=(celsius + 273.15);
   
    System.out.println("Tem in celsius:"+celsius);
    System.out.println("Tem in kelvin:"+kelvin);
    }
}