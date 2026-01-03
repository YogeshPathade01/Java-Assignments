import java.util.Scanner;

class CalculateSumXtoY {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a x : ");
		int x = sc.nextInt();

		System.out.print("Enter a Y : ");
		int y = sc.nextInt();

		int sum = 0;
		
		for(int i=x; i<=y; i++)
			sum+=i;

		System.out.println("The Sum of X to Y : " + sum);
	}
}