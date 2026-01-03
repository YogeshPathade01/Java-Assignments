import java.util.Scanner;

class PrintDigitOfNum {
	public static void main(String... args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter N : "); 
		int n=sc.nextInt();

		while(n > 0){
			int digit = n%10;
			System.out.println(digit);
			n /= 10;
		} 
			
		
	}
}