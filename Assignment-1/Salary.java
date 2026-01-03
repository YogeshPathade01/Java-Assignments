import java.util.Scanner;
public class Salary{
   public static void main(String args[])
   {
    int id;
    double basic,home_salary;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter id and salary:");
    id=sc.nextInt();
    basic=sc.nextInt();
   
    home_salary=(basic+(basic*0.10)+(basic*0.30)-(basic*0.05));

    System.out.println("home salary of employee:"+home_salary);
   }
}

