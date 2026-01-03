import java.util.Scanner;
public class VowelCon{
   public static void main(String[] agrs)
   {  
    char ch;
    System.out.println("enter the character :");
    Scanner sc=new Scanner(System.in);
    ch=sc.next().charAt(0);
   
    if(ch=='a' || ch=='e' || ch=='u' ||ch=='o' || ch=='i')
      System.out.println("character is vowel:");
    else
      System.out.println("character is constant:");
   }
}
