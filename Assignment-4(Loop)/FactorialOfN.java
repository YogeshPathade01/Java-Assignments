import java.util.Scanner;

class FactorialOfN {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a N : ");
		int n = sc.nextInt();

		int fact = 1;

		for(int i=n; i>=1; i--)
			fact *= i;

		System.out.println("Factorial Of " + n + " : "+fact);
	}
}