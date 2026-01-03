import java.util.Scanner;

class CalculateSumOfOdd1toN {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a N : ");
		int n = sc.nextInt();
		
		int sum = 0;

		for(int i=1; i<=n; i++) {
			if(i%2 != 0)
			sum+=i;
		}
		
		System.out.println("The Sum of 1 to " + n + " odd number : " +sum);
	}
}