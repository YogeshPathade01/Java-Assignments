import java.util.Scanner;

public class Problem2 {
	public static void main(String... args){
		
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		char c = sc.next().charAt(0);
		int b = sc.nextInt();

		switch(c){

			case '+':
				System.out.println(a + " " + c + " " + b + " = " + (a + b));
				break;
			case '-':
				System.out.println(a + " " + c + " " + b + " = " + (a - b));
				break;
			case '*':
				System.out.println(a + " " + c + " " + b + " = " + (a * b));
				break;
			case '/':
				System.out.println(a + " " + c + " " + b + " = " + (a / b));
				break;
			default :
				System.out.println("Invalid !!");
		}
	}
}
				
				