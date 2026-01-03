import java.util.Scanner;

class Test {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a x : ");
		int x = sc.nextInt();

		System.out.print("Enter a Y : ");
		int y = sc.nextInt();
		
		for(int i=x; i<=y; i++)
			System.out.println(i);
	}
}