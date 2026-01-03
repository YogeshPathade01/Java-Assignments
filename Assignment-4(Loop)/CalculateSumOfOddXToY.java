import java.util.Scanner;

class CalculateSumOfOddXToY {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a x : ");
		int x = sc.nextInt();

		System.out.print("Enter a Y : ");
		int y = sc.nextInt();

		int sum = 0;
		
		for(int i=x; i<=y; i++){
			if(i%2 != 0)
			sum += i;
		}

		System.out.println("The Sum OF x AND y : " + sum);
		
		
	}
}