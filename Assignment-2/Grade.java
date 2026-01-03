import java.util.Scanner;
public class Grade{
    public static void main(String[] args)
    {
       int m1,m2,m3,m4,total;
       double avg;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter marks");
       m1=sc.nextInt();
       m2=sc.nextInt();
       m3=sc.nextInt();
       m4=sc.nextInt();

        total=m1+m2+m3+m4;
        avg=total/4.0;

        System.out.println("total:"+total);
        System.out.println("average:"+avg);
      
       if(avg>=60)
         System.out.println("Class I");
       else if(avg>=50)
         System.out.println("Class II");
       else if(avg>=35)
         System.out.println("pass");
       else
          System.out.println("fail");
    }
}
 