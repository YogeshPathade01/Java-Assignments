import java.util.Scanner;

class CheckPalindromeNum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter N : "); 
		int n=sc.nextInt();
		int reverseNum=0;
		int num = n;

		while(n > 0){
			int digit = n%10;
			reverseNum = (reverseNum*10) + digit;
			n /= 10;
		}

		if(num == reverseNum)  
			System.out.print("Num is Palindrome !!");
		else
			System.out.print("Num is not Palindrome !!");		
		
	}
}