import java.util.Scanner;

class SumOfFactorOfNum {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a N : ");
		int n = sc.nextInt();
		int sum = 0;

		for(int i=1; i <= n; i++) {
			if(n%i == 0)
				sum += i;
		}

		System.out.println("The Sum Of Factor Of Num : " + sum);
	}
}