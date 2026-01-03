import java.util.Scanner;

class SumOfDigitOfNum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter N : "); 
		int n=sc.nextInt();
		int sum=0;

		while(n > 0){
			int digit = n%10;
			sum += digit;
			n /= 10;
		} 
		
		System.out.print("Sum of digit of num : " + sum);	
		
	}
}