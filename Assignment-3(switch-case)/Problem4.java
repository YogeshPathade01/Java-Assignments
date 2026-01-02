import java.util.Scanner;

class Test {
	public static void main(String... args){
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a Redius : ");
		float r = sc.nextFloat();
		System.out.println();

		System.out.println("1:Area Of Circle ");
		System.out.println("2:Circumference Of Circle ");
		System.out.println("3:Volume Of Sphere ");
		
		System.out.print("Enter a Choice : ");
		int choice = sc.nextInt();
	
		switch(choice) {
			case 1:
				double area = Math.PI * r * r;
				System.out.println("Area of circle : " + area);
				break;
			case 2:
				double circum = 2 * Math.PI * r;
				System.out.println("Circumference of circle : " + circum );
				break;
			case 3: 
				double volume = (4.0 / 3) * Math.PI * r * r * r;
				System.out.println("Volume Of Sphere : " + volume);
				break;
			default :
				System.out.println("Invalid Choice !!");
		}
	}
}
								

	
