import java.util.Scanner;

class ReverseNum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter N : "); 
		int n=sc.nextInt();
		int reverseNum=0;

		while(n > 0){
			int digit = n%10;
			reverseNum = (reverseNum*10) + digit;
			n /= 10;
		} 
		
		System.out.print("Reverse Num : " + reverseNum);	
		
	}
}