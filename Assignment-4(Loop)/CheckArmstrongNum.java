import java.util.Scanner;

class CheckArmstrongNum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter N : "); 
		int n=sc.nextInt();
		int num = n;
		int sum = 0;

		while(n > 0){
			int digit = n%10;
			sum += digit*digit*digit;
			n /= 10;
		}

		if(num == sum)  
			System.out.print("Num is Armstrong Number !!");
		else
			System.out.print("Num is not Armstrong Number !!");		
		
	}
}