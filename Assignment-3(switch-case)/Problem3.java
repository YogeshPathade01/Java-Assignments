import java.util.Scanner;

class Test {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a X : ");
		int x = sc.nextInt();

		
		System.out.print("Enter a Y : ");
		int y = sc.nextInt();
		System.out.println();

		System.out.println("1:Equality");
		System.out.println("2:Less Than");
		System.out.println("3:Quotient And Remainder");
		System.out.println("4:Range");
		System.out.println("5:Swap");

		System.out.print("Enter a Choice : ");
		int choice = sc.nextInt();

		switch(choice) {
			case 1:
			      System.out.println((x == y)? "X is equal to Y" : "X is not Equal to Y");
			      break;
			case 2:
			      System.out.println((x < y)? "X is less than Y" : "X is greater than  Y");
			      break;
			case 3:
			      if (y != 0) {
    			      	int quotient = x / y;
            		      	int rem = x % y;
    			      	System.out.println("Quotient : " + quotient);
                              	System.out.println("Remainder : " + rem);
                              } else {
                              	System.out.println("Cannot divide by zero");
                              }
			      break;
			case 4:
			      System.out.print("Enter a Number : ");
			      int n = sc.nextInt();
			      int min = Math.min(x, y);
                              int max = Math.max(x, y);
			      System.out.println((n >= min && n <= max)? n + " lies between X and Y" : n + " not lies between X and Y");
			      break;
			case 5:
			      int temp = x;
			      x = y;
			      y = temp;
			      System.out.println("X : " + x + " || " +  "Y : " + y);
			      break;
			default :
			      System.out.println("Invalid Choice !!");
		}
	}
}			 
		

		

		
