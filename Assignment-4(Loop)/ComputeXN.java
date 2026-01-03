import java.util.Scanner;

class ComputeXN {
	public static void main(String... args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter X : "); 
		int x=sc.nextInt();

		System.out.print("Enter N : "); 
		int n=sc.nextInt();

		System.out.println("Compute X^N : " + (x^n));
		
	}
}