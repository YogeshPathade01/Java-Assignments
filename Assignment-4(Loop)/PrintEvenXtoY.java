import java.util.Scanner;

class PrintEvenXtoY {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a x : ");
		int x = sc.nextInt();

		System.out.print("Enter a Y : ");
		int y = sc.nextInt();
		
		System.out.println("Even Number " + x + " to " + y );
		for(int i=x; i<=y; i++){
			if(i%2 == 0)
			System.out.println(i);
		}
	}
}
