class CalculateSumOfOdd100to150 {
	public static void main(String... args) {
		
		int sum = 0;

		for(int i=100; i<=150; i++) {
			if(i%2 != 0)
			sum+=i;
		}
		
		System.out.println("The Sum of 1oo to 150 odd number : " +sum);
	}
}