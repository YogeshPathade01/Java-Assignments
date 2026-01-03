import java.util.Scanner;

class CountNumDigit {
	public static void main(String... args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter N : "); 
		int n=sc.nextInt();
		int count=0;

		while(n > 0){
			int digit = n%10;
			count++;
			n /= 10;
		} 
		
		System.out.print("Count Digit of Num : " + count);	
		
	}
}