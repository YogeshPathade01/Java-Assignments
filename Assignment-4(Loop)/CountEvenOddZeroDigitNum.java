import java.util.Scanner;

class CountEvenOddZeroDigitNum {
	public static void main(String... args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter N : "); 
		int n=sc.nextInt();
		int evenCount=0;
		int oddCount=0;
		int zeroCount=0;

		while(n > 0){
			int digit = n%10;
			if(digit == 0)
				zeroCount++;
			else if(digit%2 == 0)
				evenCount++;
			else
				oddCount++;
			n /= 10;
		} 
		
		System.out.println("Count of even digit : " + evenCount);
		System.out.println("Count of odd digit : " + oddCount);
		System.out.println("Count of zero digit : " + zeroCount);	
		
	}
}