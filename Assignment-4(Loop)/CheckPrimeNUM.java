import java.util.Scanner;

public class CheckPrimeNUM {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a N : ");
		int n = sc.nextInt();
		boolean flag = true;
		
		if (n <= 1) {
            		flag = false;
        	} 
        	else if (n == 2 || n == 3) {
            		flag = true;
        	} 
        	else if (n % 2 == 0 || n % 3 == 0) {
            		flag = false;
        	} 
        	else {
            		for (int i = 5; i <= Math.sqrt(n); i += 6) {
                		if (n % i == 0 || n % (i + 2) == 0) {
                    			flag = false;
                    			break;
                		}
            		}
        	}

		if (flag)
              		System.out.println("Prime !!");
        	else
            		System.out.println("Not Prime !!");
	}
}