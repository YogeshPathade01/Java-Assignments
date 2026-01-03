import java.util.Scanner;
public class CheckCharacter{
   public static void main(String[] args)
   {
     char ch;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter character");
     ch=sc.next().charAt(0);

     if(ch>='a' && ch<='z')
         System.out.println((char)(ch-32));
    else if(ch>='A' && ch<='Z')
         System.out.println((char)(ch+32));
    else
         System.out.println("this is not character");
    }
} 