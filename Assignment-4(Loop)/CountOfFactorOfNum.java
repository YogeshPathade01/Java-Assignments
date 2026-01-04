import java.util.Scanner;

public class CountOfFactorOfNum {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a N : ");
		int n = sc.nextInt();
		int count = 0;

		for(int i=1; i <= n; i++) {
			if(n%i == 0)
				count++;
		}

		System.out.println("The Count Of Factor Of Num : " + count);
	}
}